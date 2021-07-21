<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String title =request.getParameter("title");
    String name =request.getParameter("name");
    String word =request.getParameter("word");
    String three =request.getParameter("three");
    String tag =request.getParameter("tag");
    String date =request.getParameter("date");
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert2 title here</title>
</head>
<body>
<h3>서버에서 받은 값들 정리</h3>
<hr color="green">
서버에서 받은 타이틀 : <%= title %> <br>
서버에서 받은 이름 : <%= name %> <br>
서버에서 받은 내용 : <%= word %> <br>
서버에서 받은 태그 : <%= three %> <br>
서버에서 받은 부서 : <%= tag %> <br>
서버에서 받은 날짜 : <%= date %> <br>
</body>
</html>