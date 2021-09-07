<%@page import="shop.dto.ProductDTO"%>
<%@page import="shop.db.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
ProductDAO dao =new ProductDAO(); 
ArrayList<ProductDTO> list = dao.read();
//현재 row 의 들어있는만큼의 가방이 만들어졌을것이고 list안에 다 들어가 있을것이다.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	전체 게시판 목록의 개수<%=list.size()%> 개
	<hr>
	<%=list%>

		<hr color="pink">
		<table border=1>
		<tr bgcolor="geen">
		<th>아이디</th>
		<th>이름</th>
		<th>내용</th>
		<th>가격</th>
		
		</tr>
	<%
		for (ProductDTO dto:list){
	%>
		<tr bgcolor="gold">
		<td> <%= dto.getId() %></td>
		<td> 
		<a href="http://localhost:7776/web26/read2.jsp?id=<%= dto.getId() %>">
		<%= dto.getName() %>
		
		</a>
		</td>
		<td><%= dto.getContent()%></td>
		<td> <%= dto.getPrice() %></td>
		</tr>
	<% } %>
	</table>
	
	
	
	
	
</body>
</html>