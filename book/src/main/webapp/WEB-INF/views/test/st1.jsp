<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Security</title>    
     <link href="/resources/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
	<h3>Spring Security Example</h3>
	<ul>
		<li>request URL : <a href="<c:url value='/home/main'/>">/home/main</a></li>
		<li>request URL : <a href="<c:url value='/member/main'/>">/member/main</a></li>
		<li>request URL : <a href="<c:url value='/manager/main'/>">/manager/main</a></li>
		<li>request URL : <a href="<c:url value='/admin/main'/>">/admin/main</a></li>
	</ul>
</body>
</html>