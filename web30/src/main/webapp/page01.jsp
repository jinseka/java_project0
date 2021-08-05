<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //쿠키 바로삭제는 setMaxAge(0) 으로  다시 심는다.
    //1. 쿠키 객체를 만든다. 정보 하나당 한개씩 두개를 만든다.
    //2. 쿠키를 브라우저에 심는다.
    
    Cookie c1 =new Cookie("category","exercise"); 
    Cookie c2 =new Cookie("type","soccer"); 
    c1.setMaxAge(0);
    response.addCookie(c1); //브라우저에게 쿠키를 심으라고 명령함 
    response.addCookie(c2); //브라우저에게 쿠키를 심으라고 명령함 2.

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
브라우저에 쿠키를 심었음. <a href="page02.jsp">쿠키확인 하기</a>
</body>
</html>