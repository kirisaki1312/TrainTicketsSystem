<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<title>12307高铁订票系统</title>

<script>
	$(function(){
		$("div.queryErrorMessageDiv").css("visibility","hidden");
		<c:if test="${!empty msg}">
		$("span.errorMessage").html("${msg}");
		$("div.queryErrorMessageDiv").css("visibility","visible");
		</c:if>

		$(".queryFrom").submit(function(){
			if(0==$("#selectStartCity").val().length){
				$("span.errorMessage").html("请选择出发城市");
				$("div.queryErrorMessageDiv").css("visibility","visible");
				$("div.queryErrorMessageDiv").show();
				return false;
			}
			if(0==$("#selectEndCity").val().length){
				$("span.errorMessage").html("请选择到达城市");
				$("div.queryErrorMessageDiv").css("visibility","visible");
				$("div.queryErrorMessageDiv").show();
				return false;
			}
			if($("#selectStartCity").val() == $("#selectEndCity").val()){
				$("span.errorMessage").html("请勿选择相同城市");
				$("div.queryErrorMessageDiv").css("visibility","visible");
				$("div.queryErrorMessageDiv").show();
				return false;
			}
			if(0==$("#selectDate").val().length){
				$("span.errorMessage").html("请选择出发日期");
				$("div.queryErrorMessageDiv").css("visibility","visible");
				$("div.queryErrorMessageDiv").show();
				return false;
			}


			return true;
		});
	})
</script>


<div class="homepageDiv">
	<div class="container" align="center">
	<%--<div class="col-lg-6" align="center">--%>
		<form class="queryFrom" action="forequeryTicket" method="post">

			<div class="queryErrorMessageDiv" style="width:400px ;height:50px ;">
				<div class="alert alert-danger" role="alert">
					<!-- 由于某种原因这个用于关闭警告的button没有显示 -->
					<button type="button" class="close" data-dismiss="alert" aria-label="Close"></button>
					<span class="errorMessage"></span>
				</div>
			</div>

			<select id="selectStartCity" class="selectpicker show-tick" name="start_city" title="请选择一项" data-live-search="true" data-size="5">
				<c:forEach items="${stops}" var="s">
					<option value="${s.city_name}">${s.city_name}</option>
				</c:forEach>
			</select>
			&nbsp;&nbsp;&nbsp;&nbsp;
			<span class="glyphicon glyphicon-arrow-right"></span>
			&nbsp;&nbsp;&nbsp;&nbsp;
			<select id="selectEndCity" class="selectpicker show-tick" name="end_city" title="请选择一项" data-live-search="true" data-size="5">
				<c:forEach items="${stops}" var="s">
					<option value="${s.city_name}">${s.city_name}</option>
				</c:forEach>
			</select>
			<br/><br/>
			<div class="form-group">
				<div class="input-group date form_date col-md-4" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
					<input class="form-control" size="16" type="text" value="" readonly name="date" id="selectDate">
					<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
					<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
				</div>
			<%--<input type="hidden" id="dtp_input2" value="" /><br/>--%>
			</div>
			<div style="margin-top:20px">
				<button class="btn redButton" type="submit">火 车 票 查 询</button>
			</div>

		</form>
	<%--</div>--%>
	</div>
</div>

<br/><br/>

<script>
	$('.form_date').datetimepicker({
		language:  'zh-CN',
		weekStart: 1,
		todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0
	});
</script>
