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
	              		<h3 class="box-title"><s:text name="Please check your new bus line data"></s:text></h3>
	            	</div>
            			<!-- /.box-header -->
            			<div class="box-body table-responsive no-padding"  style="height:375px;">
              				<table class="table table-bordered">
              					<thead>
				                <tr>
<th style="width:200px;">Bus Name</th>
<th style="width:150px;">Departure Date</th>
<th style="width:150px;">Leaving From</th>
<th style="width:150px;">Going To</th>
<th style="width:150px;">Departure Time</th>
<th style="width:150px;">Price</th>
</tr>
				                </thead>
							    <tbody>
							    	<tr>
<td><s:property value="travel.busname"></s:property></td>
<td><s:property value="travel.deparaturedate"></s:property></td>
<td><s:property value="travel.leavingfrom"></s:property></td>
<td><s:property value="travel.goingto"></s:property></td>
<td><s:property value="travel.deparaturetime"></s:property>
<td><s:property value="travel.price"></s:property></td>
</tr>
							    </tbody>
            				</table>
            				<br>
<s:form action="displaybusline" theme="simple">
&nbsp;&nbsp;<s:submit value="Bus Line" style="width:150px; background-color:green; color:white;"></s:submit>
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