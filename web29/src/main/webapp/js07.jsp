<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/out.css">
<script type="text/javascript">
function login(id,pw) {
	id= prompt("아이디를 입력하세요")
	pw= prompt("비밀번호를 입력하세요")
	if (id=='root' &&pw=='1234') {
		location.href = 'http://www.naver.com'
	} else {
		location.href = 'http://www.daum.net'
	}
}

	function tex() {
		price=parseInt(prompt("결제금액 입력"))
		member= prompt('1.일반 2.VIP')
		if (member == 1) {
			alert("결제 금액은 "+ (price *1.1)+ "원")
		} else if(memver ==2){
			alert("결제 금액은 "+ (price *0.9)+ "원")
		}else {
			alert("다시 입력하세요")
		}
	}		
	
</script>
</head>
<body>
<button onclick="login()">로그인 처리 기능</button>
<button onclick="tex()" >부가세 기능 처리</button>



</body>
</html>