<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Title</title>
<script src="./js/jquery.js"></script>
<script src="./bootstrap/js/bootstrap.js"></script>
<script src="./bootstrap/js/bootstrap-table.js"></script>
<script src="./bootstrap/js/bootstrap-table-zh-CN.js"></script>

<script src="resources/plugins/jquery.1.12.4.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="./bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="./bootstrap/css/bootstrap-table.css">
<link rel="stylesheet" type="text/css" href="resources/css/common.css">

<script src="resources/plugins/bootstrap-3.3.0/js/bootstrap.min.js"></script>
<script
	src="resources/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>
<script src="resources/plugins/bootstrap-table/dist/bootstrap-table.css"></script>
<script src="resources/plugins/waves-0.7.5/waves.min.js"></script>
<script src="resources/plugins/jquery-confirm/jquery-confirm.min.js"></script>
<script src="resources/plugins/select2/js/select2.min.js"></script>

<!-- 导入数据编辑插件  -->
<link
	href="resources/plugins/bootstrap-editable/css/bootstrap-editable.css"
	rel="stylesheet">
<script
	src="resources/plugins/bootstrap-editable/js/bootstrap-editable.js"></script>

<script
	src="resources/plugins/bootstrap-table/src/extensions/editable/bootstrap-table-editable.js"></script>

<script src="resources/plugins/tableExport.js"></script>
<script
	src="resources/plugins/bootstrap-table/src/extensions/export/bootstrap-table-export.js"></script>

<style>
@media ( min-width : 1300px) {
	.container {
		width: 1480px;
	}
}

#header {
	margin-top: 25px;
	font-size: 30px;
	text-align: center;
}

#title {
	font-size: 25px;
	text-align: center;
}

#title1 {
	font-size: 20px;
	text-align: center;
	margin-bottom: 20px;
}

#main div p button {
	float: right;
}

#main div p {
	text-align: center;
	font-size: 22px;
}
</style>



<link href="resources/plugins/waves-0.7.5/waves.min.css"
	rel="stylesheet" />

<link href="resources/plugins/font-awesome-4.7.0/css/font-awesome.css"
	rel="stylesheet" />

<link href="resources/plugins/jquery-confirm/jquery-confirm.min.css"
	rel="stylesheet" />
<link href="resources/plugins/select2/css/select2.min.css"
	rel="stylesheet" />
