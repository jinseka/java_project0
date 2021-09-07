<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/out.css">
</head>
<body>
<div id="total">
	<div id="top">
		<jsp:include page="top.jsp"></jsp:include>
	</div>
	<div id="top2">
		<jsp:include page="top2.jsp"></jsp:include>
	</div>
	<div id="center">
		<form action="insert2.jsp">
		   아이디: <input name = "id"><br>
		   이름: <input name = "title"><br>
		   내용: <input name = "content"><br>
		   가격: <input name = "writer"><br>
   			<button>상품</button>
		</form>
		  <h3>상품 하나 검색</h3>
      <form action="read3.jsp">
         ID: <input name = "id"><br>
            <button>상품 하나 검색 처리</button>
      </form>
      <a href="all2.jsp">상품 모든 목록 가지고 오는 </a> <br>

	</div>
</div>


</body>
</html>