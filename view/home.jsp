<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<!-- START HEAD -->
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.2, user-scalable=yes" />
    <title>Online Bus Ticket Booking System</title>
    <link rel="stylesheet" type="text/css" media="all" href="/BookingSystem/css/reset.css" />
    <link rel="stylesheet" type="text/css" media="all" href="/BookingSystem/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" media="all" href="/BookingSystem/css/style.css" />
    <link rel="shortcut icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel="icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel='stylesheet' id='thickbox-css'  href='/BookingSystem/js/thickbox/thickbox.css' type='text/css' media='all' />
    <link rel='stylesheet' id='google-fonts-css'  href='http://fonts.googleapis.com/css?family=Playfair+Display%7COpen+Sans+Condensed%3A300%7COpen+Sans%7CShadows+Into+Light%7CMuli%7CDroid+Sans%7CArbutus+Slab%7CAbel&#038;ver=3.5.1' type='text/css' media='all' />
    <link rel='stylesheet' id='responsive-css'  href='/BookingSystem/css/responsive.css' type='text/css' media='all' />
    <link rel='stylesheet' id='flexslider-css' href='/BookingSystem/css/homeSlider/flexslider.css' type='text/css' media='all' />
    <link rel='stylesheet' id='flex-slider-css' href='/BookingSystem/css/homeSlider/slider.css' type='text/css' media='all' />
    <link rel='stylesheet' id='ahortcodes-css'  href='/BookingSystem/css/shortcodes.css' type='text/css' media='all' />
    <link rel='stylesheet' id='contact-form-css'  href='/BookingSystem/css/contact_form.css' type='text/css' media='all' />
    <link href="/PassportRegistration/css/dcalendar.picker.css" rel="stylesheet" type="text/css">
    <link rel='stylesheet' id='custom-css'  href='/BookingSystem/css/custom.css' type='text/css' media='all' />
    <link rel="stylesheet" type="text/css" media="all" href="/BookingSystem/extra/mystyle.css" />
    <style type="text/css">
        body { background-color: #ffffff; background-image: url('/BookingSystem/images/bg-pattern.png'); background-repeat: repeat; background-position: top left; background-attachment: scroll; }
    </style>
    <script type='text/javascript' src='/BookingSystem/js/jquery/jquery.js'></script>
</head>
<!-- END HEAD -->
<!-- START BODY -->
<body class="home page no_js responsive stretched">

<!-- START BG SHADOW -->
<div class="bg-shadow">

<!-- START WRAPPER -->
    <div id="wrapper" class="container group">
        <!-- START TOP BAR -->
        <div id="topbar">
            <div class="container">
                <div class="row">
                    <div id="nav" class="span12 light">
                        <!-- START MAIN NAVIGATION -->
                        <ul id="menu-menu" class="level-1">
                            <li>
                                <a href="/BookingSystem/view/home.jsp" id="menuhome">HOME</a>
                            </li>
                            <li>
                                <a href="/BookingSystem/view/service.jsp" id="menuhome">SERVICE</a>
                            </li>
                            <li>
                                <a href="/BookingSystem/view/booking.jsp" id="menuhome">BOOKING</a>
                            </li>
                            <li>
                                <a href="/BookingSystem/view/about.jsp" id="menuhome">CONTACT US</a>
                            </li>
                        </ul>
                        <!-- END MAIN NAVIGATION -->
                     
                    </div>
                </div>
            </div>
        </div>
        <!-- END TOP BAR -->
    <!-- START HEADER -->
    <div id="header" class="group margin-bottom">
        <div class="group container">
            <div class="row" id="logo-headersidebar-container">
                <!-- START LOGO -->
                <div id="logo" class="span6 group">
                    <a id="logo-img" href="/BookingSystem/view/home.jsp" title="Libra">
                        <img src="/BookingSystem/imagePhoto/abcd.png" height="50px" width="150px" title="BookingSystem" alt="BookingSystem"/>
                    </a>
                    <p id='tagline'>Online Bus Ticket Booking System</p>
                </div>
                <!-- END LOGO -->
                <!-- START HEADER SIDEBAR -->               
                <div id="header-sidebar" class="span6 group">
                <!-- <div class="widget-first widget header-text-image">
                       
                        <div class="text-content">
                        </div>
                    </div>
                    <div class="widget-last widget widget_text">
                        <div class="textwidget">
                        </div>
                    </div>-->
                </div>
            </div>
        </div>  
    <!-- START PRIMARY -->
        <div class="top-border span12"></div>
        <!-- BEGIN FLEXSLIDER SLIDER -->
 		<div id="slider-flexslider-0" class="slider slider-flexslider flexslider container" style="">
    	   	<div class="slider-wrapper">
                <ul class="slides">
                	
    	            <li>
                    	<img width="1000" height="30px" src="/BookingSystem/imagePhoto/scania.jpg" class="attachment-full" alt="004" />
    	            </li>	
                                      
                </ul>
            </div>
            <div class="slider-shadow"></div>
		</div>
        <script type="text/javascript">
            jQuery(document).ready(function($){
			    $('#slider-flexslider-0.flexslider .slider-wrapper').flexslider({
			        animation: 'fade',
			        slideshowSpeed: 3000,
			        animationSpeed: 800,
			        touch: false,
			        controlNav: false
			    });
            });
        </script>
    </div>
    <!-- END HEADER -->
    <!-- START PRIMARY -->
    <div id="primary" class="sidebar-no">
        <div class="container group">
            <div class="row">
            	<p style="text-align: justify;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h2>Warmly Welcome To Travel With Our Best Service</h2>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Travel Myanmar highway bus line is the very first express car service in Myanmar which created the best routes and services for the passengers. We are very proud to introduce you with the best express bus routes and services to you.</p>
            	<div class="section blog margin-bottom span12">
					<h2 class="title">
                         <span class="title-highlight">Travel Myanmar Highway Bus Line</span>
					</h2>
                    <div class="row">
						<div class="post type-post status-publish format-video category-design span6 sticky homeSmallPhoto">
                            <div class="row">
                                <div class="thumbnail span3">
                                    <img width="263" height="243" src="/BookingSystem/imagePhoto/Barbi-Galileo-HD-interior.jpg" class="attachment-section_blog wp-post-image" alt="3" />                                            
                                </div>
                                <div class="the-content span3 homeSpan">                                       
                                       <ul style="text-align: justify;">
                                          	<li>Our operator is the best service in Myanmar.</li> 
											<li>We use scania express to be safety our customer.</li>
											
                                      </ul>                                          
                                   </div>
                            </div>
                         </div>
						 <div class="post type-post status-publish format-video category-design span6 sticky">
                               <div class="row">
                                   <div class="thumbnail span3">
                                       <img width="263" height="243" src="/BookingSystem/imagePhoto/image.jpg" class="attachment-section_blog wp-post-image" alt="3" />                                            
                                   </div>

                                   <div class="the-content span3 homeSpan">                                      
                                       <ul style="text-align: justify;">
                                       		<li>Our operator is the best service in Myanmar.</li> 
											<li>We use scania express to be safety our customer.</li>
                                       </ul>                                          
                                   </div>
                               </div>
                           </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- END PRIMARY -->
    <!-- START FOOTER -->
   	<s:include value="/view/footer.jsp"/>
</body>
</html>