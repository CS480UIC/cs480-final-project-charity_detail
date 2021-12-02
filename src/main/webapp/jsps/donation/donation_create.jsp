<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Donation Create</title>
    
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
  <h1>donation Create</h1>
<form action="<c:url value='/DonationServletCreate'/>" method="post">
	id:<input type="text" name="id" value="${form.id }"/>
	<span style="color: red; font-weight: 900">${errors.id }</span>
	<br/>
	Donor Name：<input type="text" name="donor_name" value="${form.donor_name }"/>
	<span style="color: red; font-weight: 900">${errors.donor_name }</span>
	<br/>
	Charity id：<input type="text" name="charity_id" value="${form.charity_id }"/>
	<span style="color: red; font-weight: 900">${errors.charity_id }</span>
	<br/>
	Donation Amount:<input type="text" name="donation_amount" value="${form.donation_amount }"/>
	<span style="color: red; font-weight: 900">${errors.donation_amount }</span>
	<br/>
	<input type="submit" value="Make Donation"/>
</form>
  </body>
</html>
