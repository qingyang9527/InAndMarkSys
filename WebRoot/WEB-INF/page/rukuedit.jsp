<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'rukulist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="<%=path %>/layer-v1.9.3/1.9.1/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/layer-v1.9.3/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/layer-v1.9.3/1.9.1/layer.js"></script>
<script type="text/javascript">
$(document).ready(function(){
  $(".click").click(function(){
  $(".tip").fadeIn(200);
  });
  
  $(".tiptop a").click(function(){
  $(".tip").fadeOut(200);
});

  $(".sure").click(function(){
  $(".tip").fadeOut(100);
});

  $(".cancel").click(function(){
  $(".tip").fadeOut(100);
});

});
</script>
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
    
    <div class="formtitle"><span>编辑信息</span></div>
    <form action="${pageContext.request.contextPath }/page/ruku_update.action" method="post">
    <ul class="forminfo">
 	<s:iterator value="#request['EditList']" var="editData">
    <input type="hidden" name="id" value="<s:property value="#editData.id"/>"/>
    <li><label>入库单号</label><input name="rukuid" value="<s:property value="#editData.rukuid"/>" type="text" class="dfinput" /><i></i></li>
    <li><label>入库时间</label><input name="rktime" value="<s:property value="#editData.rktime"/>" type="datetime-local" class="dfinput" /><i></i></li>
    <li><label>单价</label><input name="price" value="<s:property value="#editData.price"/>" type="text" class="dfinput" /><i></i></li>
    <li><label>入库数量</label><input name="num" value="<s:property value="#editData.num"/>" type="text" class="dfinput" /><i></i></li>
    <li><label>入库总价</label><input name="rktotalprice" value="<s:property value="#editData.rktotalprice"/>" type="text" class="dfinput" /><i></i></li>
    <li><label>所属仓库</label><input name="ckid" value="<s:property value="#editData.tbCk.ckname"/>" type="text" class="dfinput" /><i></i></li>
    <li><label>经手人</label><input name="ckadmin" value="<s:property value="#editData.admin.username"/>" type="text" class="dfinput" /><i></i></li>
    
    </s:iterator>
    </li>
    <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认保存"/></li>
    </ul>
    
    </form>
    </div>


</body>
</html>
