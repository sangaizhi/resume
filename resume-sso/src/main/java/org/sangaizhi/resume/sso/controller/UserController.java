/**
 * 文件名称: UserController
 * 系统名称: workspace
 * 模块名称:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/3/16 22:14
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.resume.sso.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.sangaizhi.resume.commons.constant.AccountTypeEnum;
import org.sangaizhi.resume.commons.util.CookieUtils;
import org.sangaizhi.resume.commons.util.ExceptionUtil;
import org.sangaizhi.resume.commons.vo.ResumeResult;
import org.sangaizhi.resume.sso.service.SSOUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * UserController
 */
@RequestMapping("/user")
@Controller
public class UserController
{
    
    @Autowired
    private SSOUserService SSOUserService;
    
    @RequestMapping(value = "/check/{type}", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
    @ResponseBody
    public boolean check(String account, @PathVariable Short type)
    {
        // 参数校验
        ResumeResult result = null;
        if (StringUtils.isBlank(account))
        {
            return false;
        }
        if (null == type)
        {
            return false;
        }
        if (!Objects.equals(AccountTypeEnum.NAME.getValue(), type)
            && !Objects.equals(AccountTypeEnum.PHONE.getValue(), type)
            && !Objects.equals(AccountTypeEnum.EMAIL.getValue(), type))
        {
            return false;
        }
        try
        {
            result = SSOUserService.checkUserData(account, type);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            result = ResumeResult.build(false, ExceptionUtil.getStackTrace(e));
        }
        return result.getStatus();
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ResumeResult register(@RequestParam("name") String name, @RequestParam("phone") String phone,
        @RequestParam("password") String password, @RequestParam("confirmPassword") String confirmPassword)
    {
        if (StringUtils.isBlank(name))
        {
            return ResumeResult.build(false, "用户名不能为空");
        }
        ResumeResult result = SSOUserService.checkUserData(name, AccountTypeEnum.NAME.getValue());
        if (!result.getStatus())
        {
            return ResumeResult.build(false, "用户名已被占用");
        }
        if (StringUtils.isBlank(phone))
        {
            return ResumeResult.build(false, "电话不能为空");
        }
        result = SSOUserService.checkUserData(phone, AccountTypeEnum.PHONE.getValue());
        if (!result.getStatus())
        {
            return ResumeResult.build(false, "电话已被占用");
        }
        if (StringUtils.isBlank(password))
        {
            return ResumeResult.build(false, "密码不能为空");
        }
        if (!Objects.equals(confirmPassword, password))
        {
            return ResumeResult.build(false, "两次输入的密码不一致");
        }
        try
        {
            SSOUserService.register(name, phone, password);
            return ResumeResult.build(true, "");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ResumeResult.build(false, "注册失败");
        }
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResumeResult login(String username, String password, Short type, HttpServletRequest request,
        HttpServletResponse response)
    {
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password))
        {
            return ResumeResult.build(false, "用户名和密码不能为空");
        }
        try
        {
            ResumeResult result = SSOUserService.userLogin(username, password, type);
            // 设置cookie
            CookieUtils.setCookie(request, response, "RESUME_USER_TOKEN", (String)result.getData());
            return result;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ResumeResult.build(false, ExceptionUtil.getStackTrace(e));
        }
    }
    
    @RequestMapping(value = "/token/{token}")
    @ResponseBody
    public Object getUserInfoByToken(@PathVariable String token, String callback)
    {
        
        if (StringUtils.isBlank(token))
        {
            return ResumeResult.build(false, "获取用户信息失败");
        }
        ResumeResult result = null;
        try
        {
            result = SSOUserService.getUserByToken(token);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            result = ResumeResult.build(false, ExceptionUtil.getStackTrace(e));
        }
        if (StringUtils.isNotBlank(callback))
        {
            MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
            mappingJacksonValue.setJsonpFunction(callback);
            return mappingJacksonValue;
        }
        else
        {
            return result;
        }
        
    }
    
    @RequestMapping(value = "/logout/{token}")
    @ResponseBody
    public Object logout(@PathVariable String token, String callback)
    {
        ResumeResult result = null;
        if (StringUtils.isBlank(token))
        {
            return ResumeResult.build(false, "参数不合法");
        }
        try
        {
            result = SSOUserService.userLogout(token);
        }
        catch (Exception e)
        {
            result = ResumeResult.build(false, ExceptionUtil.getStackTrace(e));
        }
        if (StringUtils.isNotBlank(callback))
        {
            MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
            mappingJacksonValue.setJsonpFunction(callback);
            return mappingJacksonValue;
        }
        else
        {
            return result;
        }
    }
    
}
