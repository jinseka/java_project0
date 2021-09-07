<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//자바 스크립트는 변수에 들어가는 데이터의 타입이 값이 들어갈때 결정  !  
	num1 = prompt("패스워드1를 입력해 주세요 ! ");
	num2 = prompt("패스워드2를 입력해 주세요 ! ");

	num11 = parseInt(num1);
	num22 = parseInt(num2);
	if (num11==num22) {
		alert("일치합니다 ")
		
	} else {
		alert("일치하지 않습니다 ")

	}
</script>

</head>
<body>

</body>
</html>