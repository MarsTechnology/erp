<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
 <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="../jQuery/jquery.min.js"></script>
   <script src="../bootstrap/js/bootstrap.min.js"></script>
   <script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
</head>
<body>
<h>添加用户</h>
	<form name="userForm" action="/ms/rbac/addUser" method="post">
		姓名：<input type="text" name=logName>
		年龄：<input type="text" name="groupId">
		
		<input type="button" value="添加" onclick="addUser()">
		
	
	</form>
	
	 <h1>Hello, world!</h1>
	 
	 <div class="dropdown">
   <button type="button" class="btn dropdown-toggle" id="dropdownMenu1" 
      data-toggle="dropdown">
      主题
      <span class="caret"></span>
   </button>
   <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
      <li role="presentation">
         <a role="menuitem" tabindex="-1" href="#">Java</a>
      </li>
      <li role="presentation">
         <a role="menuitem" tabindex="-1" href="#">数据挖掘</a>
      </li>
      <li role="presentation">
         <a role="menuitem" tabindex="-1" href="#">
            数据通信/网络
         </a>
      </li>
      <li role="presentation" class="divider"></li>
      <li role="presentation">
         <a role="menuitem" tabindex="-1" href="#">分离的链接</a>
      </li>
   </ul>
</div>
</body>

<script type="text/javascript">
	function addUser(){
		var form = document.forms[0];
		form.submit();
	}
</script>
</html>

