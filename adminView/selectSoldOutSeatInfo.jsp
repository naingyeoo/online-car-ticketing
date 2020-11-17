<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<s:include value="/adminView/header.jsp"/>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/themes/smoothness/jquery-ui.css" />
	<link rel="shortcut icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel="icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
  	<div class="content-wrapper">
  		<section class="content-header">
  			<h1>Select the Bus Line Infomation to Update (<font color="red">Sold Out</font> => <font color="green">Available</font>)</h1>
    	</section>
		<!-- Main content -->
    	<section class="content container-fluid">
			<div class="row">
        		<div class="col-xs-12">
          			<div class="box">
            			<div class="box-header">
              				<div style="height:375px;">
<s:form action="searchSoldOutSeatInfo" theme="simple">
<font color="red"><s:actionerror></s:actionerror></font>
<table>
<tr>
<td>Bus Name:</td>
<td><s:textfield name="travel.busname" value="Travel Myanmar" style="width:200px;"></s:textfield></td>
<td><font color="red"><s:fielderror fieldName="travel.busname"></s:fielderror></font></td></tr>
<tr><td><br><td><td><br><td></tr>
<tr>
<td>Deparature Date:</td>
<td><s:textfield name="travel.deparaturedate" id="demo" style="width:200px;"></s:textfield></td>
<td><font color="red"><s:fielderror fieldName="travel.deparaturedate"></s:fielderror></font></td>
</tr>
<tr><td><br><td><td><br><td></tr>
<tr>
<td>Leaving From:</td>
<td><select name="travel.leavingfrom" style="width:200px;">
<option value=" ">-------Choose-------</option>
<option value="Yangon">Yangon</option>
<option value="Mandalay">Mandalay</option>
<option value="Meiktila">Meiktila</option></select></td>
<td><font color="red"><s:fielderror fieldName="travel.leavingfrom"></s:fielderror></font></td>
</tr>
<tr><td><br><td><td><br><td></tr>
<tr>
<td>Going To:</td>
<td><select name="travel.goingto" style="width:200px;">
<option value=" ">-------Choose-------</option>
<option value="Yangon">Yangon</option>
<option value="Mandalay">Mandalay</option>
<option value="Meiktila">Meiktila</option></select></td>
<td><font color="red"><s:fielderror fieldName="travel.goingto"></s:fielderror></font></td>
</tr>
<tr><td><br><td><td><br><td></tr>
<tr>
<td>Deparature Time:</td>
<td><select name="travel.deparaturetime" style="width:200px;">
<option value=" ">-------Choose-------</option>
<option value="6:00 AM">6:00 AM</option>
<option value="6:00 PM">6:00 PM</option>
<option value="9:00 AM">9:00 AM</option>
<option value="9:00 PM">9:00 PM</option>
</select></td>
<td><font color="red"><s:fielderror fieldName="travel.deparaturetime"></s:fielderror></font></td>
</tr>
<tr><td><br><td><td><br><td></tr>
<tr><td></td><td><s:submit value="Search Sold Out Seat" style="width:200px; background-color:green; color:white;"></s:submit></td></tr>
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
  	<!-- /.content-wrapper -->
	<s:include value="/adminView/footer.jsp"/>
</html>