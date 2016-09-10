<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
<title>userInfo</title>
</head>
<body>
	用户信息 昵称： ${userInfo.username} 用户id：${userInfo.uid}  注册时间：
	<fmt:formatDate value="${userInfo.createDate }" pattern="yyyy-MM-dd HH:mm:ss" />

	<br /> ajax显示全部用户信息：
	<div id="show_all_user"></div>
</body>
<script type="text/javascript">
	$.ajax({
		type : "get",
		url : "user/showInfos.htmls",
		dataType : "json",
		success : function(data) {
			$(data).each(
					function(i, user) {
						var p = "<p>昵称:" + user.username + "        注册时间:"
								+ user.createDate + "    id:" + user.uid +
						"</p>";
						$("#show_all_user").append(p);
					});
		},
		async : true
	});
</script>
</html>