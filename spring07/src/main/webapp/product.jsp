<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/out.css">

</head>
<body>
<hr>

<form action="product">
번호 : <input name="pNo"><br>
제목 : <input name="name"><br>
내용 : <input name="content"><br>
날짜 : <input type = "date" name="date"><br>
<button> 완료</button>
</form>
<a href = "product?pNo=100&name=test&content=test&date=21210827">제품1</a> 
<!-- form 과 a 태그 둘다 클라이언트 요청이다 .  -->
</body>
</html>