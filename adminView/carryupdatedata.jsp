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
    	</section>
		<!-- Main content -->
    	<section class="content container-fluid">
        	<div class="col-xs-12">
          		<div class="box box-info">
	            	<div class="box-header with-border">
	              		<h3 class="box-title">Price can update</h3>
	            	</div>
	            	<s:form action="updatebusline" theme="simple" class="form-horizontal">
	            		<div class="box-body" style="height:375px;">
				<s:iterator value="buslist">
				<table>
            				<tr>
<td>Bus Name:</td>
<td><s:textarea name="travel.busname" value="%{busname}" readonly="true" style="height:30px;"></s:textarea><br></td>
<td></td>
</tr>
<tr>
<td><br></td>
</tr>
<tr>
<td>Departure Date:</td>
<td><s:textarea name="travel.deparaturedate" value="%{deparaturedate}" readonly="true" style="height:30px;"></s:textarea></td>
<td></td>
</tr>
<tr>
<td><br></td>
<td></td>
<td></td>
</tr>
<tr>
<td>Leaving From:</td>
<td><s:textarea name="travel.leavingfrom" value="%{leavingfrom}" readonly="true" style="height:30px;"></s:textarea></td>
<td></td>
</tr>
<tr>
<td><br></td>
<td></td>
<td></td>
</tr>
<tr>
<td>Going To:</td>
<td><s:textarea name="travel.goingto" value="%{goingto}" readonly="true" style="height:30px;"></s:textarea></td>
<td></td>
</tr>
<tr>
<td><br></td>
<td></td>
<td></td>
</tr>
<tr>
<td>Deparature Time:</td>
<td><s:textarea name="travel.deparaturetime" value="%{deparaturetime}" readonly="true" style="height:30px;"></s:textarea></td>
<td></td>
</tr>
<tr>
<td><br></td>
</tr>
<tr>
<td>One Seat Price:</td>
<td><s:textarea name="travel.price" value="%{price}" style="height:30px;"></s:textarea></td>
<td><font color="red">&nbsp;Price must be number.</font></td>
</tr>
</table>
</s:iterator>
<table>
<tr>
<td><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><s:submit value="Update" style="width:195px; background-color:green; color:white;"></s:submit></td>
<td></td>
</tr> 
</table>        				
	         			</div>
	            	</s:form>
	            </div>
			</div>
    	</section><!-- /.content -->	
  	</div>
  	<!-- /.content-wrapper -->
	<s:include value="/adminView/footer.jsp"/>
</html> 
