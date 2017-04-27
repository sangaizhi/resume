<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<meta name="description" content="">
<meta name="author" content="ThemeBucket">
<link rel="shortcut icon" href="#" type="image/png">

<title>Login</title>

<link href="../css/style.css" rel="stylesheet">
<link href="../css/style-responsive.css" rel="stylesheet">
</head>

<body class="login-body">
	<div class="container">
		<form class="form-signin  cmxform form-horizontal adminex-form" id="login-form" action="../user/login.action" method="POST">
			<div class="form-signin-heading text-center">
				<h1 class="sign-title">登录</h1>
				<img src="../images/login-logo.png" alt="" />
			</div>
			<div class="login-wrap">
				<div class="form-group ">
					<label for="account"
						class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-2 padl0 padr0 text-r">账号</label>
					<div class="col-lg-10 col-md-10 col-sm-10 col-xs-10">
						<input type="text" id="account" name="account" autofocus=""
							placeholder="用户名/手机号" class="form-control">
					</div>
				</div>
				<div class="form-group ">
					<label for="password"
						class="control-label col-lg-2 col-md-2 col-sm-2 col-xs-2 padl0 padr0 text-r">密码</label>
					<div class="col-lg-10 col-md-10 col-sm-10 col-xs-10">
						<input type="password" id="password" name="password"
							placeholder="密码" class="form-control">
					</div>
				</div>
				<button type="button" id="submit"
					class="btn btn-lg btn-login btn-block" 
					onclick="login.addSubmit(this)">
					<i class="fa fa-check"></i>
				</button>
				<div class="registration">
					还没有账号? <a class="" href="../page/login.html"> 去注册 </a>
				</div>
				<label class="checkbox"> <input type="checkbox"
					value="remember-me"> Remember me <span class="pull-right">
						<a data-toggle="modal" href="#myModal"> Forgot Password?</a>
				</span>
				</label>
			</div>
		</form>
	</div>
	<!-- Placed js at the end of the document so the pages load faster -->
	<!-- Placed js at the end of the document so the pages load faster -->
	<script src="../js/jquery-1.10.2.min.js"></script>
	<script src="../js/jquery-ui-1.9.2.custom.min.js"></script>
	<script src="../js/jquery-migrate-1.2.1.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/layui/lay/dest/layui.all.js"></script>
	<script src="../js/jquery.validate.min.js" type="text/javascript"></script>
	<script src="../js/jquery.validate.extend.js" type="text/javascript"></script>
	<script src="../js/form.ajax.plugin.js" type="text/javascript"></script>
	<script src="../js/validate.js" type="text/javascript"></script>
	<script>
	var redirectUrl = "${redirectUrl}";
		var layer = layui.layer;
		var login = {
			autoCheck : function() {
				var account = $.trim($("#account").val());
				var password = $.trim($("#password").val());

				if (account == '' || account == account || phone == undefined) {
					return false;
				}
				if (!resumeValidate.phone(account)) {
					return false;
				}
				if (password == '' || password == null || password == undefined) {
					return false;
				}
				return true;
			},
			checkInputs : function() {
				var account = $.trim($("#account").val());
				var password = $.trim($("#password").val());
				if (account == '' || account == null || account == undefined) {
					layer.alert("电话不能为空", {
						icon : 0
					}, function(index) {
						layer.close(index);
					});
					return false;
				}
				if (!resumeValidate.phone(account)) {
					layer.alert("电话格式错误", {
						icon : 0
					}, function(index) {
						layer.close(index);
					})
					return false;
				}
				if (password == '' || password == null || password == undefined) {
					layer.alert("密码不能为空", {
						icon : 0
					}, function(index) {
						layer.close(index);
					});
					return false;
				}
				return true;
			},
			addSubmit : function(submitBtn) {
				$("#login-form").ajaxSubmit({
					beforeSend : function() {
						console.log("beforeSend");
						$(submitBtn).attr("disabled", "disabled");
						$(submitBtn).addClass("disabled");
						return login.checkInputs();
					},
					success : function(result) {
						login.submitSuccess(result);
					},
					complete : function() {
						$(submitBtn).removeAttr("disabled");
						$(submitBtn).removeClass("disabled")
					}
				});
			},
			submitSuccess : function(data) {
				if (data.status) {
					layer.alert("登录成功", {
						icon : 1
					}, function(index) {
						layer.close(index);
						if(redirectUrl == ""){
							location.href = "http://www.baidu.com";
						}
						location.href = redirectUrl;
					})
				} else {
					layer.alert(data.msg, {
						icon : 0
					}, function(index) {
						layer.close(index);
					})
				}
			}
		}
		$(document).ready(function() {
			$("#phone").on("change", function() {
				var isOk = login.autoCheck();
				if (isOk) {
					$("#submit").attr("disabled", false);
				}
			});
			$("#password").on("change", function() {
				var isOk = login.autoCheck();
				if (isOk) {
					$("#submit").attr("disabled", false);
				}
			});
			$("#login-form").validate({
				rules : {
					phone : {
						required : true,
						phone : true
						
					},
					password : {
						required : true,
						maxlength : 20

					},
				},
				messages : {
					phone : {
						required : "电话不能为空",
					},
					password : {
						required : "密码不能为空",
						maxlength : "密码不能超过20个字符"
					}
				}
			});
		});
	</script>
</body>
</html>
