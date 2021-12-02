<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>campaign Create</title>
    
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
  <h1>campaign Create</h1>
<form action="<c:url value='/CampaignServletCreate'/>" method="post">
	charity_id：<input type="text" name="charity_id" value="${form.charity_id }"/>
	<span style="color: red; font-weight: 900">${errors.charity_id }</span>
	<br/>
	name：<input type="text" name="name" value="${form.name }"/>
	<span style="color: red; font-weight: 900">${errors.name }</span>
	<br/>
	start_date：<input type="text" name="start_date" value="${form.start_date }"/>
	<span style="color: red; font-weight: 900">${errors.start_date }</span>
	<br/>
	target_region_id：<input type="text" name="target_region_id" value="${form.target_region_id }"/>
	<span style="color: red; font-weight: 900">${errors.target_region_id }</span>
	<br/>
	end_date：<input type="text" name="end_date" value="${form.end_date }"/>
	<span style="color: red; font-weight: 900">${errors.end_date }</span>
	<br/>
	<input type="submit" value="Create campaign"/>
</form>
  </body>
</html>
