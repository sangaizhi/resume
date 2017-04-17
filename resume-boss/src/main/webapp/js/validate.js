/**
 * 验证js
 */
var sazValidate = {
	/**
	 * 手机验证
	 */
	phone : function(obj) {
		if (obj == '' || obj == null || obj == undefined) {
			return false;
		}
		var reg = /^1[3|4|5|7|8][0-9]{9}$/;
		return reg.test(obj);
	}
}