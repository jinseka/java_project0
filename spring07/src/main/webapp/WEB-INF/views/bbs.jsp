<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
bbs 확인되었습니다.
게시판 입력 정보 확인해보자 
<hr color="pink">
게시판 번호 : ${bbsDTO.bNo} <br>   
게시판 이름 : ${bbsDTO.title} <br>
게시판 내용 : ${bbsDTO.content} <br>
게시판 작성자 : ${bbsDTO.writer} <br>
</body>
</html>