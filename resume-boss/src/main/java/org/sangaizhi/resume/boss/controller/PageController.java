/********************************************
 * 文件名称: PageController
 * 系统名称: sangaizhi
 * 模块名称:
 * 软件版权: 深圳中云创科技有限公司
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: saz
 * 开发时间: 2017/4/6
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期    修改人员    修改说明
 **/
package org.sangaizhi.resume.boss.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.sangaizhi.resume.common.vo.UserVO;
import org.sangaizhi.resume.commons.constant.Commons;
import org.sangaizhi.resume.commons.constant.LogTemplate;
import org.sangaizhi.resume.commons.util.CookieUtils;
import org.sangaizhi.resume.commons.util.HttpClientUtil;
import org.sangaizhi.resume.commons.vo.ResumeResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController
{
    
    @Value("${RESUME_USER_INFO_URL}")
    private String RESUME_USER_INFO_URL; // 获取用户信息的地址
    
    @Value("${RESUME_USER_LOGIN_PAGE}")
    private String RESUME_USER_LOGIN_PAGE; // 用户登录页面的地址
    
    private Logger logger = LoggerFactory.getLogger(PageController.class);
    
    @RequestMapping("/{page}")
    public String page(@PathVariable String page)
    {
        return page;
    }
    
    @RequestMapping("/")
    public String index(HttpServletRequest request, HttpServletResponse response, Model model)
    {
//        String token = CookieUtils.getCookieValue(request, Commons.RESUME_USER_COOKIE_TOKEN);
//        if (StringUtils.isNotBlank(token))
//        {
//            RESUME_USER_INFO_URL = RESUME_USER_INFO_URL + token;
//            try
//            {
//                String userInfoStr = HttpClientUtil.doGet(RESUME_USER_INFO_URL, null);
//                if(StringUtils.isBlank(userInfoStr)){
//                    return "redirect:" + RESUME_USER_LOGIN_PAGE;
//                }
//                ResumeResult resumeResult =  ResumeResult.formatToPojo(userInfoStr, ResumeResult.class);
//                if(null == resumeResult || !resumeResult.getStatus()){
//                    return "redirect:" + RESUME_USER_LOGIN_PAGE;
//                }
//                UserVO userVO = (UserVO) resumeResult.getData();
//                model.addAttribute("user", userVO);
//                return "index";
//            }
//            catch (Exception e)
//            {
//                e.printStackTrace();
//                logger.error(LogTemplate.LOG_EXCEPTION_MODEL, "根据token获取用户信息失败", token);
//                return "redirect:" + RESUME_USER_LOGIN_PAGE;
//            }
//        }else{
//            return "redirect:" + RESUME_USER_LOGIN_PAGE;
//        }
        return "index";
    }
    
}
