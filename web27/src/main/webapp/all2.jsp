<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.게시판DAO"%>
<%@page import="shop.dto.게시판Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
게시판DAO dao = new 게시판DAO();
ArrayList<게시판Bag> list = dao.read();
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
	<hr color="green">
	<%
	for (int i =0; i< list.size(); i++){
	게시판Bag dto =list.get(i);
	%>
		게시판 id: <%= dto.getId() %> <br>
		게시판 title: <%= dto.getTitle() %> <br>
		게시판 content: <%= dto.getContent()%> <br>
		게시판 writer: <%= dto.getWriter() %> <br><br>
	<% } %>
	<hr color="gold">
	<%
		for (게시판Bag dto:list){
	%>
		게시판 id: <%= dto.getId() %> <br>
		게시판 title: <%= dto.getTitle() %> <br>
		게시판 content: <%= dto.getContent()%> <br>
		게시판 writer: <%= dto.getWriter() %> <br><br>
	<% } %>
		<hr color="pink">
		<table border=1>
		<tr bgcolor="geen">
		<th>아이디</th>
		<th>제목</th>
		<th>내용</th>
		<th>작성자</th>
		
		</tr>
	<%
		for (게시판Bag dto:list){
	%>
		<tr bgcolor="gold">
		<td> <%= dto.getId() %></td>
		<td> 
		<a href="http://localhost:7776/web26/read2.jsp?id=<%= dto.getId() %>">
		<%= dto.getTitle() %>
		
		</a>
		</td>
		<td><%= dto.getContent()%></td>
		<td> <%= dto.getWriter() %></td>
		</tr>
	<% } %>
	</table>
	
	
	
	
	
</body>
</html>