<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="${pageContext.request.contextPath}/webresource/jQuery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/webresource/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/webresource/bootstrap/js/jquery.ztree.all-3.5.min.js"></script>
<script src="${pageContext.request.contextPath}/webresource/bootstrap/js/jquery.dataTables.js"></script>
<link href="${pageContext.request.contextPath}/webresource/bootstrap/css/bootstrap.min.css" rel="stylesheet"></link>
<link href="${pageContext.request.contextPath}/webresource/bootstrap/css/metro.css" rel="stylesheet"></link>
<link href="${pageContext.request.contextPath}/webresource/bootstrap/css/dataTables.bootstrap.css" rel="stylesheet"></link>

<style>
.none-padding {
	padding: 0 !important;
    margin: 0 !important;
}
</style>
</head>
<body>
<script>
$(document).ready(function() {
	
	$("#groupTable").dataTable({
		 
	});
	
});

</script>
<div class="container-fluid none-padding">
 
	<div class="row-fluid " style="height:70%;">
	<button id="btnToAdd" class="btn btn-primary" data-toggle="modal" href="#responsive">添加用户组</button>
		 <table id="groupTable" class="table table-striped">
			<thead>
			<tr>
			<th>编号</th>
			<th>产品</th>
			<th>交付时间</th>
			<th>状态</th>
			</tr>
			</thead>
			<tbody>
			<tr>
			<td>1</td>
			<td>TB - Monthly</td>
			<td>01/04/2012</td>
			<td>Default</td>
			</tr>
			<tr class="success">
			<td>1</td>
			<td>TB - Monthly</td>
			<td>01/04/2012</td>
			<td>Approved</td>
			</tr>
			<tr class="error">
			<td>2</td>
			<td>TB - Monthly</td>
			<td>02/04/2012</td>
			<td>Declined</td>
			</tr>
			<tr class="warning">
			<td>3</td>
			<td>TB - Monthly</td>
			<td>03/04/2012</td>
			<td>Pending</td>
			</tr>
			<tr class="info">
			<td>4</td>
			<td>TB - Monthly</td>
			<td>04/04/2012</td>
			<td>Call in to confirm</td>
			</tr>
			</tbody>
			</table>
	</div>
 
</div>
</body>
</html>