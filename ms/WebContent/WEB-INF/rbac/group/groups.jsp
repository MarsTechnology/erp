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
		<table id="groupTable" class="table table-striped">
			<thead>
			<tr>
			<th>序号</th>
			<th>部门名称</th>
			<th>上级部门</th>
			<th>操作</th>
			</tr>
			</thead>
			<tbody>
				<c:forEach items="${map.groups}" var="g">
     				<tr class="info">
						<td>${g.id }</td>
						<td>${g.groupName }</td>
						<td>${g.parentId }</td>
						<td><a   href="javascript:void(0)" onclick="del1(${g.id })" >删除</a></td>
						<td>修改</td>
					</tr>
     			</c:forEach>
			</tbody>
		</table>
	</div>
	<button id="btnToAdd" class="btn btn-primary" data-toggle="modal" href="#responsive">添加用户组</button>
	
	<button class="btn btn-primary btn-lg" data-toggle="modal"  data-target="#myModal">添加用户组</button>
	
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"  aria-labelledby="myModalLabel" aria-hidden="true">
   		<div class="modal-dialog">
     		<div class="modal-content">
	         	<div class="modal-header">
	            	<button type="button" class="close"      data-dismiss="modal" aria-hidden="true">
	                  &times;
	            	</button>
	            	<h4 class="modal-title" id="myModalLabel">增加新部门 </h4>
	         	</div>
	        	<div class="modal-body">
		            <form class="form-signin" method="post" action="${pageContext.request.contextPath}/rbac/groupController/saveGroup">
						<div class="row">
							<div class="col-sm-4 col-sm-offset-4 col-md-4 col-md-offset-4">
							部门名称
							</div>
							<div class="col-sm-4 col-sm-offset-4 col-md-4 col-md-offset-4">
								<input type="text" id="username" name="groupName" class="form-control" placeholder="请输入部门名" required autofocus>
							</div>
						</div>
				        <div class="row">
							<div class="col-sm-4 col-sm-offset-4 col-md-4 col-md-offset-4">
							上级部门
							</div>
							<div class="col-sm-4 col-sm-offset-4 col-md-4 col-md-offset-4">
								<select class="form-control" name="parentId">
									<c:forEach items="${map.groups}" var="g">
										<option>${g.id }</option>
									</c:forEach>
						    	</select>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-4 col-sm-offset-4 col-md-4 col-md-offset-4 ">
								<button class="btn btn-primary" type="submit">保存</button>
								<button class="btn btn-primary" data-dismiss="modal">关闭 </button>
							</div>
						</div>
	      			</form>		
	         	</div>
	         	<div class="modal-footer">
	            	
	            	<button type="button" class="btn btn-primary">提交更改</button>
	         	</div>
      		</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>

</div>
</body>
</html>
