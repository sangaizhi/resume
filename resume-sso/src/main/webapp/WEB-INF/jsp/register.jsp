
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<meta name="description" content="">
<meta name="author" content="ThemeBucket">
<link rel="shortcut icon" href="#" type="image/png">

<title>Registration</title>

<link href="../js/layui/css/layui.css" rel="stylesheet">
<link href="../css/style.css" rel="stylesheet">
<link href="../css/style-responsive.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
        <script src="../js/html5shiv.js"></script>
        <script src="../js/respond.min.js"></script>
        <![endif]-->
</head>

<body class="login-body">

	<div class="container">

		<form class="form-signin cmxform form-horizontal adminex-form"
			id="register-form" action="../user/register.action" method="POST">
			<div class="form-signin-heading text-center">
				<h1 class="sign-title">注册</h1>
				<img src="../images/login-logo.png" alt="" />
			</div>
			<div class="login-wrap">
				<div class="form-group ">
					<label for="name" class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-3 padl0 text-r">用户名</label>
					<div class=" col-lg-9 col-md-9 col-sm-9 col-xs-9">
						<input type="text" id="name" name="name" autofocus=""
							placeholder="用户名" class="form-control">
					</div>
				</div>
				<div class="form-group ">
					<label for="phone" class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-3 padl0 text-r">手机号</label>
					<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
						<input type="text" id="phone" name="phone" autofocus=""
							placeholder="手机号" class="form-control">
					</div>
				</div>
				<div class="form-group ">
					<label for="password" class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-3 padl0 text-r">密码</label>
					<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
						<input type="password" id="password" name="password"
							placeholder="密码" class="form-control">
					</div>
				</div>
				<div class="form-group ">
					<label for="confirmPassword"
						class="control-label col-lg-3 col-md-3 col-sm-3 col-xs-3 padl0 text-r">确认密码</label>
					<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9">
						<input type="password" id="confirmPassword" name="confirmPassword"
							placeholder="确认密码" class="form-control">
					</div>
				</div>
				<label class="checkbox"> <input id="protocol"
					type="checkbox" value="agree this condition"> <label
					for="protocol"> 我已阅读并同意<a href="#" class="blue">《resume用户注册协议》</a></label>
				</label>
				<button type="submit" id="submit"
					class="btn btn-lg btn-login btn-block" disabled
					onclick="register.addSubmit()">
					<i class="fa fa-check"></i>
				</button>

				<div class="registration">
					已有账号. <a href="../page/login.html" class=""> 登录 </a>
				</div>
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
		var layer = layui.layer;
		var register = {
			autoCheck : function() {
				var name = $.trim($("#name").val());
				var phone = $.trim($("#phone").val());
				var password = $.trim($("#password").val());
				var protocol = $('#protocol').is(':checked')
				var confirmPassword = $.trim($("#confirmPassword").val());

				if (name == '' || name == null || name == undefined) {
					return false;
				}
				if (phone == '' || phone == null || phone == undefined) {
					return false;
				}
				if (!resumeValidate.phone(phone)) {
					return false;
				}
				if (password == '' || password == null || password == undefined) {
					return false;
				}
				if (confirmPassword == '' || confirmPassword == null
						|| confirmPassword == undefined) {
					return false;
				}
				if (confirmPassword != password) {
					return false;
				}

				if (!protocol) {
					return false;
				}
				return true;
			},
			checkInputs : function() {
				var name = $.trim($("#name").val());
				var phone = $.trim($("#phone").val());
				var password = $.trim($("#password").val());
				var confirmPassword = $.trim($("#confirmPassword").val());
				if (name == '' || name == null || name == undefined) {
					layer.alert("名称不能为空", {
						icon : 0
					}, function(index) {
						layer.close(index);
					})
					return false;
				}
				if (phone == '' || phone == null || phone == undefined) {
					layer.alert("电话不能为空", {
						icon : 0
					}, function(index) {
						layer.close(index);
					})
					return false;
				}
				if (!resumeValidate.phone(phone)) {
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
				if (confirmPassword == '' || confirmPassword == null
						|| confirmPassword == undefined) {
					layer.alert("确认密码不能为空", {
						icon : 0
					}, function(index) {
						layer.close(index);
					});
					return false;
				}
				if (confirmPassword != password) {
					layer.alert("两次输入的密码不一致", {
						icon : 0
					}, function(index) {
						layer.close(index);
					});
					return false;
				}
				var protocol = $("#protocol").is(":checked");
				if (!protocol) {
					layer.alert("没有确认使用协议", {
						icon : 0
					}, function(index) {
						layer.close(index);
					});
					return false;
				}
				return true;
			},
			addSubmit : function(submitBtn) {
				$("#register-form").ajaxSubmit({
					beforeSend : function() {
						$(submitBtn).attr("disabled", "disabled");
						$(submitBtn).addClass("disabled");
						return register.checkInputs();
					},
					success : function(result) {
        				console.log(result);
						register.submitSuccess(result);
					},
					complete : function() {
						$(submitBtn).removeAttr("disabled");
						$(submitBtn).removeClass("disabled")
					}
				});
			},
			submitSuccess : function(data) {
				if (data.status) {
					layer.alert("新增用户成功", {
						icon : 1
					}, function(index) {
						layer.close(index);
						location.href = "../page/login.html";
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
			$("#name").on("change", function() {
				var isOk = register.autoCheck();
				if (isOk) {
					$("#submit").attr("disabled", false);
				}
			});
			$("#phone").on("change", function() {
				var isOk = register.autoCheck();
				if (isOk) {
					$("#submit").attr("disabled", false);
				}
			});
			$("#password").on("change", function() {
				var isOk = register.autoCheck();
				if (isOk) {
					$("#submit").attr("disabled", false);
				}
			});
			$("#confirmPassword").on("change", function() {
				var isOk = register.autoCheck();
				if (isOk) {
					$("#submit").attr("disabled", false);
				}
			});
			$("#protocol").on("change", function() {
				var isOk = register.autoCheck();
				console.log(isOk);
				if (isOk) {
					$("#submit").attr("disabled", false);
				}
			});

			$("#register-form").validate({
				rules : {
					name : {
						required : true,
						remote : {
							url : "/user/check/1.action",
							type : "post",
							data : {
								account : function() {
									var account = $("#name").val();
									if (account == undefined) {
										account = -1;
									}
									return account;
								}
							}
						}
					},
					phone : {
						required : true,
						phone : true,
						remote : {
							url : "/user/check/2.action",
							type : "post",
							data : {
								account : function() {
									var account = $("#phone").val();
									if (account == undefined) {
										account = -1;
									}
									return account;
								}
							}
						},
					},
					password : {
						required : true,
						maxlength : 20

					},
					confirmPassword : {
						required : true,
						maxlength : 20,
						equalTo : "#password"
					}
				},
				messages : {
					name : {
						required : "用户名不能为空",
                        remote : "该用户名已经被占用"
					},
					phone : {
						required : "电话不能为空",
						remote : "该电话已经被占用"
					},
					password : {
						required : "密码不能为空",
						maxlength : "密码不能超过20个字符"

					},
					confirmPassword : {
						required : "密码不能为空",
						maxlength : "密码不能超过20个字符",
						equalTo : "两次输入的密码不一致"
					}
				}
			});
		});
	</script>
</body>
</html>
