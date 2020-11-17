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
	              		<h3 class="box-title">Phone Information can update</h3>
	            	</div>
	            	<s:form action="updateabout" theme="simple" class="form-horizontal">
	            		<div class="box-body" style="height:375px;">
	            		<table >
				<s:iterator value="aboutlist">
						<tr>
<td>&nbsp;&nbsp;City:&nbsp;&nbsp;</td>
<td><s:textarea name="about.city" value="%{city}" readonly="true" style="width:300px; height:50px;"></s:textarea></td>
</tr>
<tr><td><br></td><td></td></tr>
<tr>
<td>&nbsp;&nbsp;Place:&nbsp;&nbsp;</td>
<td><s:textarea name="about.place" value="%{place}" readonly="true" style="width:300px; height:50px;"></s:textarea></td>
</tr>
<tr><td><br></td><td></td></tr>
<tr>
<td>&nbsp;&nbsp;Phone Info:&nbsp;&nbsp;</td>
<td><s:textarea name="about.phoneInfo" value="%{phoneInfo}" style="width:300px; height:50px;"></s:textarea></td>
</tr>
<tr><td><br></td><td></td></tr>
</s:iterator>
<tr>
<td></td>
<td><s:submit value="Update" style="width:195px; background-color:green; color:white;"></s:submit></td>
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