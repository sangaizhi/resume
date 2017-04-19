<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0,
        user-scalable=no" />
<meta name="format-detection" content="telephone=no" />
</head>
<title></title>
<link rel="stylesheet" href="js/layui/css/layui.css">
<link href="css/style.css" rel="stylesheet">
<link href="css/style-responsive.css" rel="stylesheet">
</head>
<body class='content-body'>
		<!-- page heading start-->
		<div class="page-heading">
			<ol class="breadcrumb">
				<li><a href="#">用户管理</a></li>
				<li class="active">新增用户</li>
			</ol>
		</div>
		<!-- page heading end-->

		<!--body wrapper start-->
		<div class="wrapper">
			<div class="row">
				<div class="col-lg-12">
					<section class="panel"> <header class="panel-heading">
					新增用户 </header>
					<div class="panel-body">
						<div class="form">
							<form class="cmxform form-horizontal adminex-form"
								id="add-user-form" method="POST" action="/user/addSubmit.action">
								<div class="form-group ">
									<label for="name" class="control-label col-lg-1">名称</label>
									<div class="col-lg-3">
										<input class=" form-control" id="name" name="name"
											type="text" />
									</div>
								</div>
								<div class="form-group ">
									<label for="phone" class="control-label col-lg-1">电话</label>
									<div class="col-lg-3">
										<input class=" form-control" id="phone" name="phone"
											type="text" />
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-offset-1 col-lg-10">
										<button class="btn btn-primary" type="button"
											onclick="addUserForm.addSubmit(this)">保存</button>
										<button class="btn btn-default" type="reset">清空</button>
									</div>
								</div>
							</form>
						</div>
					</div>
					</section>
				</div>
			</div>
		</div>
</body>
<!-- Placed js at the end of the document so the pages load faster -->
<!-- Placed js at the end of the document so the pages load faster -->
<script src="js/jquery-1.10.2.min.js"></script>
<script src="js/jquery-ui-1.9.2.custom.min.js"></script>
<script src="js/jquery-migrate-1.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.nicescroll.js"></script>
<script src="js/layui/lay/dest/layui.all.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/jquery.validate.extend.js"></script>
<script type="text/javascript" src="js/form.ajax.plugin.js"></script>
<script type="text/javascript" src="js/validate.js"></script>


<!--common scripts for all pages-->
<script src="js/scripts.js"></script>
<script>
	var layer = layui.layer;
	var addUserForm = {
		checkInputs : function() {
			var name = $.trim($("#name").val());
			var phone = $.trim($("#phone").val());
			if (name == '' || name == null || name == undefined) {
				layer.alert("名称不能为空", {
					icon : 0
				}, function(index) {
					layer.close(index);
				})
				return false;
			}
			if(phone == '' || phone == null || phone == undefined){
				layer.alert("电话不能为空", {
					icon : 0
				}, function(index) {
					layer.close(index);
				})
				return false;
			}
			if(!sazValidate.phone(phone)){
				layer.alert("电话格式错误", {
					icon : 0
				}, function(index) {
					layer.close(index);
				})
				return false;
			}
			return true;
		},
		addSubmit : function(submitBtn) {
			$("#add-user-form").ajaxSubmit({
				beforeSend : function() {
					$(submitBtn).attr("disabled", "disabled");
					$(submitBtn).addClass("disabled");
					return addUserForm.checkInputs();
				},
				success : function(result) {
					addUserForm.submitSuccess(result);
				},
				complete : function() {
					$(submitBtn).removeAttr("disabled");
					$(submitBtn).removeClass("disabled")
				}
			});
		},
		submitSuccess:function(data){
			if(data.status){
				layer.alert("新增用户成功", {
					icon : 0
				}, function(index) {
					layer.close(index);
					location.href="/user/list-user.html";
				})
			}else{
				layer.alert(data.message, {
					icon : 0
				}, function(index) {
					layer.close(index);
				})
			}
		}
	}

	$(document).ready(function() {
		$("#add-user-form").validate({
			rules : {
				name : {
					required : true,
				},
				phone : {
					required : true,
					phone : true,
					remote : {
						url : "/user/check/phone.action",
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
					}
				}
			},
			messages : {
				name : {
					required : "用户名不能为空",
				},
				phone : {
					required : "电话不能为空",
					remote : "该电话已经被占用"
				}
			}
		});
	});
</script>
</html>