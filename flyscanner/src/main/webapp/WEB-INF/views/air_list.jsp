<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page ="header.jsp"></jsp:include>
<!-- 예약 파트 시작-->
    <section class="booking_part">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="booking_menu">
								<h1>항공권 </h1>
                        <ul class="nav nav-tabs" id="myTab" role="tablist">
                            <li class="nav-item">
                            <a class="nav-link active" id="hotel-tab" data-toggle="tab" href="#hotel" role="tab" aria-controls="hotel" aria-selected="true">항공권</a>
                            </li>
                        </ul>
                        
                    </div>
                </div>
                <div class="col-lg-12">
                    <div class="booking_content">
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="tiket" role="tabpanel" aria-labelledby="hotel-tab">
                                <div class="booking_form">
                                    <form action="#">
                                        <div class="form-row">
                                            <div class="form_colum">
                                                <select class="nc_select" name="selectedBox">
                                                    <option selected>출발 장소  </option>
                                                    <option value="1">서울,대한민국</option>
                                                    <option value="2">런던,영국</option>
                                                    <option value="3">도쿄,일본</option>
                                                    <option value="4">뉴욕,미국</option>
                                                    <option value="5">시드니,오스트레일리아</option>
                                                </select>
                                           </div>
                                           
                                           <div class="form_colum">
                                              <select class="nc_select" name="selectedBox">
                                                    <option selected>도착 장소  </option>
                                                      <option value="1">서울,대한민국</option>
                                                    <option value="2">런던,영국</option>
                                                    <option value="3">도쿄,일본</option>
                                                    <option value="4">뉴욕,미국</option>
                                                    <option value="5">시드니,오스트레일리아</option>
                                                </select>
                                            </div>
              
                                            <div class="form_colum">
                                                <div role="wrapper" class="gj-datepicker gj-datepicker-md gj-unselectable">
                                                <input id="SPDATE" placeholder="출발 날짜" data-type="datepicker1" data-guid="4df0005c-3725-c600-3c40-f07654cc7355" data-datepicker="true" class="gj-textbox-md" role="input">
                                                <i class="gj-icon" role="right-icon"></i></div>
                                           
                                           </div>
                                    	  	<div class="form_colum">	
                                                <div role="wrapper" class="gj-datepicker gj-datepicker-md gj-unselectable">
                                                <input id="STDATE" placeholder="도착 날짜" data-type="datepicker2"  data-guid="f93ce276-0c6e-dc79-2d00-ff8d3cc4c980" data-datepicker="true" class="gj-textbox-md" role="input">
                                                <i class="gj-icon" role="right-icon"></i></div>
                                            </div>
                                       
                                            <div class="form_colum">
                                                <select class="nc_select" name="selectedBox">
                                                    <option selected>인원 </option>
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                    <option value="6">6</option>
                                                    <option value="7">7</option>
                                                    <option value="8">8</option>
                                                    <option value="9">9</option>
                                                    <option value="10">10</option>
                                                </select>
                                            </div>
                                              <div class="form_btn">
                                            <input type="submit" class="btn_1" value ="찾기"> &nbsp;&nbsp;
                                                <a href = "air_list" class="btn_1" >전체 보기</a>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                            
                            
                                   </div>
                                </div>
                            </div>
                        </div>
                    </div>
    </section>
    <!-- 헤더 파트 끝-->

<table border=1  align="center">
    
	<tr bgcolor="#0A82FF" align="center" style="color: white">
		<td width="100" >티켓번호</td>
		<td width="100">티켓가격</td>
		<td width="100">출발지</td>
		<td width="100">도착지</td>
		<td width="100">출발시간</td>
		<td width="100">도착시간</td>
		<td width="100">인원</td>
		<td width="100">상세페이지</td>
	</tr>
	<c:forEach items="${list}" var="dto">
	<tr align="center">
		<td width="100">${dto.ticketno}</td>
		<td width="100">${dto.ticketprice}</td>
		<td width="100">${dto.ticketst}</td>
		<td width="100">${dto.ticketsp}</td>
		<td width="100">${dto.stdate}</td>
		<td width="100">${dto.spdate}</td>
		<td width="100">${dto.people}</td>
		<td width="100">
			 <a href="one.do?id=${dto.ticketno}">
				<button style="background: #fe5c24;; color: white">상세페이지로</button>
			</a> 
	</tr>
	</c:forEach>
</table>

 <jsp:include page ="footer.jsp"></jsp:include>

</body>
</html>