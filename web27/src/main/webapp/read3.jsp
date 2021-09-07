<%@page import="shop.db.ProductDAO"%>
<%@page import="shop.dto.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
//db처리하는 dao한테 주면서 검색하는 sql문을 만들어서 전송

//가방을 만들어서 테이터를 넣자.
ProductDTO bag = new ProductDTO();
bag.setId(id);

//DAO를 만들어서 검색요청!!
	ProductDAO dao = new ProductDAO();

	ProductDTO bag2=dao.read(bag);

	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상품 검색결과입니다.</h3>
<hr color="pink">
<table border=1>
<tr bgcolor="pink">
<th>아이디</th>
<th>이름</th>
<th>내용</th>
<th>가격</th>
</tr>
 <tr>
 
 
 <td><%= bag2.getId() %></td>
 <td><%= bag2.getName() %></td>
 <td><%= bag2.getContent() %> </td>
 <td><%= bag2.getPrice() %></td>
</tr>

</table>
</body>
</html>