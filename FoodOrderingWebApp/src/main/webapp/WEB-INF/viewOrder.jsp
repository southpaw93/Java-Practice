<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.fdmgroup.Order" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>View Order</title>
</head>
<body class="align-middle" style="width=80%">
<center>
<div class="container well">
<h1>View Orders</h1>

<form method="post" action="UpdateOrder" >
	<input type="submit" name="UpdateOrder" value="Update Order" class="btn btn-primary">
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
</form>

<br>
  
 <table class="table table-bordered table-hover" style="width:70%">
 <tr>
 <th>ORDER ID</th>
 <th>ORDER TABLE</th>
 <th>ORDERS</th>
 <th>ORDER AMOUNT</th>
 <th>STATUS</th>
 </tr>
 <% List<Order> allOrder = (List<Order>) session.getAttribute("allOrders");%>
   	<% int i =0;
	for (i=0; i< allOrder.size(); i++) { %> 
	 
	 <%if (allOrder.get(i).getOrderStatus().equals("pending")){ %>
	 <tr class="warning">
	 <% }else if (allOrder.get(i).getOrderStatus().equals("processing")){%>
	 <tr class="info">
	 <%}else if (allOrder.get(i).getOrderStatus().equals("completed")){ %>
	 <tr class="success">
	 <%}else if (allOrder.get(i).getOrderStatus().equals("cancelled")){ %>
	 <tr class="danger">
	 <% } else {%>
	 <tr>
	 <%} %>
	  	<td><%=      allOrder.get(i).getOrderID() %></td>
	  	<td><%= allOrder.get(i).getTableId() %></td>
	  	<td><%= allOrder.get(i).getOrderListPrint() %>
	  	<td><%= allOrder.get(i).getTotalPrice() %>
	  	<td><%= allOrder.get(i).getOrderStatus() %>
	 </tr>
 
  <% 	}
  %> 
 
 </table>
<form method="post" action="LogOut">
		<input type="submit" value="LogOut" name="LogOut" class="btn btn-warning">
	</form>
	</div>
	</center>
</body>
</html>