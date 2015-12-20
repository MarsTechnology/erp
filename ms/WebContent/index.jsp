<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
   <script src="./jQuery/jquery.min.js"></script>
   <script src="./bootstrap/js/bootstrap.min.js"></script>
   <link href="./bootstrap/css/bootstrap.min.css" rel="stylesheet"></link>
<style type="text/css">
.cover {
	position: fixed;
	top: 0px;
	right: 0px;
	bottom: 0px;
	filter: alpha(opacity = 60);
	background-color: #777;
	z-index: 1002;
	left: 0px;
	display: none;
	opacity: 0.5;
	-moz-opacity: 0.5;
}
</style>
<script type="text/javascript">
	$(document).ready(function() {
		$("#go").on('click', function() {
			alert("请登录");
			$("#username").focus();
		});
		$("#register").on('click', function() {
			 
			
		});
		$("#save").on('click', function() {
			 var username = $("#username").val();
			 var password = $("#password").val();
			 var email = $("#email").val();
			var user={};
			user.userName = username;
			user.password = password;
			user.email = email;
			$.ajax({
				type : "POST",
				url : "/data/user",
				data : user,
				dataType : "json",
				success : function(result) {
					alert(result);
				},
				error : function(result) {
					alert("error");
				}
			});
		});
		$("#cancle").on('click', function() {
			 
		});
		
	});
</script>
</head>
<body role="document">
	<!-- Fixed navbar -->
	<nav class="navbar  navbar-inverse " role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"> 基于SOA的ERP系统 </a>
			</div>
			<!-- <div id="navbar" class="navbar-collapse collapse">
				<form class="navbar-form navbar-right" method="post" action="/data/user/login">
					<div class="form-group">
						<input type="text" placeholder="Username" class="form-control" id ="username" name="userName">
					</div>
					<div class="form-group">
						<input type="password" placeholder="Password" class="form-control" id="password" name="password">
					</div>
					<button type="submit" class="btn btn-success">登录</button>
				</form>
			</div>
			/.nav-collapse -->
		</div>
	</nav>
	
	<div class="container">

      <form class="form-signin">
        <h2>登录</h2>
        <input type="text" id="username" class="form-control" placeholder="请输入用户名" required autofocus>
        <input type="password" id="password" class="form-control" placeholder="请输入密码" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 记住我一周
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
        <div class="form-group">
		     <a href="#">忘记密码</a>
        </div>
      </form>

    </div> <!-- /container -->
</body>
</html>