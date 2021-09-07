<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">to start page..</a>
<hr>
<form action="bbs">
제품번호 : <input name="bNo"><br>
제품이름 : <input name="name"><br>
제품내용 : <input name="content"><br>
날짜 : <input type = "date" name="date"><br>
<button>제품 완료</button>
</form>
<a href = "bbs?bNo=100&title=test&content=test&writer=test&date=21210827">게시판</a> 
<!-- form 과 a 태그 둘다 클라이언트 요청이다 .  -->
</body>
</html>