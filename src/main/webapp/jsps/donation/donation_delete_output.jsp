<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Delete Donation</title>
    
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
  <h1>Delete Donation</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/DonationServletDelete'/>" method="post">
	<input type="hidden" name="method" value="delete"/>
		<input type="hidden" name="id" value="${donation.id }"/>
	id:<input type="text" name="id"  value="${donation.id }" disabled/>
	<br/>
	
	Donor Name：<input type="text" name="donor_name" value="${donation.donor_name }" disabled/>
	<br/>
	Charity id：<input type="text" name="charity_id" value="${donation.charity_id }" disabled/>
	<br/>
	Donation Amount:<input type="text" name="donation_amount" value="${donation.donation_amount }" disabled/>
	<br/>
	<input type="submit" value="Delete Donation"/>
</form>

</body>
</html>
