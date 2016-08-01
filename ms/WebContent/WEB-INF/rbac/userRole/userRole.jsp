<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include  file="/WEB-INF/common/common.jsp" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<style>
.none-padding {
	padding: 0 !important;
}
</style>
</head>
<body>
<script>
$(document).ready(function() {
	
	$("#groupTable").dataTable({
		 
	});
	
	function del1(id){
		alert(1);
	}
	
});



</script>
<div class="container-fluid none-padding">
	<div class="row-fluid " style="height:70%;">
		<form class="form-signin" method="post" action="${pageContext.request.contextPath}/rbac/userRoleController/saveUserRole">
			<table id="groupTable" class="table table-striped">
				<thead>
				<tr>
				<th>用户名称</th>
				
				</tr>
				</thead>
				<tbody>
     				<tr class="info">
						<td>
							<select class="form-control" name="userId">
								<c:forEach items="${map.userList}" var="u">
									<option>${u.id }</option>
								</c:forEach>
							 </select>
						</td>
					</tr>
				</tbody>
			</table>
			
			<table  class="table table-striped">
			<c:forEach items="${map.roleList}" var="r">
				<div class="checkbox">
   				<label><input type="checkbox" value="${r.id}" name = "roleIds">${r.id}</label>
			</div>
					</c:forEach>
			</table>
			
			<div class="row">
		<div class="col-sm-4 col-sm-offset-4 col-md-4 col-md-offset-4 ">
			<button class="btn btn-primary" type="submit">保存</button>
		</div>
	</div>
			
		</form>
	</div>
	
	
	
	

</div>
</body>
</html>
