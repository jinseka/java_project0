<%@page import="shop.dto.회원Bag"%>
<%@page import="shop.db.회원DAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
//db처리하는 dao한테 주면서 탈퇴하는 sql문을 만들어서 전송

//가방을 만들어서 테이터를 넣자.
회원Bag bag = new 회원Bag();
bag.setId(id);

//DAO를 만들어서 탈퇴요청!!
회원DAO2 dao = new 회원DAO2();
int result = dao.delete(bag);
String text ="회원탈퇴 실패했습니다. 재탈퇴해주세요.";
if(result ==1){
	text ="회원탈퇴 성공했습니다. 축하드립니다";
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>탈퇴처리 요청함 .
실행 결과는 <%= text %>>
</body>
</html>