<%@ page import="java.util.ArrayList" %>
 
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<title>Yummy Sushi Order</title>
	<style>
body {
    background-image: url("https://img00.deviantart.net/7d16/i/2009/017/8/3/i_love_sushi_by_mj_coffeeholick.jpg");
	background-size: cover;
	
}
</style>
</head>
<body class="well" style="border:1px solid #cecece;" width= "1200px">
	
<center>	<h1 class="font-weight-bold" >Hello and welcome to Ah Soon Sushi Shop! Please enter your order!</h1>

<div class="container">
  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
         <li data-target="#myCarousel" data-slide-to="3"></li> 
        <li data-target="#myCarousel" data-slide-to="4"></li>  
        
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" style="width:100%;">

      <div class="item active">
        <img src="https://cdn.needish.com/is-prod-deals/--C6Ml-TO4Pc6p2Xnk0zuA/scale/900x600.jpg" alt="Los Angeles" height="800px" width="1200px">
        <div class="carousel-caption">
          <h3>Nigiri</h3>
          <p>Broiled aburi style with a blowtorch before serving. The fattiness of the salmon creates a richly grilled surface and a creamy center for every bite!</p>
        </div>
      </div>

      <div class="item">
        <img src="https://cdn.needish.com/is-prod-deals/u29hC-AhdnFkejUI8lOjiA/scale/900x600.jpg" alt="Chicago" height="800px" width="1200px">
        <div class="carousel-caption">
          <h3>Maki</h3>
          <p>Thin sushi rolls with nori seaweed on the outside, and sushi rice and fish on the inside.</p>
        </div>
      </div>
    
      <div class="item">
        <img src="https://d1rxvdm0rjmjgy.cloudfront.net/srv/images/supermarket-salmon-sashimi-900x600.jpg" alt="New York" height="800px" width="1200px">
        <div class="carousel-caption">
          <h3>Sashmi</h3>
          <p>The sensation of sinking one's teeth into a succulent slice of sashimi is perhaps outdone only by the burst of exquisite flavours that follows.</p>
        </div>
      </div>
  	
   	<div class="item">
        <img src="https://www.agendalugano.ch/system/images/files/000/000/372/original/uramaki.jpg?1462993397" alt="New York" height="800px" width="1200px">
        <div class="carousel-caption">
          <h3>Uramaki</h3>
          <p>The "Inside-Out" Maki Roll. Rice on the Outside, Nori on the Inside.</p> 
        </div>
      </div>
      
      <div class="item">
        <img src="https://images.eatsmarter.com/sites/default/files/styles/576x432/public/temaki-sushi-with-mushrooms-564032.jpg" alt="New York" height="800px" width="1200px">
        <div class="carousel-caption">
          <h3>Temaki</h3>
           <p>A small sheet of nori seaweed topped with sushi rice, sliced salmon, and garnishes, that is rolled into an ice cream cone shape.</p> 
        </div>
      </div>
    </div> 

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

<br><br>

<div class="row card">
<div class="col-sm-4"></div>
<div class="col-sm-4 card-body well" background-color:"white" >
	<br><br>
  	<form method="post" action="AddOrder" class="form-group">
		<label> Table Number <br><br>
			<input type="text" name="tableid" class="form-control">
		</label> 
		<br><br>
		<td><label>Menu Selection </label>&nbsp;</td> <br><br>
       	<td><select name="select2" size="5" multiple="multiple" tabindex="5" id="selection">
        
        
        <option value="nigiri">Nigiri</option>
        <option value="maki">Maki</option>
        <option value="sashmi">Sashmi</option>
        <option value="uramaki">Uramaki</option>
        <option value="temaki">Temaki</option>
      </select>
      </td> 
      	<br><br>
      	<h4> Order Cost ($)</h4>
      	<h4 id="result">0</h4>
    
       <!-- <ul id="dynamic-list"></ul>  
		 --> 
<!-- 		<input type="hidden" name="select2" value=  />
 -->		
	<br><br>	<input type="submit" value="Submit Order" name="submit" class="btn btn-info">
	
	</div>
	<div class="col-sm-4"></div>
	
	
	</form>
	</div>
	<br><br><br>	<br><br><br>	<br><br><br>
	
	<div class="align-middle">
	<br>
	<form method="post" action="AdminLogin" class="form-inline form-group">
		<label>Admin Login
			<input type="password" name="password" class="form-control" placeholder="Enter Password">
		</label>
		
		<input type="submit" value="Submit" name="submit" class="btn btn-default" >
	
	</form>
	
	</div>
	</div>
	</center>
 
<!-- 

<select name="sushi" id="candidate">
  <option value="nigiri">Nigiri</option>
  <option value="maki">Maki</option>
  <option value="sashmi">Sashmi</option>
  <option value="uramaki">Uramaki</option>
  <option value="temaki">Temaki</option>
</select>
<button onclick="addItem()">add item</button>
<button onclick="removeItem()">remove item</button>
 -->
<script>
function addItem(){
var ul = document.getElementById("dynamic-list");
  /* var candidate = document.getElementById("candidate"); */
  var li = document.createElement("li");
  li.setAttribute('id',toSet);
  li.appendChild(document.createTextNode(candidate.value));
  ul.appendChild(li);
}

function removeItem(){
var ul = document.getElementById("dynamic-list");
  var candidate = document.getElementById("candidate");
  var item = document.getElementById(candidate.value);
  ul.removeChild(item);
}

function getSelectValues(select) {
  var result = [];
  var options = select && select.options;
  var opt;

  for (var i=0, iLen=options.length; i<iLen; i++) {
    opt = options[i];

    if (opt.selected) {
      result.push(opt.value || opt.text);
    }
  }
  return result;
} </script>
<script>

$(document).ready(function(){
	$('#selection').change(function(){
 		// alert('selection changed');
		var count = $("#selection :selected").length;
		// alert(count);
		var result = parseFloat(count) * parseFloat('8.88');
		$('#result').html(result);
 	})
 
 });



</script>
	
	
	
 </body>
</html>
