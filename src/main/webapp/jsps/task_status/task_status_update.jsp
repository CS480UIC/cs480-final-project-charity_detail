<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Entity1</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html;charset=utf-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <h1>Update task_status</h1>
<form action="<c:url value='/TaskStatusServletUpdate'/>" method="post">
	<input type="hidden" name="method" value="search"/>
	id:<input type="text" name="id" value="${form.id }"/>
	<span style="color: red; font-weight: 900">${errors.id }</span>
	<br/>
	status:<input type="text" name="status" value="${form.status }"/>
	<span style="color: red; font-weight: 900">${errors.status }</span>
	<br/>
	remark:<input type="text" name="remark" value="${form.remark }"/>
	<span style="color: red; font-weight: 900">${errors.remark }</span>
	<br/>
	<input type="submit" value="Update task_status"/>
</form>
  </body>
</html>
