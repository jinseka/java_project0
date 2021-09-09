<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    <!--페이지 지시자 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h1 >전체목록 가져오기 !  ! ! !! </h1>
 전체 프린트 : ${list}
 <img alt="" src="resources/img/6.jpg" >
 <hr color="pink">
<table border=1 >
	<tr bgcolor="pink">
		<td width="100">번호</td>
		<td width="100">제목</td>
		<td width="100">내용</td>
		<td width="100">글쓴이</td>
		<td width="100">상세페이지</td>
		<td width="100">삭제</td>
	
	
	</tr>
	<c:forEach items="${list}" var="dto">
		${dto} <br>
	<tr bgcolor="pink">
		<td width="100">${dto.id}</td>
		<td width="100">${dto.title}</td>
		<td width="100">${dto.content}</td>
		<td width="100">${dto.writer}</td>
		<td width="100">
			<a href="one1?id=${dto.id}">
		<!--http://localhost:8050/mvc14/one1?id=123  -->
			<button style="background-color: pink">상세페이지</button>
		</a>
	</td>
		<td width="100">
			<a href="">
				<button style="background-color: pink">삭제</button>
			</a>
		</td>
	</tr>
	 
	</c:forEach>

</table>
</body>
</html>