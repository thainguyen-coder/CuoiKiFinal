<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="dec"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
			<th>Lop</th>
		
		</tr>

		<c:forEach items="listLOP" var="lop">
			<tr>
				<th>${hd}</th>
			</tr>
		</c:forEach>

	</table>
</body>
</html>