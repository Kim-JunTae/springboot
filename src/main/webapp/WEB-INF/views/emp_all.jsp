<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp_all</title>
</head>
<body>
<h1>사원 목록</h1>
	<ol>
	<c:forEach var="evo" items="${ar}">
		<li>${evo.employee_id } / ${evo.first_name }</li>
	</c:forEach>
	</ol>
</body>
</html>