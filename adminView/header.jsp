<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	  	<title>Online Bus Ticket Booking System</title>
	  	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	  	<!-- <link rel="stylesheet" href="/BookingSystem/css/shortcodes.css"> -->
	  	<link rel="stylesheet" href="/BookingSystem/Admin/css/viewCSS/bootstrap.min.css">
	  	<!-- Font Awesome -->
	  	<link rel="stylesheet" href="/BookingSystem/Admin/css/viewCSS/font-awesome.min.css">
	  	<!-- Ionicons -->
	  	<link rel="stylesheet" href="/BookingSystem/Admin/css/viewCSS/ionicons.min.css">
	  	<!-- Theme style -->
	  	<link rel="stylesheet" href="/BookingSystem/Admin/css/viewCSS/AdminLTE.min.css">
	  	<link rel="stylesheet" href="/BookingSystem/Admin/css/viewCSS/skin-blue.min.css">
	  	<link rel="stylesheet" href="/BookingSystem/Admin/css/viewCSS/skin-blue.min.css">
	  	<link rel="stylesheet" href="/BookingSystem/Admin/css/mystyle.css">
	  	<!-- Google Font -->
	  	<link rel="shortcut icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel="icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
	  	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
	</head>
	<!--
	BODY TAG OPTIONS:
	=================
	Apply one or more of the following classes to get the
	desired effect
	|---------------------------------------------------------|
	| SKINS         | skin-blue                               |
	|               | skin-black                              |
	|               | skin-purple                             |
	|               | skin-yellow                             |
	|               | skin-red                                |
	|               | skin-green                              |
	|---------------------------------------------------------|
	|LAYOUT OPTIONS | fixed                                   |
	|               | layout-boxed                            |
	|               | layout-top-nav                          |
	|               | sidebar-collapse                        |
	|               | sidebar-mini                            |
	|---------------------------------------------------------|
	-->
	<body class="hold-transition skin-blue sidebar-mini">
		<div class="wrapper">
  			<!-- Main Header -->
  			<header class="main-header">
			    <!-- Logo -->
			    <a href="index2.html" class="logo">
			    	<!-- mini logo for sidebar mini 50x50 pixels -->
			      	<span class="logo-mini">ADMIN</span>
			      	<!-- logo for regular state and mobile devices -->
			      	<span class="logo-lg"><b>Travel Myanmar</span>
			    </a>
    			<!-- Header Navbar-->
    			<nav class="navbar navbar-static-top" role="navigation">
      			<!-- Sidebar toggle button
		      	<a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
		        	<span class="sr-only">Toggle navigation</span>
		      	</a>-->
      			<!-- Navbar Right Menu -->
      			<div class="navbar-custom-menu">
        			<ul class="nav navbar-nav">
          				<li class="dropdown user user-menu">
				            <a href="#" class="dropdown-toggle" data-toggle="dropdown">				              
				              <img src="/BookingSystem/Admin/images/avatar5.png" class="user-image" alt="User Image">				             
				              <span class="hidden-xs">Admin</span>
				            </a>
            				<ul class="dropdown-menu">
				              	<li class="user-header">
				                	<img src="/BookingSystem/Admin/images/avatar5.png" class="img-circle" alt="User Image">
				                	<p>Admin</p>
				              	</li>
				              	<li class="user-footer">
					                <div class="pull-left">					           
					                	<a href="/BookingSystem/adminView/adminChangePassword.jsp" class="btn btn-default btn-flat">Change Password</a>
					                </div>
					                <div class="pull-right">
					                  	<a href="/BookingSystem/view/home.jsp" class="btn btn-default btn-flat">Sign out</a>
					                </div>
				              	</li>
            				</ul>
          				</li>        		         
        			</ul>
      			</div>
    		</nav>
  		</header>
  
  			<aside class="main-sidebar">
    			<section class="sidebar">
		      	<div class="user-panel">
			        <div class="pull-left image">
			          	<img src="/BookingSystem/Admin/images/avatar5.png" class="img-circle" alt="User Image">
			        </div>
			        <div class="pull-left info">
			          	<p>ADMIN</p>
			        </div>
		      	</div>
		      	<!-- Sidebar Menu -->
		      	<ul class="sidebar-menu" data-widget="tree">
			        <li class="header">Online Bus Ticket Booking System</li>
			        <!-- Optionally, you can add icons to the links -->
			       <s:form action="displaybusline">
	<li><s:submit value="Bus Line" style="width:210px; background-color:blue; color:white;" ></s:submit><br></li>
</s:form>
<s:form action="displaybookinglist">
	<li><s:submit value="Booking List" style="width:210px; background-color:blue; color:white;"></s:submit><br></li>
</s:form>
<s:form action="displayservicedata">
	<li><s:submit value="Service Data" style="width:210px; background-color:blue; color:white;"></s:submit><br></li>
</s:form>
<s:form action="displayabout">
	<li><s:submit value="About" style="width:210px; background-color:blue; color:white;"></s:submit><br></li>
</s:form>
<s:form action="displayavailableseat">
	<li><s:submit value="SeatUpdate(Avail->SoldOut)" style="width:210px; background-color:blue; color:white;"></s:submit><br></li>
</s:form>
<s:form action="displaysoldoutseat">
	<li><s:submit value="SeatUpdate(SoldOut->Avail)" style="width:210px; background-color:blue; color:white;"></s:submit><br></li>
</s:form>
      	
		      	</ul>
      			<!-- /.sidebar-menu -->
    		</section>
    		<!-- /.sidebar -->
  		</aside>
