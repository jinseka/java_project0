<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
 //alert('tern project')
 function idCheck() {
	//1. id에 입력한 값 가지고 와야 함.
	//1-1. id가 "id"인 input태그를 먼저 찾아야 함.
	idTag = document.getElementById("id"); // <input name="id" id="id" value="test">

	//1-2. 그태그내에 있는 VALUE값을 가지고 면 됨.
	idValue = idTag.value; //value="test"
	alert('id is >>' + idValue);
	
	//2. 값의 글자수를 세야함.
	alert('id rength 길이>> ' + idValue.length);
	//3. 5글자 이상이 아닌 경우, 메시지를 보여주어야 함.
	result = " ";
	if (idValue.length>=5) {
		result="5글자 이상입니다.유효합니다. ";
	} else {
		result="5글자 미만입니다. 재입력해주세요 ";

	}
 
 	divTag = document.getElementById("result"); // <div id="result"><div>
 	divTag.innerHTML = result;
 
 }
 
  function pwCheck() {
	 pwTag =document.getElementById("pw1");
	 pwTag2 =document.getElementById("pw2");
	 
	 pwValue = pwTag.value;
	 pwValue2 = pwTag2.value;
	 result="";
	 
	 if (pwValue == pwValue2) {
		result="동일합니다. <img src=img/김연아.jpg>"
	} else {
		result="동일하지 않습니다. <img src=img/김연경.gif>"

	}
	 
	 	divTag = document.getElementById("result"); // 
	 	divTag.innerHTML = result;
	 	pwTag.value=" ";
	 	pwTag2.value=" ";
	
} 
</script>
</head>
<body>
<h3>자바 스크립트 테스트</h3>
<hr>
아이디:  <input name="id" id="id" value=""> <button onclick="idCheck()" id="b1" style="color:blue; background:pink; width:100px; height:20px" >글자수 체크</button>  <br>
패스워드 :  <input name="pw1" id="pw1"> <br>
패스워드2 :  <input name="pw2" id="pw2"> <button onclick="pwCheck()" id="b2" style="color:white; background:lime; width:100px; height:20px">패스워드 동일 여부 체크</button><br>
<hr>
<div id="result" style="color:red; background:pink; width:500px; height:50px; font-size:30px"></div>
</body>
</html>