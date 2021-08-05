<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int count = (int)session.getAttribute("count"); //조회수,100 
    //object(big) -- 강제변환 --> int(small) 
    // Object가 개념적으로 더 크기때문에 int 로 변환할수가 없다.
    count++;
    session.setAttribute("count",count);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
현재 count :  <%= session.getAttribute("count")  %> <br>
<a href = "page05.jsp">결과</a>
</body>
</html>