<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>系统主页</title>
<script src="${pageContext.request.contextPath}/webresource/jQuery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/webresource/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/webresource/bootstrap/js/jquery.ztree.all-3.5.min.js"></script>
<link href="${pageContext.request.contextPath}/webresource/bootstrap/css/bootstrap.min.css" rel="stylesheet"></link>
<link href="${pageContext.request.contextPath}/webresource/bootstrap/css/metro.css" rel="stylesheet"></link>
<style>
.none-padding {
	padding: 0 !important;
    margin: 0 !important;
}

body {
  padding-top: 50px;
}
</style>
</head>
<body>
<script>
    var zTree;
    var demoIframe;

    var setting = {
        check: {
            enable: false
        },
        view: {
            dblClickExpand: false,
            showLine: true,
            selectedMulti: false
        },
        data: {
            simpleData: {
                enable:true,
                idKey: "id",
                pIdKey: "pid",
                rootPId: 0
            }
        },
        callback: {
            beforeClick: function(treeId, treeNode) {
			console.log(treeId);
			console.log(treeNode);
                var zTree = $.fn.zTree.getZTreeObj("tree");
                if (treeNode.isParent) {
                    zTree.expandNode(treeNode);
                    return false;
                } else {
                    demoIframe.attr("src","${pageContext.request.contextPath}"+treeNode.file);
                    return true;
                }
            }
        }
    };

	function onLoadZTree(){
		var treeNodes;
		$.ajax({
			type:'GET',//请求方式：post
			dataType:'json',//数据传输格式：json
			url:'${pageContext.request.contextPath}/menuJson',
			error:function(){
				//请求失败处理函数
				alert('亲，请求失败！');
			},
			success:function(data){
	           console.log(data);
				//请求成功后处理函数
				treeNodes = data;//把后台封装好的简单Json格式赋给treeNodes
				console.log(treeNodes);
				var t = $("#tree");
				t = $.fn.zTree.init(t, setting, treeNodes);
				demoIframe = $("#main-workspace");
				demoIframe.bind("load", loadReady);
			}
        });
	}
    $(document).ready(function(){
	    onLoadZTree();
    });

    function loadReady() {
        var bodyH = demoIframe.contents().find("body").get(0).scrollHeight,
                htmlH = demoIframe.contents().find("html").get(0).scrollHeight,
                maxH = Math.max(bodyH, htmlH), minH = Math.min(bodyH, htmlH),
                h = demoIframe.height() >= maxH ? minH:maxH ;
        if (h < 530) h = 530;
        demoIframe.height(h);
    }
</script>

<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
	<div class="navbar-header">
	  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
		<span class="sr-only">Toggle navigation</span>
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
	  </button>
	  <a class="navbar-brand" href="#">基于SOA的ERP系统</a>
	</div>
	<div id="navbar" class="navbar-collapse collapse">
	  <ul class="nav navbar-nav navbar-right"> 
		<li><a class="navbar-brand" href="#">个人信息</a></li>
		<li><a class="navbar-brand" href="#">退出</a></li>
	  </ul>
	</div>
  </div>
</nav>
<div class="container-fluid">
	<div class="row" >
		<div class="col-md-2 table-bordered"  style="height:550px;">
			<ul id="tree" class="ztree"  style="height:100%;"></ul>
		</div>
		<div id="" class="col-md-10" style="height:550px;">
			<iframe id="main-workspace" style="width:100%;height:550px;" 
			frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="no" allowtransparency="yes">
			
			</iframe>
		</div>
	</div>	 
</div>
<footer class="footer navbar-fixed-bottom ">
	<div class="container">
		<p class="text-center">© 2016 GitHub, Inc.</p>
	</div>
</footer>
</body>
</html>