<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Charity</title>
    
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
  <h1>Delete Charity</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/CharityServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
		<input type="hidden" name="id" value="${charity.id }"/>
	id:<input type="text" name="id"  value="${charity.id }" disabled/>
	<br/>
	
	name：<input type="text" name="name" value="${charity.name }" disabled/>
	<br/>
	cause：<input type="text" name="cause" value="${charity.cause }" disabled/>
	<br/>
	address：<input type="text" name="address" value="${charity.address }" disabled/>
	<br/>
	target_region_id：<input type="text" name="target_region_id" value="${charity.target_region_id }" disabled/>
	<br/>
	<input type="submit" value="Delete Charity"/>
</form>

</body>
</html>
