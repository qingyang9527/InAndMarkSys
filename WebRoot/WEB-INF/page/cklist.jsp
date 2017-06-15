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
    
    <title>仓库类型</title>
    
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
    <li><a href="#">数据表</a></li>
    <li><a href="#">基本内容</a></li>
    </ul>
    </div>
    
    <div class="rightinfo">
    
    <div class="tools">
    
    	<ul class="toolbar">
        <li><a href="${pageContext.request.contextPath }/page/ck_forward.action"><span><img src="${pageContext.request.contextPath}/images/t01.png"/></span>添加</a></li>
        <li><span><img src="${pageContext.request.contextPath}/images/t04.png" /></span>统计</li>
		</ul>
        
        <ul class="toolbar1">
        <li><span><img src="${pageContext.request.contextPath}/images/t05.png" /></span>设置</li>
        </ul>
    
    </div>
    
    
    <table class="tablelist">
    	<thead>
    	<tr>
        <th><input name="" type="checkbox" value="" checked="checked"/></th>
        <th>仓库编码<i class="sort"></i></th>
        <th>仓库名称</th>
        <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <s:iterator value="#request['ckList']" id="ckList">
        <tr>
        <td><input name="" type="checkbox" value="" /></td>
        <td><s:property value="#ckList.ckid"/></td>
        <td><s:property value="#ckList.ckname"/></td>
        <td><a href="${pageContext.request.contextPath }/page/ck_edit.action?ckid=<s:property value="#ckList.ckid"/>" class="click" id="">编辑</a>     <a href="${pageContext.request.contextPath }/page/ck_delete.action?ckid=<s:property value="#ckList.ckid"/>" class="tablelink"> 删除</a></td>
        </tr> 
          </s:iterator>      
        </tbody>
    </table>
    
    <div class="pagin">
       <s:set name="pager" value="#request.pager"/>
    	<div class="message">共<i class="blue"><s:property value="#pager.totalSize"/></s></i>条记录，当前显示第&nbsp;<i class="blue"><s:property value="#pager.currentPage"/>&nbsp;</i>页</div>
        <ul class="paginList">
        <s:if test="#pager.hasFirst">
        <li class="paginItem"><a href="${pageContext.request.contextPath }/page/wl_queryAll.action?currentPage=1">首页</a></li>
        </s:if>
         <s:if test="#pager.hasPrevious">
        <li class="paginItem"><a href="${pageContext.request.contextPath }/page/wl_queryAll.action?currentPage=<s:property value="#pager.currentPage-1"/>">上一页</a></li>
        </s:if>
        <li class="paginItem"><a href="javascript:;">1</a></li>
        <li class="paginItem current"><a href="javascript:;">2</a></li>
        <li class="paginItem"><a href="javascript:;">3</a></li>
        <li class="paginItem more"><a href="javascript:;">...</a></li>
         <s:if test="#pager.hasNext">
        <li class="paginItem"><a href="${pageContext.request.contextPath }/page/wl_queryAll.action?currentPage=<s:property value="#pager.currentPage+1"/>">下一页</a></li>
        </s:if>
         <s:if test="#pager.hasLast">
        <li class="paginItem"><a href="${pageContext.request.contextPath }/page/wl_queryAll.action?currentPage=<s:property value="#pager.totalPage"/>">尾页</a></li>
        </s:if>
        </ul>
    </div>
   
    <div class="tip">
    	<div class="tiptop"><span>提示信息</span><a></a></div>
        
      <div class="tipinfo">
        <span><img src="images/ticon.png" /></span>
        <div class="tipright">
        <p>是否确认对信息的修改 ？</p>
        <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
        </div>
        </div>
        
        <div class="tipbtn">
        <input name="" type="button"  class="sure" value="确定" />&nbsp;
        <input name="" type="button"  class="cancel" value="取消" />
        </div>
    
    </div>
    
    
    
    
    </div>
    
    <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>

</body>
</html>
