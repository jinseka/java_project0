<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h3 {
	background-color: gold; 
	font-size: 40px;  
	width: 8000px;
	height: 100px;
	font-style: italic;
	font-family: "궁서";
	font-weight: bold;
}
#result1{
	background-color: green; 
	font-size: 40px;  
	width: 8000px;
	height: 100px;
	font-style: italic;
	font-family: "궁서";
	font-weight: bold;
}
.c1{
background-color: green; 
	font-size: 40px;  
	width: 8000px;
	height: 50px;
	font-style: italic;
	font-family: "궁서";
	font-weight: bold;
}
body ul{ /*body아래에 자손중에서 ul을 찾아라  */
	color: red;
}

body> ul { /*body 바로 아래에 자식중에서 ul을 찾아라  */
	color: blue;
}

body >#result1>li{
color: aqua;;



}
ul > li {
	color: gold;
}


//*[@id="result2"]/ul


</style>
</head>
<body>

	<h3>좋아하는 과목 </h3>
		<ul>
			<li class="c1">컴퓨터</li>
			<li class="c1">영어</li>
			<li class="c1">마케팅</li>

		</ul>
	<div id="result1">결과가 보여지는 부분</div>
	<div id="result2">
		<span>나는 결과야1</span>
			<ul>
				<li>오늘은 목요일</li>
				<li>내일은 금요일</li>
			
			</ul>
	</div>
</body>
</html>


