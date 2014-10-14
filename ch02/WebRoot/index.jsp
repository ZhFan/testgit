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
  <title>欢迎使用MVC实现图书查询系统</title>
 </head>
<body>
<h3>欢迎使用MVC实现图书查询系统</h3>

<form action="ListAction">
<table>
<tr>
<td>Author_name:<input type="text" name="Name"/><td>
</tr>
<tr align="center">
<td colspan="1"><input type="submit" value="submit"/><td>
</tr>
</table>
</form>
<%--  <s:form action="ListAction">
Author_name: <s:textfield name="Name"/>
<s:submit />
</s:form>--%>
<h6>Kazuo Ishiguro/David Nicholls/Joyce Carol Oates/Tom Wolfe/Theodore Dreiser/James Patterson</h6>
</body>