<%@page import="shop.db.회원DAO"%>
<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    String name =request.getParameter("name");
    String tel =request.getParameter("tel");
    

  //가방을 만들어서 테이터를 넣자.
  회원Bag bag = new 회원Bag();
  bag.setId(id);
  bag.setName(name);
  bag.setTel(tel);  

  //DAO를 만들어서 탈퇴요청!!
  회원DAO2 dao = new 회원DAO2();
  dao.update(bag);
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
수정처리 요청
</body>
</html>