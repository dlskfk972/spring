<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>화면URL요청(캔퍼스/service/1socreRegister)</h2>
<h2>score입력</h2>

<form action="regist" method="post">
이름:<input type="text" name="name"><br>
국어:<input type="text" name="kor"><br>
영어:<input type="text" name="eng"><br>
수학:<input type="text" name="math"><br>
<input type="submit" value="입력">
<input type="button" value="리스트" onclick="location href='3scoreList' ">

</form>
</body>
</html>