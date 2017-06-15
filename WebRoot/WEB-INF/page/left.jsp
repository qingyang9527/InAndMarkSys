<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
	<script language="JavaScript" src="${pageContext.request.contextPath}/js/jquery.js"></script>

	<script type="text/javascript">
	$(function(){	
	//导航切换
	$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active")
		$(this).addClass("active");
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
})	
</script>

  </head>
  
<body style="background:#f0f9fd;">
	<div class="lefttop"><span></span></div>
    
    <dl class="leftmenu">
        
    <dd>
    <div class="title">
    <span><img src="${pageContext.request.contextPath}/images/leftico01.png" /></span>物料管理
    </div>
    	<ul class="menuson">
        <li><cite></cite><a href="${pageContext.request.contextPath }/page/wl_queryAll.action" target="rightFrame">物料数据列表</a><i></i></li>
        <li class="active"><cite></cite><a href="right.html" target="rightFrame">物料</a><i></i></li>
        <li><cite></cite><a href="imgtable.html" target="rightFrame">图片数据表</a><i></i></li>
        <li><cite></cite><a href="form.html" target="rightFrame">添加编辑</a><i></i></li>
        <li><cite></cite><a href="imglist.html" target="rightFrame">图片列表</a><i></i></li>
        </ul>    
    </dd>
    
    
        
    
    <dd>
    <div class="title">
    <span><img src="${pageContext.request.contextPath}/images/leftico02.png" /></span>供应商管理
    </div>
    <ul class="menuson">
        <li><cite></cite><a href="${pageContext.request.contextPath }/page/gys_queryPage.action" target="rightFrame">供应商列表</a><i></i></li>
        </ul>     
    </dd> 
    
    
    <dd><div class="title"><span><img src="${pageContext.request.contextPath}/images/leftico03.png" /></span>仓库类型管理</div>
    <ul class="menuson">
        <li><cite></cite><a href="${pageContext.request.contextPath }/page/ck_queryPage.action" target="rightFrame">仓库信息</a><i></i></li>
        <li><cite></cite><a href="#">常用资料</a><i></i></li>
    </ul>    
    </dd>  
    
    
    <dd><div class="title"><span><img src="${pageContext.request.contextPath}/images/leftico04.png" /></span>入库管理</div>
    <ul class="menuson">
        <li><cite></cite><a href="${pageContext.request.contextPath }/page/ruku_queryPage.action" target="rightFrame">入库列表</a><i></i></li>
        <li><cite></cite><a href="#">入库统计查询</a><i></i></li>
    </ul>
    
    </dd>
    
        <dd><div class="title"><span><img src="${pageContext.request.contextPath}/images/leftico04.png" /></span>销售管理</div>
    <ul class="menuson">
        <li><cite></cite><a href="#">销售管理</a><i></i></li>
        <li><cite></cite><a href="#">出库统计查询</a><i></i></li>
    </ul>
    
    </dd>  
    
        <dd><div class="title"><span><img src="${pageContext.request.contextPath}/images/leftico04.png" /></span>用户信息管理</div>
    <ul class="menuson">
        <li><cite></cite><a href="#">自定义</a><i></i></li>
        <li><cite></cite><a href="#">常用资料</a><i></i></li>
        <li><cite></cite><a href="#">信息列表</a><i></i></li>
        <li><cite></cite><a href="#">其他</a><i></i></li>
    </ul>
    
    </dd>  
    
    </dl>
    
</body>
</html>
