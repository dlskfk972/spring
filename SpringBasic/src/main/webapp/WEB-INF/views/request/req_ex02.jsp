<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>파라미터값 받기(화면url요청: /request/req_ex02)</h2>

<form action="param" method="post">
ID:<input type="text" name="id" size="10"><br>
PW:<input type="password" name="pw" size="10"><br>
NAME:<input type="text" name="name" size="10"><br>
AGE:<input type="text" name="age" size="10"><br>

<!-- 체크박스형 파라미터 처리 -->
<input type="checkbox" name="inter" value="java">자바
<input type="checkbox" name="inter" value="spring">스프링

<input type="submit" value="확인">

</form>

</body>
</html>