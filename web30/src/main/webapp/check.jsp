<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    session.setAttribute("id2", id);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function news() {
	location.href="news.jsp"
}
function mail() {
	location.href="mail.jsp"
}
function cafe() {
	location.href="cafe.jsp"
}

</script>

</head>
<body>
<button onclick="news()">new</button>
<button onclick="mail()">mail</button>
<button onclick="cafe()">cafe</button>
받은id값 : <%=session.getAttribute("id2") %>

</body>
</html>