</head>
<body>

	<div id="header">VOLVO</div>
	<div id="title">Material and Process Breakdown</div>
	<div id="title1">Standard Parts</div>
	


	<div id="main">
		<div id="toolbar">
			<a class="waves-effect waves-button" href="javascript:;"
				onclick="createAction()"><i class="zmdi zmdi-plus"></i> 增加数据</a> <a
				class="waves-effect waves-button" href="javascript:;"
				onclick="updateAction()"><i class="zmdi zmdi-edit"></i> 编辑数据</a> <a
				class="waves-effect waves-button" href="javascript:;"
				onclick="deleteAction()"><i class="zmdi zmdi-close"></i> 删除数据</a>
		</div>
		<table id="table"></table>
	</div>
	<!-- 新增 -->


	<div id="createDialog" class="crudDialog" hidden>

		<form id="itemForm" class="form-horizontal" role="form"
			action="QuotationAnalysis/insert.do" method="post">




			<div class="form-group">
				<label for="partNumber" class="col-sm-2 control-label">partNumber</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm" id="partNumber"
						name="partNumber">
				</div>

			</div>

			<div class="form-group">
				<label for="partDate" class="col-sm-2 control-label">partDate</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm" id="partDate"
						name="partDate">
				</div>
			</div>
			<div class="form-group">
				<label for="drawingNoIssue" class="col-sm-2 control-label">drawingNoIssue</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm"
						id="drawingNoIssue" name="drawingNoIssue">
				</div>
			</div>
			<div class="form-group">
				<label for="partName" class="col-sm-2 control-label">partName</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm" id="partName"
						name="partName">
				</div>
			</div>
			<div class="form-group">
				<label for="yearlyVolume" class="col-sm-2 control-label">yearlyVolume</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm" id="yearlyVolume"
						name="yearlyVolume">
				</div>
			</div>
			<div class="form-group">
				<label for="paymentTerms" class="col-sm-2 control-label">paymentTerms</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm" id="paymentTerms"
						name="paymentTerms">
				</div>
			</div>
			<div class="form-group">
				<label for="deliveryConditions" class="col-sm-2 control-label">deliveryConditions</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm"
						id="deliveryConditions" name="deliveryConditions">
				</div>
			</div>
			<div class="form-group">
				<label for="pointOfDelivery" class="col-sm-2 control-label">pointOfDelivery</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm"
						id="pointOfDelivery" name="pointOfDelivery">
				</div>
			</div>
			<div class="form-group">
				<label for="supplierName" class="col-sm-2 control-label">supplierName</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm" id="supplierName"
						name="supplierName">
				</div>
			</div>
			<div class="form-group">
				<label for="parmaCode" class="col-sm-2 control-label">parmaCode</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm" id="parmaCode"
						name="parmaCode">
				</div>
			</div>
			<div class="form-group">
				<label for="sourceCountry" class="col-sm-2 control-label">sourceCountry</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm" id="sourceCountry"
						name="sourceCountry">
				</div>
			</div>
			<div class="form-group">
				<label for="localCurrency" class="col-sm-2 control-label">localCurrency</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm" id="localCurrency"
						name="localCurrency">
				</div>
			</div>
			<div class="form-group">
				<label for="buyer" class="col-sm-2 control-label">buyer</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm" id="buyer"
						name="buyer">
				</div>
			</div>
			<div class="form-group">
				<label for="costEngineer" class="col-sm-2 control-label">costEngineer</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm" id="costEngineer"
						name="costEngineer">
				</div>
			</div>
			<div class="form-group">
				<label for="miscInformation" class="col-sm-2 control-label">miscInformation</label>
				<div class="col-sm-9 col-sm-offset-4">
					<input type="text" class="form-control input-sm"
						id="miscInformation" name="miscInformation">
				</div>
			</div>



			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-1">
					<button type="submit" class="btn btn-default">确定</button>
				</div>

			</div>

		</form>

	</div>

	<script src="resources/js/common.js"></script>

	<script>
		$.fn.editable.defaults.mode = 'inline';
		var $table = $('#table');
		$(function() {
			$(document).on('focus', 'input[type="text"]', function() {
				$(this).parent().find('label').addClass('active');
			}).on('blur', 'input[type="text"]', function() {
				if ($(this).val() == '') {
					$(this).parent().find('label').removeClass('active');
				}
			});
			// bootstrap table初始化
			// http://bootstrap-table.wenzhixin.net.cn/zh-cn/documentation/
			$table.bootstrapTable({
				url : 'QuotationAnalysis/findAll.do', //这个就是请求的json地址		
				height : getHeight(), //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
				striped : true, //是否显示行间隔色
				search : true,
				searchOnEnterKey : true,
				showRefresh : true,
				/* 	showToggle : true, */
				showColumns : true,
				/* 	minimumCountColumns : 2, */
				showPaginationSwitch : true,
				clickToSelect : true, //是否启用点击选中行
				pagination : true, //是否显示分页（*）
				/* 	paginationLoop : false, */
				/* 	classes : 'table table-hover table-no-bordered', */
				//sidePagination: 'server',
				//silentSort: false,
				smartDisplay : true,
				idField : 'partNumber',
				sortName : 'partNumber',
				sortOrder : 'asc', ///排序方式
				searchOnEnterKey : true,
				uniqueId : "partNumber", //每一行的唯一标识，一般为主键列
				idField : 'partNumber',
				id : 'partNumber',
				showExport : true, //是否启用导出数据插件
				exportDataType : 'basic', //basic', 'all', 'selected'.
				exportOptions : { //导出时忽略checkbox列
					ignoreColumn : [ 'action' ]
				},
				maintainSelected : true,
				toolbar : '#toolbar',
				onEditableSave : function(field, row, oldValue, $el) {
					//$.post("QuotationAnalysis/saveOrUpdate.do", row);
	
					delete row['state'];
					console.log(row)
					row['partDate'] = changeDateFormat(row['partDate']);
					$.ajax({
						type : 'POST',
						async : false,
						contentType : 'application/x-www-form-urlencoded; charset=UTF-8',
						url : 'QuotationAnalysis/saveOrUpdate.do',
						data : row
					});
	
					/* $.ajax({
						success : function(data, status) {
							if (status == "success") {
								alert("编辑成功");
							}
						},
						error : function() {
							alert("Error");
						},
						complete : function() {}
					}); */
	
	
				},
				columns : [
					{
						field : 'state',
						checkbox : true
					},
					{
						field : 'action',
						title : '操　作',
						halign : 'center',
						align : 'center',
						formatter : 'actionFormatter',
						events : 'actionEvents',
						clickToSelect : false
					},
					{
						field : 'partNumber',
						title : 'partNumber',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						}
					},
					{
						field : 'partDate',
						title : 'partDate',
						sortable : true,
						halign : 'center',
						formatter : function(value, row, index) {
							return changeDateFormat(value)
						},
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						}
	
					//editable : 'date'
					},
	
					{
						field : 'drawingNoIssue',
						title : 'drawingNoIssue',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
						}
					},
					{
						field : 'partName',
						title : 'partName',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						}
					},
	
					{
						field : 'yearlyVolume',
						title : 'yearlyVolume',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						}
					},
					{
						field : 'paymentTerms',
						title : 'paymentTerms',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						}
					},
					{
						field : 'deliveryConditions',
						title : 'deliveryConditions',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						}
					},
					{
						field : 'pointOfDelivery',
						title : 'pointOfDelivery',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						}
					},
					{
						field : 'supplierName',
						title : 'supplierName',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						}
					},
					{
						field : 'parmaCode',
						title : 'parmaCode',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						}
					},
					{
						field : 'sourceCountry',
						title : 'sourceCountry',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						}
					},
					{
						field : 'localCurrency',
						title : 'localCurrency',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						}
					},
					{
						field : 'buyer',
						title : 'buyer',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						}
					},
					{
						field : 'costEngineer',
						title : 'costEngineer',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						}
					},
					{
						field : 'miscInformation',
						title : 'miscInformation',
						sortable : true,
						halign : 'center',
						editable : {
							type : 'text',
							validate : function(value) {
								if ($.trim(value) == '') {
									return '数据不能为空';
								}
							}
						},
						noeditFormatter : function(value, row, index) {
							var result = {
								filed : "miscInformation",
								value : value,
								class : "badge",
								style : "background:#333;padding:5px 10px;"
							};
							return result;
						}
					}
				]
			}).on('all.bs.table', function(e, name, args) {
				$('[data-toggle="tooltip"]').tooltip();
				$('[data-toggle="popover"]').popover();
			});
	
	
	
		});
		function actionFormatter(value, row, index) {
			return [
				'<a class="edit ml10" href="javascript:void(0)" data-toggle="tooltip" title="submit"><i class="glyphicon glyphicon-ok"></i></a>　',
				//'<a class="plus ml10" href="javascript:void(0)" data-toggle="tooltip" title="Plus"><i class="glyphicon glyphicon-plus"></i></a>',
				'<a class="remove ml10" href="javascript:void(0)" data-toggle="tooltip" title="Remove"><i class="glyphicon glyphicon-minus"></i></a>'
			].join('');
		}
	
		//修改——转换日期格式(时间戳转换为datetime格式)  
		function changeDateFormat(cellval) {
			if (cellval != null) {
				var date = new Date(cellval);
				var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
				var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
				return date.getFullYear() + "/" + month + "/" + currentDate;
			}
		}
	
		function addRow(insertIndex, rowObj) {
			var insertRow = rowObj;
			var myDate = new Date();
			$.each(insertRow, function(name, value) {
				insertRow[name] = '';
			});
	
			var params = {
				index : insertIndex + 1,
				row : insertRow
			};
			$('#table').bootstrapTable('insertRow', params);
		}
	
	
	
		// 改变 input 编辑框值时，更新 data 数据，便于新增行时原来填写好的数据不会被新增行强制覆盖
		function reloadRowData(obj, row, key, index) {
			row[key] = obj.val();
			$('#dbtableDefTb').bootstrapTable('getOptions').data.splice(index, 1, row);
		}
	
	
	
		window.actionEvents = {
			'click .plus' : function(e, value, row, index) {
				var insertRow = [];
				var myDate = new Date();
				$.each(row, function(name, value) {
					if (name != 'partNumber') {
						if (name != 'partDate') {
							insertRow[name] = '';
						} else {
							insertRow[name] = myDate.getFullYear() + '/' + (myDate.getMonth().valueOf() + 1) + '/' + myDate.getDate();
						}
					} else {
						insertRow[name] = value + 1;
					}
				});
				//console.log(insertRow);
	
				var params = {
					row : insertRow,
					index : index + 1
				};
				$('#table').bootstrapTable('insertRow', params);
	
	
	
	
			},
	
			'click .remove' : function(e, value, row, index) {
				//alert('You click edit icon, row: ' + JSON.stringify(row));
				$.post("QuotationAnalysis/deleteById.do", {
					'partNumber' : row["partNumber"]
				});
				alert("已删除");
				location.reload();
	
			//console.log(value, row, index);
			},
			'click .edit' : function(e, value, row, index) {
				var rows = $table.bootstrapTable('getSelections');
				console.log(rows[0]);
				row = rows[0];
				delete row['state'];
				row['partDate'] = changeDateFormat(row['partDate']);
				
				var convArrToObj = function(array) {
					var thisEleObj = new Object();
					if (typeof array == "object") {
						for (var i in array) {
							var thisEle = convArrToObj(array[i]);
							thisEleObj[i] = thisEle;
						}
					} else {
						thisEleObj = array;
					}
					return thisEleObj;
				}
				console.log(convArrToObj(row))
	
	
	
				$.ajax({
					type : 'POST',
					async : false,
					contentType : 'application/x-www-form-urlencoded; charset=UTF-8',
					url : 'QuotationAnalysis/insert.do',
					data : convArrToObj(row)
				});
	
	
				//$.post("QuotationAnalysis/insert.do", row);
	
			//location.reload();
			}
		/* 'click .edit' : function(e, value, row, index) {
			var rows = $table.bootstrapTable('getSelections');
			row = rows[0];
			delete row['state'];
			row['partDate'] = changeDateFormat(row['partDate']);
			var insertrow = row;
			$.post("QuotationAnalysis/insert.do", {
				row
			});
			console.log(insertrow)
			alert("已更新");
			location.reload();
		} */
		};
	
	
		// 详情函数
	
		function detailFormatter(index, row) {
			var html = [];
			$.each(row, function(key, value) {
				html.push('<p><b>' + key + ':</b> ' + value + '</p>');
			});
			return html.join('');
		}
		// 新增
		function createAction() {
			$.confirm({
				//type : 'dark',
				animationSpeed : 300,
				title : '新增系统',
				content : $('#createDialog').html(),
				data : $('#itemForm').serialize(),
				buttons : {
					confirm : {
						text : '确认',
						btnClass : 'waves-effect waves-button',
						action : function() {
							$.ajax({
								type : 'POST',
								async : true,
								contentType : 'application/x-www-form-urlencoded; charset=UTF-8',
								url : 'QuotationAnalysis/insert.do',
								data : $('#itemForm').serialize()
							})
	
							$.alert('确认');
						}
					},
					cancel : {
						text : '取消',
						btnClass : 'waves-effect waves-button'
					}
				}
			});
		}
	
		/* function createAction() {
			$.confirm(
				function() {
					var index = $table.bootstrapTable('getData').length;
					$table.bootstrapTable('insertRow', {
						index : index,
						row : {
							partNumber : '',
							partDate : '',
							drawingNoIssue : '',
							partName : '',
							yearlyVolume : '',
							paymentTerms : '',
							deliveryConditions : '',
							pointOfDelivery : '',
							supplierName : '',
							parmaCode : '',
							sourceCountry : '',
							localCurrency : '',
							buyer : '',
							costEngineer : '',
							miscInformation : ''
						}
					});
				});
		} */
	
	
	
		// 编辑
		function updateAction() {
			var rows = $table.bootstrapTable('getSelections');
			//console.log(rows[0]);
			//console.log(rows[0].constructor);
			for (var k in rows[0]) {
				$("#" + k).val(rows[0][k]);
				console.log(k + ": " + rows[0][k]);
			//a.d = "d";
			}
			if (rows.length == 1) {
	
				$.confirm({
					type : 'blue',
					animationSpeed : 300,
					title : '编辑数据',
					//dataType:'json',
	
					//content: $('#createDialog').html(),
					content : $('#createDialog').html(),
	
	
	
					buttons : {
						confirm : {
							text : '确认',
							btnClass : 'waves-effect waves-button',
							action : function() {
								$.alert('确认');
							}
						},
						cancel : {
							text : '取消',
							btnClass : 'waves-effect waves-button'
						}
					}
				});
			} else {
	
	
				$.confirm({
					title : false,
					content : '请选择一条记录！',
					autoClose : 'cancel|3000',
					backgroundDismiss : true,
					buttons : {
						cancel : {
							text : '取消',
							btnClass : 'waves-effect waves-button'
						}
					}
				});
			}
		}
	
	
		column.formatter = function(value, row, index) {
			var result = column._formatter ? column._formatter(value, row, index) : value;
	
			$.each(column, processDataOptions);
	
			$.each(editableOptions, function(key, value) {
				editableDataMarkup.push(' ' + key + '="' + value + '"');
			});
	
			var _dont_edit_formatter = false;
			if (column.editable.hasOwnProperty('noeditFormatter')) {
				_dont_edit_formatter = column.editable.noeditFormatter(value, row, index);
			}
	
			if (_dont_edit_formatter === false) {
				return [ '<a href="javascript:void(0)"',
					' data-name="' + column.field + '"',
					' data-pk="' + row[that.options.idField] + '"',
					' data-value="' + result + '"',
					editableDataMarkup.join(''),
					'>' + '</a>'
				].join('');
			} else {
				return _dont_edit_formatter;
			}
	
		};
	
	
	
	
	
	
	
	
	
	
		// 删除
		function deleteAction() {
			var rows = $table.bootstrapTable('getSelections');
			if (rows.length == 0) {
				$.confirm({
					title : false,
					content : '请至少选择一条记录！',
					autoClose : 'cancel|3000',
					backgroundDismiss : true,
					buttons : {
						cancel : {
							text : '取消',
							btnClass : 'waves-effect waves-button'
						}
					}
				});
			} else {
				$.confirm({
					type : 'red',
					animationSpeed : 300,
					title : false,
					content : '确认删除该系统吗？',
	
					buttons : {
						confirm : {
							text : '确认',
							btnClass : 'waves-effect waves-button',
							action : function() {
								var ids = new Array();
								for (var i in rows) {
									$.post("QuotationAnalysis/deleteById.do", {
										'partNumber' : rows[i]["partNumber"]
									});
									ids.push(rows[i]["partNumber"]);
								//$table.bootstrapTable('remove', {field: 'partNumber', values: rows[i]["partNumber"]});									
								}
								location.replace(location.href);
							},
						},
						cancel : {
							text : '取消',
							btnClass : 'waves-effect waves-button'
						}
					},
				});
			}
	
		}
	</script>

</body>
</html>