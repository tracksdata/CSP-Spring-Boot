<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="banner.jsp" />
	<jsp:include page="menu.jsp" />

	<hr />

	<div class="col-4 col-sm-4 col-md-4">

		<div class="card">

			<div class="card-header bg-success">Product Form</div>
			<div class="card-body">

				<form action="saveProductV2" method="post" autocomplete="off">

					<div class="form-group">
						<lable>Product Id</lable>
						<input name="id" class="form-control" />
					</div>

					<div class="form-group">
						<lable>Product Name</lable>
						<input name="name" class="form-control" />
					</div>


					<div class="form-group">
						<lable>Product Price</lable>
						<input name="price" class="form-control" />
					</div>

					<div class="form-group">
						<lable>Product Description</lable>
						<textarea name="description" class="form-control"></textarea>
					</div>
					
					<div class="form-group">
						<span>${msg}</span>
					</div>

					<div class="text-center">
						<button class="btn btn-primary">Save</button>
						<button class="btn btn-danger">Cancel</button>
					</div>



				</form>

			</div>

		</div>
	</div>



</body>
</html>