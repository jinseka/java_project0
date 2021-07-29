<%@page import="shop.dto.회원Bag"%>
<%@page import="shop.db.회원DAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //1.전송된 데이터를 받아줘야함.
    
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	String tel = request.getParameter("tel");
    	
    	//jsp에서 자동import: 클릭 후, 컨트롤+쉬프트+m
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
    	bag.setPw(pw);
    	bag.setName(name);
    	bag.setTel(tel);
    	
    	회원DAO2 dao = new 회원DAO2();
    	int result = dao.create(bag); // 0 이나 1 값이 들어있다.
    	String text ="회원가입 실패했습니다. 재가입해주세요.";
    	if(result ==1){
    		text ="회원가입 성공했습니다. 축하드립니다";
    	}
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
전송된 회원정보의 sql문을 전송함.
실행 결과는 <%= text %>>
</body>
</html>