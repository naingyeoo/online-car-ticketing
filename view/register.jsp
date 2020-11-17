<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<link rel="shortcut icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel="icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel="stylesheet" type="text/css" media="all" href="/BookingSystem/extra/mystyle.css" />
	</head>
<body>
	<s:include value="/view/header.jsp"/>
	
    <!-- START PRIMARY -->
    <div id="primary" class="sidebar-no">
    	<div class="container group">
			<div class="row">
			   	<div id="primary" class="sidebar-right">
			    	<div class="container group">
			            <div class="row">
			                <!-- START CONTENT -->
			                <div id="content-blog" class="span9 content group">
			                    <div class="post type-post status-publish format-video sticky hentry category-design hentry-post group blog-small">
			                    	<div class="thumbnail">
			                            <div class="row">
				                            <div class="slogan">
										        <center><h1 class="home_title title_bottom_space"></h1></center>
										     </div>
										     <center>
<s:form action="confirmAction" theme="simple">
<h2><font color="green">Your Bus Ticket Booking is Successful.</font></h2>
<p><font color="red">Please Notice!<br>
 To confirm the seats you booked, you must complete the payment 1 hour before your booking time at our bus outlet.</font><br>
 <font color="red">If not, we will cancel your booking data.</font></p>
 <br><br>
 <s:submit value="OK" style="width:220px;" id="loginbtn"></s:submit>
<br><br><br><br><br><br>
</s:form>	
</center>								    

										</div>
			                        </div>
			                    </div>
					     	</div>
					    	<%-- <s:include value="/views/sidebar.jsp"/> --%>
					    </div>
			        </div>
			    </div>
		    </div>
		</div>
	</div>
<s:include value="/view/footer.jsp"/>
</body>
</html>