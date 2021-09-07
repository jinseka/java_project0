<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h1> 검색된 게시판 입니다.</h1>
<hr> 
검색된 ID : ${dto.id} <br> <!-- dto.getId() -->  
검색된 TITLE : ${dto.title} <br> <!-- dto.getId() -->  
검색된 CONTENT : ${dto.content} <br> <!-- dto.getId() -->  
검색된 WRITER : ${dto.writer} <br> <!-- dto.getId() -->  
</body>
</html>