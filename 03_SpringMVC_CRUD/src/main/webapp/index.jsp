<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Spring MVC_crud 프로젝트</h1>
	<hr>
	<c:choose>
	<c:when test="${empty sessionScope.m }">
	<form action="/login.do" method="post">
	<fieldset>
	<legend>로그인</legend>
	아이디: <input type="text" name="memberId"><br>
	비밀번호: <input type="password" name="memberPw"><br>
	<input type="submit" value="로그인">
	<a href="/joinFrm.do">회원가입</a>
	
	</fieldset>
	</form>
	</c:when>
	<c:otherwise>
	<h2>${sessionScope.m.memberName } 로그인</h2>
	</c:otherwise>
	</c:choose>
</body>
</html>