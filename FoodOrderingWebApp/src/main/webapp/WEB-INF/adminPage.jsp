<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
body {
    background-image: url("https://media.istockphoto.com/photos/sushi-rolls-isolated-on-white-background-picture-id514465842?k=6&m=514465842&s=612x612&w=0&h=J2HX_EuZxXs2w-9H63U7IpieGi2dQxn4S1XbRjk0AYg=");
	background-size: cover;
}
</style>
<title>Admin Page</title>

</head >
<body class="align-middle" >

<center>
<div class="container">
<div class = "row">
<div class="col-sm-4">
</div>
<div class="col-sm-4 well" >
<h1>Administrator Page</h1>
<br><br>
<form method="post" action="ViewOrder">
		<input type="submit" value="View Orders" name="ViewOrders" class="btn btn-info">
		</form>
	<br><br>

	
<form method="post" action="UpdateOrder">
	
	<label> Order ID
		<input type="text"  name="orderid">
	</label>
	<label> Order Status
		<select name="orderstatus">
  			<option value="pending">Pending</option>
  			<option value="processing">Processing</option>
  			<option value="completed">Completed</option>
  			<option value="cancelled">Cancelled</option>
		</select>
	</label>
	<input type="submit" name="UpdateOrder" value="Update Order" class="btn btn-info">
</form>

<br><br>
	<form method="post" action="LogOut" >
		<input type="submit" value="LogOut" name="LogOut" class="btn btn-default">
	</form>
	</div>
<div class="col-sm-4">
</div>
</div>
</div>
	</center>
	</body>
</html>