<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>询价分析表</title>

<script src="./js/jquery.js"></script>
<script src="./bootstrap/js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.css">

</head>
<body> 
<h1 style="text-align:center">Quotation Analysis Form</h1>
<h3 style="text-align:center">Supplier Data</h3>
<form class="form-horizontal" role="form" action="${pageContext.request.contextPath }/QuotationAnalysis/insert.do" method="post">
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">partNumber</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="partNumber" name="partNumber"
				   placeholder="请输入partNumber">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">partDate</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="partDate" name="partDate"
				   placeholder="请输入partDate">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">drawingNoIssue</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="drawingNoIssue" name="drawingNoIssue"
				   placeholder="请输入drawingNoIssue">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">partName</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="partName" name="partName"
				   placeholder="请输入partName">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">yearlyVolume</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="yearlyVolume" name="yearlyVolume"
				   placeholder="请输入yearlyVolume">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">paymentTerms</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="paymentTerms" name="paymentTerms"
				   placeholder="请输入paymentTerms">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">deliveryConditions</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="deliveryConditions" name="deliveryConditions"
				   placeholder="请输入deliveryConditions">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">pointOfDelivery</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="pointOfDelivery" name="pointOfDelivery"
				   placeholder="请输入pointOfDelivery">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">supplierName</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="supplierName" name="supplierName"
				   placeholder="请输入supplierName">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">parmaCode</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="parmaCode" name="parmaCode"
				   placeholder="请输入parmaCode">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">sourceCountry</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="sourceCountry" name="sourceCountry"
				   placeholder="请输入sourceCountry">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">localCurrency</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="localCurrency" name="localCurrency"
				   placeholder="请输入localCurrency">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">buyer</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="buyer" name="buyer"
				   placeholder="请输入buyer">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">costEngineer</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="costEngineer" name="costEngineer"
				   placeholder="请输入costEngineer">
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">miscInformation</label>
		<div class="col-sm-9">
			<input type="text" class="form-control input-sm" id="miscInformation" name="miscInformation"
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