<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
String id =request.getParameter("id"); 
String pw =request.getParameter("pw");
String id2 ="root";
String pw2 ="1234";
String result = "로그인 실패!!!";
if(id.equals(id2)&& pw.equals(pw2)){
	result = "로그인 성공";
	
	
}
%>  
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
회원 정보가 맞아 로그인되였음.<br>
로그인 id는 <%= id %> <br>
로그인 pw는 <%= pw %> <br>
<hr>
로그인 결과는 <%= result %>

</body>
</html>