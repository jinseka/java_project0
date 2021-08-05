<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
	Cookie[] list=request.getCookies();
	for(Cookie c : list){   //for each를 많이 사용한다.
		//out: 브라우저에 텍스트로 프린트 하고자 하는 경우
		//out.print(c.getName()+","+ c.getValue() + "<br>"); 
		//쿠키의 이름이 age인 값만 프린트 해보아라 . 
		if(!c.getName().equals("JSESSIONID")){
			out.print(c.getValue()+"<br>");
%>
			<%= c.getValue() %> <br>			
	<%	}
		
	}

	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href = "page03.jsp">page03</a>
</body>
</html>