<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- ajax CDN -->
<script src="//code.jquery.com/jquery-3.2.1.min.js"></script>

<!-- 달력 CDN  -->
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<!-- BS CDN -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<!-- CSS -->
<link href="css/style2.css" rel="stylesheet">

<script>
	$(function(){
		$("#btn").click(function() {
			$("#result2").empty()
			var conList = []
			var themeList = []

			$("input[name='continent']:checked").each(function(){
				conList.push($(this).val())
            })
            
			$("input[name='theme']:checked").each(function(){
				themeList.push($(this).val())
            })
			
			$.ajax({
				url: "menu_recommend/searching.jsp",
				data: {
					continent: conList,
					theme: themeList
				},
				traditional: true,
				success : function(data) {
					list = data.split(',')

					for(var i=0; i < list.length-1; i++) {
						$("#result2").append("<button id='btnCountry'>"+list[i]+"</button>&nbsp;&nbsp;")
					}
				}
			})
		})
		
		$(document).on("click", "#btnCountry", function (e) {
			console.log(e)
			name = $("#btnCountry").text()
			document.getElementById("arriveCtID").value = name
		});
		
		$("#departTime").datepicker({
			dateFormat: "yy-mm-dd",
			changeYear: true,
			changeMonth: true,
			minDate: 0,
			maxDate: "+1m +1w",
			onClose: function (selectedDate) {
				$("#arriveTime").datepicker("option", "minDate", selectedDate);
			}
		});
		
		$("#arriveTime").datepicker({
			dateFormat: "yy-mm-dd",
			changeYear: true,
			changeMonth: true,
			minDate: 0,
			maxDate: "+1m +1w",
			onClose: function (selectedDate) {
				$("#departTime").datepicker("option", "maxDate", selectedDate);
			}
		});
		
		$("#twoway").click(function() {
			if($(this).is(":checked")){
				$("#arriveTime").show();
			}
		});
		
		$("#oneway").click(function() {
			if($(this).is(":checked")){
				$("#arriveTime").hide();
			}
		});
		
	});

</script>

</head>
<body>
<jsp:include page ="header.jsp"></jsp:include>
  <section id="hero">
    <div class="hero-container">
      <h1>어디로 떠나볼까요?</h1>
      <form action="menu_search/search.jsp" method="get" role="form" class="form-inline">
      	<div class="form-row" id="rs">
      		<div class="radio">
      			<input type="radio" value="2" name="way" checked="checked" id="twoway" class="form-control">
      			<label class="radio">왕복</label>
      		</div>
      		<div class="radio">
      			<input type="radio" value="1" name="way" id="oneway" class="form-control">
      			<label class="radio">편도</label>
      		</div>
      	</div>
      	
      	<div class="form-row">
      		<div class="form-group">
      			<input type="text" name="departCtID" placeholder="출발국가" class="form-control" id="departCtID">
      		</div>
      		<div class="form-group">
      			<input type="text" name="arriveCtID" placeholder="도착국가" class="form-control" id="arriveCtID">
      		</div>
      		<div class="form-group">
      			<input type="text" name="departTime" placeholder="출발일" id="departTime" class="form-control">
      		</div>
      		<div class="form-group">
      			<input type="text" name="arriveTime" placeholder="도착일" id="arriveTime" class="form-control">
      		</div>
      		<div class="form-group">
      			<input type="text" name="seat" placeholder="인원" value="1" class="form-control">
      		</div>
      	</div>
      	
      	<div class="form-row">
     			<button type="submit" id="btnSearch" class="btn btn-info btn-lg">검색</button>
      	</div>
      </form>
    </div>
  </section>
  
  <jsp:include page ="footer.jsp"></jsp:include>
  
</body>
</html>