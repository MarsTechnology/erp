<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h>添加用户</h>
	<form name="userForm" action="/ms/rbac/addUser" method="post">
		姓名：<input type="text" name=username>
		年龄：<input type="text" name="password">
		
		<input type="button" value="添加" onclick="addUser()">
		
	
	</form>
</body>

<script type="text/javascript">
	function addUser(){
		var form = document.forms[0];
		form.submit();
	}
</script>
</html>