/********************************************
 * 文件名称: UserController
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

import java.util.Date;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.sangaizhi.resume.common.qo.UserQO;
import org.sangaizhi.resume.common.service.UserService;
import org.sangaizhi.resume.common.vo.UserVO;
import org.sangaizhi.resume.commons.constant.LogTemplate;
import org.sangaizhi.resume.commons.util.JsonUtils;
import org.sangaizhi.resume.commons.vo.ResumeResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/check/{type}")
    @ResponseBody
    public Boolean check(@PathVariable String type, String account){
        if(StringUtils.isBlank(type)){
            return false;
        }
        if(StringUtils.isBlank(account)){
            return false;
        }
        UserQO userQO = new UserQO();
        if("phone".equals(type.toLowerCase())){
            userQO.setPhone(account);
        }else if("email".equals(type.toLowerCase())){
            userQO.setEmail(account);
        }
        List<UserVO> userVOList = userService.queryList(userQO);
        return CollectionUtils.isEmpty(userVOList);
    }

    @RequestMapping("/addSubmit")
    @ResponseBody
    public ResumeResult addSubmit(UserVO userVO){
        if(null == userVO){
            return ResumeResult.build(false, "新增用户失败");
        }
        userVO.setCreateTime(new Date());
        try{
            userService.save(userVO);
        }catch (Exception e){
            e.printStackTrace();
            logger.error(LogTemplate.LOG_EXCEPTION_MODEL, "新增用户失败", JsonUtils.objectToJson(userVO));
            return ResumeResult.build(false, "新增用户失败");
        }
        return ResumeResult.build(true, "新增用户成功");
    }

    @RequestMapping("/list-user")
    public String list(UserQO condition, Integer pageNum, Integer pageSize, Model model){
        if(null == condition){
            condition = new UserQO();
        }
        condition.setPageNum(pageNum);
        condition.setPageSize(pageSize);
        List<UserVO> list = userService.queryList(condition);
        Long count = userService.count(condition);
        condition.setRecordCount(count);
        model.addAttribute("list", list);
        model.addAttribute("condition", condition);
        return "list-user";
    }
}
