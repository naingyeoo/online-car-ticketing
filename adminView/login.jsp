<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Admin Login</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="shortcut icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel="icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/BookingSystem/Admin/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/BookingSystem/Admin/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/BookingSystem/Admin/css/util.css">
	<link rel="stylesheet" type="text/css" href="/BookingSystem/Admin/css/main.css">
	<link rel="stylesheet" type="text/css" href="/BookingSystem/Admin/css/mystyle.css">
<!--===============================================================================================-->
</head>
<body>
	<div class="limiter">
		<div class="container-login100" style="background-image: url('/BookingSystem/imagePhoto/icon.png');">
			<div class="wrap-login100">
				<form action="loginAction" theme="simple">
				<span class="login100-form-logo">
						<img src="/BookingSystem/imagePhoto/abcd.png" title="" alt="" style="height:100px;"/>
					</span>
					<span class="login100-form-title p-b-34 p-t-27"><s:text name="Online Bus Ticket Booking System"></s:text></span>
					<span class="login100-form-title p-b-34 p-t-27"><s:text name="LOGIN"></s:text></span>
					<span>
					 <font><s:actionerror></s:actionerror></font>
					<table>
<tr>
<td><td></td><s:textfield label="Name" name="name" style="width:250px; height:30px; text-align:center;"></s:textfield></td>
</tr>
<tr><td></td><td></td></tr>
<tr>
<td></td><td><s:password label="Password" name="password" style="width:250px; height:30px; text-align:center;"></s:password></td>
<tr><td></td></tr>
<tr><td></td><td><s:submit value="Login"  style="width:250px; height:30px; color:black; background-color:yellow;"></s:submit></td></tr>
</table>
				</span>
				</form>
				</div>
				</div>
				</div>

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="/BookingSystem/Admin/js/main.js"></script>
</body>
</html>
