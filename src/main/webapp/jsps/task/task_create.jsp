<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>task Create</title>
    
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
  <h1>task Create</h1>
<form action="<c:url value='/Entity1ServletCreate'/>" method="post">
	id:<input type="text" name="id" value="${form.id }"/>
	<span style="color: red; font-weight: 900">${errors.id }</span>
	<br/>
	name：<input type="text" name="name" value="${form.name }"/>
	<span style="color: red; font-weight: 900">${errors.name }</span>
	<br/>
	campaign_id：<input type="text" name="campaign_id" value="${form.campaign_id }"/>
	<span style="color: red; font-weight: 900">${errors.campaign_id }</span>
	<br/>
	description：<input type="text" name="description" value="${form.description }"/>
	<span style="color: red; font-weight: 900">${errors.description }</span>
	<br/>
	number_of_participant：<input type="text" name="number_of_participant" value="${form.number_of_participant }"/>
	<span style="color: red; font-weight: 900">${errors.number_of_participant }</span>
	<br/>
	<input type="submit" value="Create task"/>
</form>
  </body>
</html>
