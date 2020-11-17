<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="shortcut icon" type="image/x-icon" href="/BookingSystem/extra/myimage/favicon_police.ico" />
    <link rel="icon" type="image/x-icon" href="/BookingSystem/extra/myimage/favicon_police.ico" />
    <link rel="stylesheet" type="text/css" media="all" href="/BookingSystem/extra/mystyle.css" />
	</head>
	<body>
	<s:include value="/view/header.jsp"/>
	
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
										        <center><h1 class="home_title title_bottom_space">Searched Route</h1></center>
										    </div>
<%! String nseat, outputOnePrice, outputPrice; %>
<% 
int gOnePrice=0;
int gPrice=0;
int count=0;
nseat=(String) session.getAttribute("seat");
outputOnePrice=(String) session.getAttribute("onePrice");
outputPrice=(String) session.getAttribute("price");
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
<center>
<table>
<s:form theme="simple">
<tr>
<td><h6 class="login_font">Departure Date:</h6></td>
<td>
<s:textfield value="%{travel.deparaturedate}" style="width:200px; border:2px solid #143552;" readonly="true"></s:textfield>
</td>
</tr>
<tr>
<td><h6 class="login_font">Leaving From:</h6></td>
<td>
<s:textfield value="%{travel.leavingfrom}" style="width:200px; border:2px solid #143552;" readonly="true"></s:textfield>
</td>
</tr>
<tr>
<td><h6 class="login_font">Going To:</h6></td>
<td>
<s:textfield value="%{travel.goingto}" style="width:200px; border:2px solid #143552;" readonly="true"></s:textfield>
</td>
</tr>
<tr>
<td><h6 class="login_font">Number of Seats:</h6></td>
<td><s:textfield value="%{travel.numOfSeat}" style="width:200px; border:2px solid #143552;" readonly="true"></s:textfield></td>
</tr>
</s:form>
<s:form action="searchAgain" theme="simple">
<tr>
<td></td>
<td>
<s:submit value="Change Search" style="width:210px;" id="loginbtn"></s:submit>
</td>
</tr>
<tr><td><br></td><td></td></tr>
</s:form>
</table>
</center>
<center>
<h3>Choose A Route You Want To Travel!</h3>
<s:iterator value="tlist">	
<s:form action="chooseAction" theme="simple" style="background-color: skyblue; width:350px; height:260px;">
<br>
<s:textfield name="travel.busname" value="%{busname}" readonly="true" style="width:110px; color:blue;"></s:textfield><br>
<s:textfield name="travel.leavingfrom" value="%{leavingfrom}" readonly="true" style="width:100px; color:blue;"></s:textfield>&nbsp;-&nbsp;<s:textfield name="travel.goingto" value="%{goingto}" readonly="true" style="width:100px; color:blue;"></s:textfield><br>
<strong>Departure Date:</strong>&nbsp;&nbsp;&nbsp;<s:textfield name="travel.deparaturedate" value="%{deparaturedate}" readonly="true" style="width:100px; color:blue;"></s:textfield><br>
<strong>Departure Time:</strong>&nbsp;&nbsp;&nbsp;<s:textfield name="travel.deparaturetime" value="%{deparaturetime}" readonly="true" style="width:100px; color:blue;"></s:textfield><br>
<strong>Subtotal&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="green"><%=gPrice %> Kyats</font></strong><br>
<strong><%=count%> Seats&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;×&nbsp;&nbsp;<%=gOnePrice %> Kyats</strong><br>
<s:submit value="Select Seats" style="width:150px;" id="loginbtn"></s:submit>
</s:form>
</s:iterator>
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
<s:include value="/view/footer.jsp"/>
</body>
</html>