<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>    
     <link href="/resources/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>

	<h1>로그아웃 페이지</h1>
	
	<!-- 
		POST 방식으로 처리되는 로그아웃 처리는 
		Spring Security 내부에서 자동으로 처리함
		로그아웃할 때 추가적은 처리가 필요하면
		LogoutSuccessHandler 를 정의해서 처리함 
	 -->
	<form action="/customLogout" method="post">
		<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }" />
		<button>로그아웃</button>
	</form> 

</body>
</html>