<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>주문 정보입니다.</h3>
<hr color="red">
<form action="page04.jsp">
주문물건 id: <input typwe = "text" name = "productID"><br>
주문물건 name: <input typwe = "text" name = "productName"><br>
주문총 금액 : <input typwe = "text" name = "total"><br>
주문한 사람 id : <input typwe = "text" name = "uId" value="summer"><br> 
<!-- //아이디는 세션으로 들어감 -->
<button>결제</button>


</form>
</body>
</html>