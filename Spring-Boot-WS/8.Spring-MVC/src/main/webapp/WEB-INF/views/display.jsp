<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Product Information</h1>

	<table border="1">
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Description</th>
			<th>Price</th>
		</tr>

		<tr>
			<td>${product.id}</td>
			<td>${product.name}</td>
			<td>${product.description}</td>
			<td>${product.price}</td>

		</tr>

	</table>

</body>
</html>