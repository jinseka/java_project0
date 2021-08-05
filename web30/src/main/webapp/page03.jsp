<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    session.setAttribute("count", 100); //조회수,100 //object <-- 변환 -- int 
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

현재 count : ${count}<hr>
현재 count :  <%= session.getAttribute("count")  %>



<hr>
<a href = "page04.jsp">카운트값 증가 후 다시세션 저장</a> <br>
<a href = "page05.jsp">카운트값 확인</a>
</body>
</html>