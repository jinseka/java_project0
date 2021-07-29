<%@page import="shop.dto.게시판Bag"%>
<%@page import="shop.db.게시판DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
//db처리하는 dao한테 주면서 검색하는 sql문을 만들어서 전송

//가방을 만들어서 테이터를 넣자.
게시판Bag bag = new 게시판Bag();
bag.setId(id);

//DAO를 만들어서 검색요청!!
	게시판DAO dao = new 게시판DAO();
	게시판Bag bag3=dao.read(bag);

	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원정보 검색결과입니다.</h3>
<hr>
검색된 id는 <%= bag3.getId() %> <br>
검색된 title는 <%= bag3.getTitle() %> <br>
검색된 content는 <%= bag3.getContent() %> <br>
검색된 writer는 <%= bag3.getWriter() %> <br>
</body>
</html>