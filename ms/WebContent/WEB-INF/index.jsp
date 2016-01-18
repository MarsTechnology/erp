<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
   <script src="${pageContext.request.contextPath}/webresource/jQuery/jquery.min.js"></script>
   <script src="${pageContext.request.contextPath}/webresource/bootstrap/js/bootstrap.min.js"></script>
   <link href="${pageContext.request.contextPath}/webresource/bootstrap/css/bootstrap.min.css" rel="stylesheet"></link>
<script type="text/javascript">
	$(document).ready(function() {
		
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

      <form class="form-signin" method="get" action="${pageContext.request.contextPath}/validate">
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4 col-md-4 col-md-offset-4"><h2 align="center">登录</h2></div>
		</div>
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4 col-md-4 col-md-offset-4">
				<input type="text" id="username" name="username" class="form-control" placeholder="请输入用户名" required autofocus>
			</div>
		</div>
        <div class="row">
			<div class="col-sm-4 col-sm-offset-4 col-md-4 col-md-offset-4">
				<input type="password" id="password" name="password" class="form-control" placeholder="请输入密码" required>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4 col-md-2 col-md-offset-4 checkbox">
				 <label>
					<input type="checkbox" value="remember-me"> 记住我一周
				  </label>
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4 col-md-4 col-md-offset-4 ">
				<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-2 col-sm-offset-7 col-md-2 col-md-offset-7">
				<a href="#"> 忘记密码</a>
			</div>
		</div>
      </form>

    </div> <!-- /container -->
</body>
</html>
