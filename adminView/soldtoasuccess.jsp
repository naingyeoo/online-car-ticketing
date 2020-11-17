<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<s:include value="/adminView/header.jsp"/>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="shortcut icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel="icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
  	<div class="content-wrapper">
  		<section class="content-header">
  			<h1>Success. Please check the seat number.</h1>
    	</section>
		<!-- Main content -->
    	<section class="content container-fluid">
			<div class="row">
        		<div class="col-xs-12">
          			<div class="box">
            			<div class="box-header">
              				<div style="height:375px;">
<%! String oseatInfo="";%>
<% 
oseatInfo=(String) session.getAttribute("gseatInfo");
%>
<s:form theme="simple">
<table>
<s:iterator value="soldouttoalist">
<tr>
<td><strong>Bus Name:</strong></td>
<td><s:textfield name="user.busname" value="%{busname}" readonly="true" style="width:200px;"></s:textfield></td>
<td></td>
</tr>
<tr>
<td><strong>Deparature Date:</strong></td>
<td><s:textfield name="user.deparaturedate" value="%{deparaturedate}" readonly="true" style="width:200px;"></s:textfield></td>
<td></td>
</tr>
<tr>
<td><strong>Leaving From:</strong></td>
<td><s:textfield name="user.leavingfrom" value="%{leavingfrom}" readonly="true" style="width:200px;"></s:textfield></td>
<td></td>
</tr>
<tr>
<td><strong>Going To:</strong></td>
<td><s:textfield name="user.goingto" value="%{goingto}" readonly="true" style="width:200px;"></s:textfield></td>
<td></td>
</tr>
<tr>
<td><strong>Deparature Time:</strong></td>
<td><s:textfield name="user.deparaturetime" value="%{deparaturetime}" readonly="true" style="width:200px;"></s:textfield></td>
<td></td>
</tr>
</s:iterator>
<tr>
<td><strong>Seat No:<font color="red">*</font></strong></td>
<td>
<input type="text" name="user.seatno" value="<%=oseatInfo%>" style="width:200px; color:red;">
</td>
<td></td>
</tr>
<tr><td><br></td><td></td><td></td></tr>
<tr>
<td></td>
<td><s:a href="/BookingSystem/adminView/dashboard.jsp" style="background-color:blue; color:white;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Back&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</s:a></td>
<td></td>
</tr>
</table>
</s:form>
			            </div>
			            <!-- /.box-body -->
          			</div>
				</div>
			</div>
    	</section>
    	<!-- /.content -->
  	</div>
  	<!-- /.content-wrapper -->
	<s:include value="/adminView/footer.jsp"/>
</html>