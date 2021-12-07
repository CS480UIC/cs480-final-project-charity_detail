<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>Body</title>
    
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
  	
  	<h1>Project Description</h1>
  	A fully transparent NGO website that allows for better management and accountability of funds. Allowing for a trustworthy system to check for goal progress and donations.

A collection of charities and donators are registered with the website.

The project uses HTML+JS for the front end. Java + Apache Tomcat for server. MySQL as the DataBase Management System and JDBC as the connector.

There is no transparent NGO website that allows for better management and accountability of funds.
    <h1>Entities in project</h1>
		<a href="<c:url value='/jsps/task/task_menu.jsp'/>" target="_parent">Task</a>
		<br>
		<a href="<c:url value='/jsps/task_status/task_status_menu.jsp'/>" target="_parent">Task Status</a>
		<br> 
		
		<a href="<c:url value='/jsps/donation/donation_menu.jsp'/>" target="_parent">Donation</a>
		<br> 
		<a href="<c:url value='/jsps/charity_organization/charity_organization_menu.jsp'/>" target="_parent">Charity Organization</a>
		<br>
  </body>
</html>
