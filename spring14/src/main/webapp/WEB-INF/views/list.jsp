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
 <hr color="pink">
<c:forEach items="${list}" var="dto">
	${dto} <br>
 
</c:forEach>

</body>
</html>