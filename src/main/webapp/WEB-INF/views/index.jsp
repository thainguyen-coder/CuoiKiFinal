<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator"%>
<body>
<div align="center" >
	<h1>Danh sach hoat dong</h1>
	<table style="padding: 1cm;border: 2cm ">
		<tr>
			<th>ID</th>
			<th>Mã hoạt động</th>
			<th>Tên hoạt động</th>
			<th>Ngày hoạt động</th>
			<th>Nội dung hoạt động</th>
			<th>Người quản lí</th>
		</tr>
		<c:forEach items="${listHD}" var="customers">
			<tr>
				<td>${customers.id}</td>
				<td>${customers.maHD}</td>
				<td>${customers.tenHD}</td>
				<td>${customers.ngayHD}</td>
				<td>${customers.noiDungHD}</td>
				<td>${customers.nguoiQuanLy}</td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>

