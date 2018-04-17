<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery.form.js"></script>
<script
	src="${pageContext.request.contextPath }/bootstrap/js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/bootstrap/css/bootstrap.css">
<script type="text/javascript">
	function add() {
		$("#itemForm").ajaxSubmit();
	}
</script>
</head>
<body>
	<h1 style="text-align:center">Quotation Analysis Form</h1>
	<h3 style="text-align:center">Supplier Data</h3>
	<form id="itemForm"  role="form"
		action="${pageContext.request.contextPath }/QuotationAnalysis/saveOrUpdate.do"
		method="post">

		<div class="form-group">
			<label for="partNumber" class="col-sm-2 control-label">partNumber</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="partNumber"
					name="partNumber" value="${edit.partNumber}">
			</div>
			
		</div>

		<div class="form-group">
			<label for="partDate" class="col-sm-2 control-label">partDate</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="partDate"
					name="partDate" value="${edit.partDate}">
			</div>
		</div>
		<div class="form-group">
			<label for="drawingNoIssue" class="col-sm-2 control-label">drawingNoIssue</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="drawingNoIssue"
					name="drawingNoIssue" value="${edit.drawingNoIssue}">
			</div>
		</div>
		<div class="form-group">
			<label for="partName" class="col-sm-2 control-label">partName</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="partName"
					name="partName" value="${edit.partName}">
			</div>
		</div>
		<div class="form-group">
			<label for="yearlyVolume" class="col-sm-2 control-label">yearlyVolume</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="yearlyVolume"
					name="yearlyVolume" value="${edit.yearlyVolume}">
			</div>
		</div>
		<div class="form-group">
			<label for="paymentTerms" class="col-sm-2 control-label">paymentTerms</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="paymentTerms"
					name="paymentTerms" value="${edit.paymentTerms}">
			</div>
		</div>
		<div class="form-group">
			<label for="deliveryConditions" class="col-sm-2 control-label">deliveryConditions</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm"
					id="deliveryConditions" name="deliveryConditions"
					value="${edit.deliveryConditions}">
			</div>
		</div>
		<div class="form-group">
			<label for="pointOfDelivery" class="col-sm-2 control-label">pointOfDelivery</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm"
					id="pointOfDelivery" name="pointOfDelivery"
					value="${edit.pointOfDelivery}">
			</div>
		</div>
		<div class="form-group">
			<label for="supplierName" class="col-sm-2 control-label">supplierName</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="supplierName"
					name="supplierName" value="${edit.supplierName}">
			</div>
		</div>
		<div class="form-group">
			<label for="parmaCode" class="col-sm-2 control-label">parmaCode</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="parmaCode"
					name="parmaCode" value="${edit.parmaCode}">
			</div>
		</div>
		<div class="form-group">
			<label for="sourceCountry" class="col-sm-2 control-label">sourceCountry</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="sourceCountry"
					name="sourceCountry" value="${edit.sourceCountry}">
			</div>
		</div>
		<div class="form-group">
			<label for="localCurrency" class="col-sm-2 control-label">localCurrency</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="localCurrency"
					name="localCurrency" value="${edit.localCurrency}">
			</div>
		</div>
		<div class="form-group">
			<label for="buyer" class="col-sm-2 control-label">buyer</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="buyer"
					name="buyer" value="${edit.buyer}">
			</div>
		</div>
		<div class="form-group">
			<label for="costEngineer" class="col-sm-2 control-label">costEngineer</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="costEngineer"
					name="costEngineer" value="${edit.costEngineer}">
			</div>
		</div>
		<div class="form-group">
			<label for="miscInformation" class="col-sm-2 control-label">miscInformation</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm"
					id="miscInformation" name="miscInformation"
					value="${edit.miscInformation}">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-1">
				<button type="submit" class="btn btn-default">更新</button>
			</div>
			<div class="col-sm-1 "><!-- 请求的地址必须加单引号 -->
				<button id="delete" type="button" class="btn btn-default"
					onclick="window.location = '${pageContext.request.contextPath }/QuotationAnalysis/deleteById.do?partNumber=${edit.partNumber}'">删除</button>
			</div>
		</div>

	</form>
</body>
</html>