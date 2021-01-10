<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>Mã hoạt động</th>
			<th>Tên hoạt động</th>
			<th>Ngày hoạt động</th>
			<th>Nội dung hoạt động</th>
			<th>Người quản lí</th>
		</tr>

		<c:forEach items="listHD" var="hd">
			<tr>
				<td>${hd.id}</td>
				<td>${hd.maHd}</td>
				<td>${hd.tenHd}</td>
				<td>${hd.ngayHd}</td>
				<td>${hd.noiDungHd}</td>
				<td>${hd.nguoiQuanLy}</td>
				
			</tr>
		
		</c:forEach>

	</table>
</body>
</html>