<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title >Insert title here</title>
</head>
<body>
welcome! !  login page. ! 
<hr >
<form action="create">
id : <input name ="id" > <br>
pw : <input name ="pw" > <br>
name : <input name ="name" > <br>
tel : <input name ="tel" > <br>
<button > 회원 가입 </button>
</form>

<hr>
<form action="password.mega">
password : <input name ="pass"> <br>
<button > 암호 처리 요청</button>
</form>
<hr>
<form action="login.mega">
id : <input name ="id" > <br>
pw : <input name ="pw" > <br>
<button > 로그인 처리 요청</button>
</form>
<hr>
<form action="check">
nickName : <input name ="nick"> <br>
<button > 닉네임 처리 요청</button>
</form>
</body>
</html>