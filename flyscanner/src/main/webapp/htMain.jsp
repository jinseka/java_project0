<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript">
$(function() {
		//input을 datepicker로 선언
		$("#datepicker_in").datepicker({
			dateFormat: 'yy-mm-dd' //달력 날짜 형태
			,showOtherMonths: true //빈 공간에 현재월의 앞뒤월의 날짜를 표시
			,showMonthAfterYear:true // 월- 년 순서가아닌 년도 - 월 순서
			,changeYear: true //option값 년 선택 가능
			,changeMonth: true //option값  월 선택 가능                
			,yearSuffix: "년" //달력의 년도 부분 뒤 텍스트
			,monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 텍스트
			,monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 Tooltip
			,dayNamesMin: ['일','월','화','수','목','금','토'] //달력의 요일 텍스트
			,dayNames: ['일요일','월요일','화요일','수요일','목요일','금요일','토요일'] //달력의 요일 Tooltip
			,minDate: "-5Y" //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
			,maxDate: "+5y" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)  
			,yearRange: "2021:2023"
			,minDate: 0 //과거 날짜를 선택하지 못하도록 비활성화
			,onSelect: function(selected) {
				$("#datepicker_out").datepicker("option","minDate", selected)
				}
		});
		$("#datepicker_out").datepicker({
			dateFormat: 'yy-mm-dd' //달력 날짜 형태
			,showOtherMonths: true //빈 공간에 현재월의 앞뒤월의 날짜를 표시
			,showMonthAfterYear:true // 월- 년 순서가아닌 년도 - 월 순서
			,changeYear: true //option값 년 선택 가능
			,changeMonth: true //option값  월 선택 가능                
			,yearSuffix: "년" //달력의 년도 부분 뒤 텍스트
			,monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 텍스트
			,monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'] //달력의 월 부분 Tooltip
			,dayNamesMin: ['일','월','화','수','목','금','토'] //달력의 요일 텍스트
			,dayNames: ['일요일','월요일','화요일','수요일','목요일','금요일','토요일'] //달력의 요일 Tooltip
			,minDate: "-5Y" //최소 선택일자(-1D:하루전, -1M:한달전, -1Y:일년전)
			,maxDate: "+5y" //최대 선택일자(+1D:하루후, -1M:한달후, -1Y:일년후)  
			,yearRange: "2021:2023"
			,minDate: 0 //과거 날짜를 선택하지 못하도록 비활성화
			,onSelect: function(selected) {
				$("#datepicker_in").datepicker("option","maxDate", selected)
				}
		});
		//초기값을 오늘 날짜로 설정
	    $('#datepicker_in').datepicker('setDate', '-7D'); //(-1D:하루전, -1M:한달전, -1Y:일년전), (+1D:하루후, -1M:한달후, -1Y:일년후)
	    $('#datepicker_out').datepicker('setDate', '+1D'); //(-1D:하루전, -1M:한달전, -1Y:일년전), (+1D:하루후, -1M:한달후, -1Y:일년후)
	});
</script>
</head>
<body>
	<div
		style="background: blue; text-align: center; color: white; height: 50px; line-height: 50px">
		<h3>검색 메인 페이지</h3>
	</div>
	<div align="center">
		<br> <br>
		<form action="key.hotel">
			<table>
				<tr align="left">
					<td style="color: blue; font-weight: bold">어디로 가시나요?</td>
				</tr>
				<tr>
					<td>목적지 또는 호텔명</td>
					<td>체크인</td>
					<td>체크아웃</td>
					<td>투숙객 및 객실</td>
				</tr>
				<tr>
					<td><input name="keyword"></td>
					<td><input type="text" id="datepicker_in"></td>
					<td><input type="text" id="datepicker_out"></td>
					<td><input name="count"></td>
				</tr>
				<tr align="right">
					<td colspan="4"><button>투숙할 지역 검색</button></td>
				</tr>
			</table>
		</form>

		<!-- <form action="search.hotel"> -->
		<!-- 	사업자번호: <input name="hid"><br> -->
		<!-- 	<button>호텔정보 검색 요청</button> -->
		<!-- </form> -->
	</div>
</body>
</html>