<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0,
        user-scalable=no" />
<meta name="format-detection" content="telephone=no" />
<title>用户列表</title>
</head>
<!--data table-->
<link rel="stylesheet" href="../js/data-tables/DT_bootstrap.css" />

<link href="../css/style.css" rel="stylesheet">
<link href="../css/style-responsive.css" rel="stylesheet">

</head>
<body class='sticky-header'>
	<jsp:include page="navigation.jsp"></jsp:include>
	<div class="main-content">
		<jsp:include page="header.jsp"></jsp:include>

		<!-- page heading start-->
		<div class="page-heading">
			<ul class="breadcrumb">
				<li><a href="#">用户管理</a></li>
				<li class="active">用户列表</li>
			</ul>
		</div>
		<!-- page heading end-->

		<!--body wrapper start-->
		<div class="wrapper">
			<div class="row">
				<div class="col-sm-12">
					<section class="panel"> <header class="panel-heading">
					用户列表 <span class="tools pull-right"> <a href="javascript:;"
						class="fa fa-chevron-down"></a> <a href="javascript:;"
						class="fa fa-times"></a>
					</span> </header>
					<div class="panel-body">
						<div class="adv-table editable-table ">
							<div class="clearfix">
								<div class="btn-group">
									<a href="/add-user.html" id="editable-sample_new"
										class="btn btn-primary"> 新增<i class="fa fa-plus"></i>
									</a>
								</div>
								<div class="btn-group pull-right">
									<button class="btn btn-default dropdown-toggle"
										data-toggle="dropdown">
										Tools <i class="fa fa-angle-down"></i>
									</button>
									<ul class="dropdown-menu pull-right">
										<li><a href="#">Print</a></li>
										<li><a href="#">Save as PDF</a></li>
										<li><a href="#">Export to Excel</a></li>
									</ul>
								</div>
							</div>
							<div class="space15"></div>
							<table class="table table-striped table-hover table-bordered"
								id="editable-sample">
								<thead>
									<tr>
										<th>操作</th>
										<th>姓名</th>
										<th>昵称</th>
										<th>电话</th>
										<th>邮箱</th>
										<th>性别</th>
										<th>创建时间</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list}" var="user">
										<tr>
											<td></td>
											<td>${user.name }</td>
											<td>${user.nickName }</td>
											<td>${user.phone }</td>
											<td>${user.email }</td>
											<td>${user.sex }</td>
											<td><fmt:formatDate value="${user.createTime}" pattern="yyyy-MM-dd hh:mm:ss" /></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
					</section>
				</div>
			</div>
		</div>
		<!--body wrapper end-->
	</div>
	<script src="../js/jquery-1.10.2.min.js"></script>
	<script src="../js/jquery-ui-1.9.2.custom.min.js"></script>
	<script src="../js/jquery-migrate-1.2.1.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/modernizr.min.js"></script>
	<script src="../js/jquery.nicescroll.js"></script>

	<!--data table-->
	<script type="text/javascript"
		src="../js/data-tables/jquery.dataTables.js"></script>
	<script type="../text/javascript" src="js/data-tables/DT_bootstrap.js"></script>

	<!--common scripts for all pages-->
	<script src="../js/scripts.js"></script>

	<!--script for editable table-->

	<!-- END JAVASCRIPTS -->
	<script>
		$(document).ready(function() {
		});
	</script>
</body>
</html>