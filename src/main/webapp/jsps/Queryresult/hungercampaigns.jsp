<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
	<h3 align="center"> User Table </h3>
	<table border="1" width="70%" align="center">
	<tr>
		<th>name</th>
		<th>charity_id</th>
		<th>target_region_id</th>
		<th>start_date</th>
		<th>end_date</th>
	</tr>
<c:forEach items="${HungerCampaignsList}" var="queries">
	<tr>
		<td>${queries.name}</td>
		<td>${queries.charity_id}</td>
		<td>${queries.target_region_id}</td>
		<td>${queries.start_date}</td>
		<td>${queries.end_date}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>
