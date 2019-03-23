<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.fdmgroup.Order"  %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Order Sent</title>
</head>
<body class="well">
<center>
<% Order order = (Order) session.getAttribute("order"); %>
<h2>Order is successfully sent!</h2> <br>
<h4>Order ID is <%= order.getOrderID() %>.</h4> <br>
<h4>Items ordered are as follows: <%= order.getOrderList() %> .</h4> <br>
<h4>Your order costs: $<%= order.getTotalPrice() %></h4> <br>
<h4>Have a nice day! :) </h4>
<br><br>
<img src="https://media.tenor.com/images/a0563ef0690f46b217a0f3f7977c6f66/tenor.gif">  <br> <br><br>
<form method="post" action="LogOut">
		<input type="submit" value="Return to Home Page" name="LogOut" class="btn btn-success">
	</form>
</center>
</body>
</html>