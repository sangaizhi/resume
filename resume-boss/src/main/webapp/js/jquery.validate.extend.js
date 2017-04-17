/**
 * jquery validate  扩展 
 */
var view = '';
$.validator.addMethod("phone", function (value, element, $view) {
    var phoneNum = $.trim(value);
    var length = phoneNum.length;
    if (11 != Number(length)) {
    	view = '你输入的手机号码位数有误';
    } else {
    	view = '你输入的手机号码无效';
    }

    var reg = /^1[3|4|5|7|8][0-9]{9}$/; //验证规则
    return this.optional(element) || (reg.test(value));
}, '输入的电话号码格式有误');