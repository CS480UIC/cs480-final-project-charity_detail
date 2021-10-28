<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>Task</title>
    
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
    <h1>Task</h1>
		<a href="<c:url value='/jsps/task/task_create.jsp'/>" target="_parent">Task Create</a>
		<br>
		<a href="<c:url value='/jsps/task/task_delete.jsp'/>" target="_parent">Task Delete</a>
		<br> 
		<a href="<c:url value='/jsps/task/task_read.jsp'/>" target="_parent">Task Read</a>
		<br>
		<a href="<c:url value='/jsps/task/task_update.jsp'/>" target="_parent">Task Update</a>

    
  </body>
</html>
