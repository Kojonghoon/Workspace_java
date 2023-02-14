<%@page import="lombok.EqualsAndHashCode.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../../common/easyUI_common.jsp"%>
</head>
<body>
	<script type="text/javascript">
		window.addEventListener("load", function(event) {
			$('#dg').datagrid({
				title : "부서관리",
				url : 'datagrid_data.json',
				columns : [ [ {
					field : 'code',
					title : 'Code',
					width : 100
				}, {
					field : 'name',
					title : 'Name',
					width : 100
				}, {
					field : 'price',
					title : 'Price',
					width : 100,
					align : 'right'
				} ] ]
			});
		});
	</script>
</body>
</html>