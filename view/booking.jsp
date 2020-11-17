<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/themes/smoothness/jquery-ui.css" />
		<link rel="shortcut icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel="icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel="stylesheet" type="text/css" media="all" href="/BookingSystem/extra/mystyle.css" />
</head>
<body>
	<s:include value="/view/header.jsp"/>
    <!-- START PRIMARY -->
    <div style="height:390px;">
    <center>
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
										        <center><h1 class="home_title title_bottom_space">Choose Your Route</h1></center>
										    </div>
<center>
<s:form action="bookingAction" theme="simple">
<font color="red"><s:actionerror></s:actionerror></font>
<table>
<tr>
<td><h6 class="login_font">Departure Date:</h6></td>
<td>
<s:textfield name="travel.deparaturedate" id="demo" style="width:200px; border:2px solid #143552;"></s:textfield>
</td>
<td>
<font color="red"><s:fielderror fieldName="travel.deparaturedate"></s:fielderror></font>
</td>
</tr>
<tr>
<td><h6 class="login_font">Leaving From:</h6></td>
<td>
<select name="travel.leavingfrom" style="width:200px; border:2px solid #143552;">
<option value=" ">----------  Select  ----------</option>
<option value="Yangon">Yangon</option>
<option value="Mandalay">Mandalay</option>
<option value="Meiktila">Meiktila</option>
</select>
</td>
<td>
<font color="red"><s:fielderror fieldName="travel.leavingfrom"></s:fielderror></font>
</td>
</tr>
<tr>
<td><h6 class="login_font">Going To:</h6></td>
<td>
<select name="travel.goingto" style="width:200px; border:2px solid #143552;" >
<option value=" ">----------  Select  ----------</option>
<option value="Yangon">Yangon</option>
<option value="Mandalay">Mandalay</option>
<option value="Meiktila">Meiktila</option>
</select>
</td>
<td>
<font color="red"><s:fielderror fieldName="travel.goingto"></s:fielderror></font>
</td>
</tr>
<tr>
<td><h6 class="login_font">Number of Seats:</h6></td>
<td>
<s:select name="travel.numOfSeat" list="{'1', '2', '3', '4', '5', '6'}" style="width:200px; border:2px solid #143552;" ></s:select>
</td>
<td><font color="red"><s:fielderror fieldName="travel.numOfSeat"></s:fielderror></font>
</tr>
<tr>
<td></td>
<td><s:submit value="Search Now" style="width:200px;" id="loginbtn"></s:submit></td>
<td></td>
</tr>

</table>

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
	</center>	
	</div>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/jquery-ui.min.js"></script>
	<script type="text/javascript">
	 $("#demo").datepicker({
	        changeMonth: true,
	        changeYear: true,
	        hideIfNoPrevNext: true,
	        dateFormat: "dd/mm/yy",
	        minDate: +0, 
	        
	    }); 
		
	</script>
<s:include value="/view/footer.jsp"/>
</body>
</html>