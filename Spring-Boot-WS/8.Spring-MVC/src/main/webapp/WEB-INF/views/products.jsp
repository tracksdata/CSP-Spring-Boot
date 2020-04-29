<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Product Information</h1>

	<table border="1">
		<tr bgcolor="skyblue">
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Description</th>
			<th>Price</th>
		</tr>

		<c:forEach items="${products}" var="product">

			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.description}</td>
				<td>${product.price}</td>

			</tr>
		</c:forEach>



	</table>

</body>
</html>