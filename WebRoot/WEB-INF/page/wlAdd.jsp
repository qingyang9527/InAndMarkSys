<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'wlAdd.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
		<link href="css/style.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="<%=path %>/layer-v1.9.3/1.9.1/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/layer-v1.9.3/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/layer-v1.9.3/1.9.1/layer.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){
		var num;
		var price;
 		$("#num").change(function(){
 			num=$("#num").val()
 			price=$("#price").val()
 			var total=num*price;
 			$("#totalprice").val(total);
 			alert("总价为："+total);
 		})
 		$("#price").change(function(){
 		price=$("#price").val();
 		num=$("#num").val();
 		var total=num*price;
 		$("#totalprice").val(total);
 		alert("总价为："+total);
 		})
 		

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
    
    <div class="formtitle"><span>添加物料</span></div>
    <form action="${pageContext.request.contextPath }/page/wl_add.action" method="post">
    <ul class="forminfo">
    <li><label>物料编码</label><input name="wlid" id="wlid" type="text" class="dfinput" /><i></i></li>
    <li><label>物料名称</label><input name="wlname" id="wlname" type="text" class="dfinput" /><i></i></li>
    <li><label>物料数量</label><input name="wlnum" id="num" type="text" class="dfinput" /><i></i></li>
    <li><label>物料单价</label><input name="wlprice" id="price" type="text" class="dfinput" /><i>单位（￥）</i></li>
    <li><label>物料总价</label><input name="wltotalprice" id="totalprice"  type="text" class="dfinput" /><i>单位（￥）</i></li>
    <li><label>物料供应商<b></b></label>  
    <div class="vocation">
    <select class="select1" name="tbGys.id">
    <option value="3242">哇哈哈</option>
    <option value="3523">伊利</option>
    <option value="9981">红牛</option>
    </select>
    </div>
    </li>
    <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认保存"/></li>
    </ul>
    
    </form>
    </div>


</body>
</html>
