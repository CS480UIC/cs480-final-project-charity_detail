<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Update Charity Organization</title>
    
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
  <h1>Update Donation</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form>
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
</form>
<h1>Update the values below</h1>
<form action="<c:url value='/CharityServletUpdate'/>" method="post">
		<input type="hidden" name="method" value="update"/>
				<input type="hidden" name="id" value="${charity.id }"/>
	name：<input type="text" name="name" value="${form.name }"/>
	<span style="color: red; font-weight: 900">${errors.name }</span>
	<br/>
	cause：<input type="text" name="cause" value="${form.cause }"/>
	<span style="color: red; font-weight: 900">${errors.cause }</span>
	<br/>
	address：<input type="text" name="address" value="${form.address }"/>
	<span style="color: red; font-weight: 900">${errors.address }</span>
	<br/>
	target_region_id：<input type="text" name="target_region_id" value="${form.target_region_id }"/>
	<span style="color: red; font-weight: 900">${errors.target_region_id }</span>
	<br/>
	<input type="submit" value="Update Charity"/>
</form>

</body>
</html>
