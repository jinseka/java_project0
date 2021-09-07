<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h1> 검색된 회원 입니다.</h1>
<hr> 
검색된 ID : ${dto.id} <br> <!-- dto.getId() -->  
검색된 PW : ${dto.pw} <br> <!-- dto.getId() -->  
검색된 NAME : ${dto.name} <br> <!-- dto.getId() -->  
검색된 TEL : ${dto.tel} <br> <!-- dto.getId() -->  
</body>
</html>