<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>询价分析表</title>
<!-- bootstrap样式丢失，加绝对路径 -->
<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery.form.js"></script>
<script
	src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.css">
<style>
@media ( min-width : 1200px) {
	.container {
		width: 1470px;
	}
}
</style>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		$("#cSubmit").click(function() {
			$.ajax({
				url : "/QuotationAnalysis/find",
				data : {
					partNumber : $("#partNumber").val(),
				},
				type : "POST",
				dataType : 'json',
			});

		});
	});
</script>
<body>
	<h1 style="text-align:center">Quotation Analysis Form</h1>
	<h3 style="text-align:center">Supplier Data</h3>
	<!-- 水平和默认表单不同 -->
	<form class="form-horizontal" role="form"
		action="${pageContext.request.contextPath }/QuotationAnalysis/insert.do"
		method="post">

		<div class="form-group">
			<label for="partNumber" class="col-sm-2 control-label">partNumber</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="partNumber"
					name="partNumber" placeholder="请输入partNumber" value="">
			</div>
			<div class="col-sm-1">
				<a href="${pageContext.request.contextPath }/QuotationAnalysis/find.do"  class="btn btn-primary btn-sm" role="button"> 查询 </a>
			</div>
		</div>

		<div class="form-group">
			<label for="partDate" class="col-sm-2 control-label">partDate</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="partDate"
					name="partDate" placeholder="请输入partDate">
			</div>
		</div>
		<div class="form-group">
			<label for="drawingNoIssue" class="col-sm-2 control-label">drawingNoIssue</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="drawingNoIssue"
					name="drawingNoIssue" placeholder="请输入drawingNoIssue">
			</div>
		</div>
		<div class="form-group">
			<label for="partName" class="col-sm-2 control-label">partName</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="partName"
					name="partName" placeholder="请输入partName">
			</div>
		</div>
		<div class="form-group">
			<label for="yearlyVolume" class="col-sm-2 control-label">yearlyVolume</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="yearlyVolume"
					name="yearlyVolume" placeholder="请输入yearlyVolume">
			</div>
		</div>
		<div class="form-group">
			<label for="paymentTerms" class="col-sm-2 control-label">paymentTerms</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="paymentTerms"
					name="paymentTerms" placeholder="请输入paymentTerms">
			</div>
		</div>
		<div class="form-group">
			<label for="deliveryConditions" class="col-sm-2 control-label">deliveryConditions</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm"
					id="deliveryConditions" name="deliveryConditions"
					placeholder="请输入deliveryConditions">
			</div>
		</div>
		<div class="form-group">
			<label for="pointOfDelivery" class="col-sm-2 control-label">pointOfDelivery</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm"
					id="pointOfDelivery" name="pointOfDelivery"
					placeholder="请输入pointOfDelivery">
			</div>
		</div>
		<div class="form-group">
			<label for="supplierName" class="col-sm-2 control-label">supplierName</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="supplierName"
					name="supplierName" placeholder="请输入supplierName">
			</div>
		</div>
		<div class="form-group">
			<label for="parmaCode" class="col-sm-2 control-label">parmaCode</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="parmaCode"
					name="parmaCode" placeholder="请输入parmaCode">
			</div>
		</div>
		<div class="form-group">
			<label for="sourceCountry" class="col-sm-2 control-label">sourceCountry</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="sourceCountry"
					name="sourceCountry" placeholder="请输入sourceCountry">
			</div>
		</div>
		<div class="form-group">
			<label for="localCurrency" class="col-sm-2 control-label">localCurrency</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="localCurrency"
					name="localCurrency" placeholder="请输入localCurrency">
			</div>
		</div>
		<div class="form-group">
			<label for="buyer" class="col-sm-2 control-label">buyer</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="buyer"
					name="buyer" placeholder="请输入buyer">
			</div>
		</div>
		<div class="form-group">
			<label for="costEngineer" class="col-sm-2 control-label">costEngineer</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="costEngineer"
					name="costEngineer" placeholder="请输入costEngineer">
			</div>
		</div>
		<div class="form-group">
			<label for="miscInformation" class="col-sm-2 control-label">miscInformation</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm"
					id="miscInformation" name="miscInformation"
					placeholder="请输入miscInformation">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-9">
				<button type="submit" class="btn btn-default">提交</button>
			</div>
		</div>
	</form>


</body>

</html>