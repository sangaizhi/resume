/**
 * Created by saz on 2017/4/27.
 */

var constants = {
    tokenTag: "RESUME_USER_COOKIE_TOKEN"
};
var RESUME = {
    checkLogin: function () {
        var _ticket = $.cookie(constants.tokenTag);
        if (!_ticket) {
            return;
        }
        $.getJSONP("http://127.0.0.1:8082/user/token/" + _ticket + "?callback= RESUME.loginCallback");
    },
    loginCallback: function (data) {
        console.log(data.data.name);
        $("#username").append(data.data.name);
    }
};

$(function () {
    // 查看是否已经登录，如果已经登录查询登录信息
    RESUME.checkLogin();
});