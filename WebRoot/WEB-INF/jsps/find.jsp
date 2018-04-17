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
</head>
<body>
	<h1 style="text-align:center">Quotation Analysis Form</h1>
	<h3 style="text-align:center">Supplier Data</h3>
	<form class="form-horizontal" role="form"
		action="${pageContext.request.contextPath }/QuotationAnalysis/find.do"
		method="post">

		<div class="form-group">
			<label for="partNumber" class="col-sm-2 control-label">partNumber</label>
			<div class="col-sm-9">
				<input type="text" class="form-control input-sm" id="partNumber"
					name="partNumber" placeholder="请输入partNumber">
			</div>

			<div class="col-sm-1">
				<button type="submit" class="btn btn-default btn-sm">查询</button>
			</div>
		</div>
	</form>
</body>
</html>