<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'BookList.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <title>用MVC实现图书查询系统</title>
 </head>
<body> 
 <h2 align="center">用MVC实现图书查询系统</h2>
 <hr color="#336699"><br> 
   <h3 align="center">书&nbsp;&nbsp;名</h3>
   <s:iterator value="#request.booklist">
   <h5 align="center">
   <br><a href="DetailAction?Title=<s:property/>"><s:property/></a>
    <a href="DeleteAction?Title=<s:property/>">delete</a></h5>
   </s:iterator>
   <input type="button" value="Home" onClick="window.location.href='index.jsp'">
 </body>
</html>

