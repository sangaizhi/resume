/********************************************
 * 文件名称: LoginController
 * 系统名称: sangaizhi
 * 模块名称:
 * 软件版权: 深圳中云创科技有限公司
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: saz
 * 开发时间: 2017/4/7
 * 审核人员:
 * 相关文档:
 * 修改记录: 修改日期    修改人员    修改说明
 **/
package org.sangaizhi.resume.boss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录ctr
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/loginPage")
    public String showLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(String account, String password, String type){
        return "redirect:/index.html";
    }
}
