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
			<div class="col-md-12">
	          <!-- Horizontal Form -->
	         	<div class="box box-info">
	            	<div class="box-header with-border">
	              		<h3 class="box-title"><s:text name="Create New Service Data"></s:text></h3>
	            	</div>
	            	<s:form action="createNewServiceData" theme="simple">
	            	<div class="box-body table-responsive no-padding"  style="height:375px;">
              				<table>
              					<thead>
<tr>
<th>&nbsp;&nbsp;Enter the text:</th>
</tr>
<tr>
<td>&nbsp;&nbsp;<s:textarea name="service.servicedata" style="width:800px; height:80px;"></s:textarea></td>
</tr>
<tr><td><br></td></tr>
<tr>
<td>&nbsp;&nbsp;<s:submit value="Create" style="width:120px; background-color:green; color:white;"></s:submit></td>
</tr>
<tr><td><br></td></tr>
</thead>
</table>
</div>
</s:form>
	          	</div>
	        </div>	
        </section>
    </div>       			         			
  	<!-- /.content-wrapper -->
	<s:include value="/adminView/footer.jsp"/>
</html>