<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<link rel="shortcut icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel="icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
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
										        <center><h1 class="home_title title_bottom_space">Enter Traveler Information</h1></center>
										    </div>
										    <center>
								
<%! String nseat, outputOnePrice, outputPrice, outputbusname, outputdeparaturedate, outputleavingfrom, outputgoingto, outputdeparaturetime;   %>
<% 
int gOnePrice=0;
int gPrice=0;
int count=0;
nseat=(String) session.getAttribute("seat");
outputOnePrice=(String) session.getAttribute("onePrice");
outputPrice=(String) session.getAttribute("price");
outputbusname=(String) session.getAttribute("busname");
outputdeparaturedate=(String) session.getAttribute("deparaturedate");
outputleavingfrom=(String) session.getAttribute("leavingfrom");
outputgoingto=(String) session.getAttribute("goingto");
outputdeparaturetime=(String) session.getAttribute("deparaturetime");

if(nseat!=null)
{
	count=Integer.parseInt(nseat);
}
if(outputOnePrice!=null)
{
	gOnePrice=Integer.parseInt(outputOnePrice);
}
if(outputPrice!=null)
{
	gPrice=Integer.parseInt(outputPrice);
}
%>
<%! String oseatInfo="";%>
<% 
oseatInfo=(String) session.getAttribute("gseatInfo");
%>
<s:form action="register" theme="simple">
<table>
<tr>
<td><h6 class="login_font">Traveler Name<font color="red">*</font></h6></td>
<td><s:textfield name="user.name" style="width:200px; border:2px solid #143552;"></s:textfield></td>
<td><font color="red"><s:fielderror fieldName="user.name"></s:fielderror></font></td>
<td>
</tr>
<tr>
<td><h6 class="login_font">Gender<font color="red">*</font></h6></td>
<td><select name="user.gender" style="width:215px; border:2px solid #143552;">
<option value=" ">-------- Select-------</option>
<option value="Male">Male</option>
<option value="Female">Female</option>
</select></td>
<td><font color="red"><s:fielderror fieldName="user.gender"></s:fielderror></font></td>
</tr>
<tr>
<td><h6 class="login_font">Email</h6></td>
<td><s:textfield name="user.email" placeholder=".@gmail.com" style="width:200px; border:2px solid #143552;"></s:textfield></td>
<td><font color="red"><s:fielderror fieldName="user.email"></s:fielderror></font></td>
</tr>
<tr>
<td><h6 class="login_font">Phone Number<font color="red">*</font></h6></td>
<td><s:textfield name="user.phone" placeholder="09" style="width:200px; border:2px solid #143552;"></s:textfield></td>
<td><font color="red"><s:fielderror fieldName="user.phone"></s:fielderror></font></td>
</tr>
<tr>
<td></td>
<td><span style="color:gray;">Please enter Myanmar Phone No.<br>Example:09123456789</span></td>
<td></td>
</tr>
<tr>
<td></td>
<td><s:submit value="Submit and Continue" style="width:220px;" id="loginbtn"></s:submit></td>
<td></td>
</tr>
<tr>
<td><br></td>
<td></td>
<td></td>
</tr>

<tr>
<td><h4 class="login_font"><font color="green">Trip Information</font></h4>
<td></td>
<td></td>
<tr>
<td><h6 class="login_font">Bus Name</h6></td>
<td><input type="text" name="user.busname" value="<%=outputbusname %>"  style="width:200px; border:2px solid #143552; color:blue;" readonly></td>
<td></td>
</tr>
<tr>
<td><h6 class="login_font">Departure Date</h6></td>
<td><input type="text" name="user.deparaturedate" value="<%=outputdeparaturedate %>" style="width:200px; border:2px solid #143552; color:blue;" readonly></td>
<td></td>
</tr>
<tr>
<td><h6 class="login_font">Leaving From</h6></td>
<td><input type="text" name="user.leavingfrom" value="<%=outputleavingfrom %>" style="width:200px; border:2px solid #143552; color:blue;" readonly></td>
<td></td>
</tr>
<tr>
<td><h6 class="login_font">Going To</h6></td>
<td><input type="text" name="user.goingto" value="<%=outputgoingto%>" style="width:200px; border:2px solid #143552; color:blue;" readonly></td>
<td></td>
</tr>
<tr>
<td><h6 class="login_font">Departure Time</h6></td>
<td><input type="text" name="user.deparaturetime" value="<%=outputdeparaturetime %>" style="width:200px; border:2px solid #143552; color:blue;" readonly></td>
<td></td>
</tr>
<tr>
<td><h6 class="login_font">Seat No<font color="red">*</font></h6></td>
<td>
<input type="text" name="user.seatno" value="<%=oseatInfo%>" style="width:200px; border:2px solid #143552; color:blue;" readonly>
</td>
<td></td>
</tr>
<tr>
<td><strong>Subtotal Price<font color="red">*</font></strong></td>
<td><input type="text" name="user.price" value="<%=gPrice%> Kyats" style="width:200px; border:2px solid #143552; color:blue;" class="login_font" readonly></td>
<td></td>
</tr>
<tr>
<td><strong><%=count%> Seats&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; × </strong></td>
<td><strong><%=gOnePrice%> Kyats</strong></td>
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
<s:include value="/view/footer.jsp"/>
</body>
</html>