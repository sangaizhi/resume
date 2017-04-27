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
<!--icheck-->
<link href="../js/iCheck/skins/minimal/minimal.css" rel="stylesheet">
<link href="../js/iCheck/skins/square/square.css" rel="stylesheet">
<link href="../js/iCheck/skins/square/red.css" rel="stylesheet">
<link href="../js/iCheck/skins/square/blue.css" rel="stylesheet">

<!--dashboard calendar-->
<link href="../css/clndr.css" rel="stylesheet">


<!--common-->
<link href="../css/style.css" rel="stylesheet">
<link href="../css/style-responsive.css" rel="stylesheet">
</head>
<body class='sticky-header'>
	<jsp:include page="navigation.jsp"></jsp:include>
	<div class="main-content">
		<jsp:include page="header.jsp"></jsp:include>
		<iframe src="" id="content-iframe" style="width: 100%; height: 100%; position: fixed; top: 51px; z-index: 99;"></iframe>
	</div>
</body>
<!-- Placed js at the end of the document so the pages load faster -->
<script src="../js/jquery-1.10.2.min.js"></script>
<script src="../js/jquery.cookie.js"></script>
<script src="../js/jquery.extends.js"></script>
<script src="../js/jquery-ui-1.9.2.custom.min.js"></script>
<script src="../js/jquery-migrate-1.2.1.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/jquery.nicescroll.js"></script>

<!--common scripts for all pages-->
<script src="../js/routes.js"></script>
<script src="../js/scripts.js"></script>
<script src="../js/resume.js"></script>
<script src="../js/common-util.js"></script>
<script>

	function toggleContentFrame(href) {
		$("#content-iframe").attr("src", href);
	}
	$(document).ready(function() {
		$(".nav-href").click(function(){
			var href = $(this).data("href");
			toggleContentFrame(href);
		});
		$("#logout").click(function() {
			var currentHref = window.top.location.href;
			var newHref = resumeUrl.addParam(route.system.loginPage, "redirectUrl", currentHref);
			resumeWindow.redirectTopWindow(newHref);

		});
	});
</script>
</html>