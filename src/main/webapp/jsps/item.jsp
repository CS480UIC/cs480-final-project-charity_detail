<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="">
    
    <title>body</title>
    
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
    <h1>Welcome to the Queries</h1>
    <br>
    <a href="<c:url value='/findAll'/>" target="body">Please list all the user in the table</a>&nbsp;&nbsp;
 	<a href="<c:url value='/ActiveCampaigns'/>" target="body">List of all the active campaigns</a>&nbsp;&nbsp;
    <a href="<c:url value='/DonationSummary'/>" target="body">List of all the donation summary</a>&nbsp;&nbsp;
    <a href="<c:url value='/HungerCampaigns'/>" target="body">List of all the hunger campaigns</a>&nbsp;&nbsp;
    <a href="<c:url value='/TaskVolunteers'/>" target="body">List of all the task volunteers</a>&nbsp;&nbsp;
    <a href="<c:url value='/FinishedCampaigns'/>" target="body">List of all the finished campaigns</a>&nbsp;&nbsp;
    <a href="<c:url value='/OngroundCharity'/>" target="body">List of all the on ground charity</a>&nbsp;&nbsp;

  </body>
</html>
