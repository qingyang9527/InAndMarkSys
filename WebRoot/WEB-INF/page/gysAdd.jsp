<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'gysAdd.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
		<link href="css/style.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="<%=path %>/layer-v1.9.3/1.9.1/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/layer-v1.9.3/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/layer-v1.9.3/1.9.1/layer.js"></script>
  </head>
  
<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">表单</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>添加物料</span></div>
    <form action="${pageContext.request.contextPath }/page/gys_add.action" method="post">
    <ul class="forminfo">
    <li><label>供应商编码</label><input name="id" id="id" type="text" class="dfinput" /><i></i></li>
    <li><label>供应商名称</label><input name="gysName" id="gysName" type="text" class="dfinput" /><i></i></li>
    <li><label>供应商地址</label><input name="gysAddress" id="num" type="text" class="dfinput" /><i></i></li>
    <li><label>供应商联系电话</label><input name="gysPhone" id="gysPhone" type="text" class="dfinput" /><i></i></li>
    <li><label>供应商电子邮箱</label><input name="gysMail" id="gysMail"  type="text" class="dfinput" /><i></i></li>
    </li>
    <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认保存"/></li>
    </ul>
    
    </form>
    </div>


</body>
</html>
