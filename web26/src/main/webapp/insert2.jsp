<%@page import="shop.db.게시판DAO"%>
<%@page import="shop.dto.게시판Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//1. 게시판에 입력한 값을 가지고 와야함.
    	String id = request.getParameter("id");
    	String title = request.getParameter("title");
    	String content = request.getParameter("content");
    	String writer = request.getParameter("writer");
    	
    	//2. 가방을 만들어서 1번의 값들을 넣어준다.
    	게시판Bag bag = new 게시판Bag();
    	bag.setId(id);
    	bag.setTitle(title);
    	bag.setContent(content);
    	bag.setWriter(writer);
    	
    	//3. 게시판dao를 만들어서 create기능을 처리하라고 메서드 호출
    	게시판DAO dao = new 게시판DAO();
    	dao.create(bag);
    	
    	//   2번에서 만든 가방을 입력값으로 주어야 함.
    	//게시판DAO를 게시판용으로 변경해주세요.
    	
    	//4. html로 알려주세요.
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
게시판 글 db에 저장하도록 sql문 전송됨.
</body>
</html>