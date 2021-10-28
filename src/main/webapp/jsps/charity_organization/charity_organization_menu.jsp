<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>charity_organization</title>
    
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
    <h1>charity_organization</h1>
		<a href="<c:url value='/jsps/charity_organization/charity_organization_create.jsp'/>" target="_parent">charity_organization Create</a>
		<br>
		<a href="<c:url value='/jsps/charity_organization/charity_organization_delete.jsp'/>" target="_parent">charity_organization Delete</a>
		<br> 
		<a href="<c:url value='/jsps/charity_organization/charity_organization_read.jsp'/>" target="_parent">charity_organization Read</a>
		<br>
		<a href="<c:url value='/jsps/charity_organization/charity_organization_update.jsp'/>" target="_parent">charity_organization Update</a>

    
  </body>
</html>
