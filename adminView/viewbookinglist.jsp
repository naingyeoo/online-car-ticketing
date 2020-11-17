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
  			<h1>All Booking List</h1>
    	</section>
		<!-- Main content -->
    	<section class="content container-fluid">
			<div class="row">
        		<div class="col-xs-12">
          			<div class="box">
            			<div class="box-header">
              				<div>
              					<table>
<s:form action="searchbyname" theme="simple">
<tr>
<td>Search by Traveller Name:</td>
<td><s:textfield name="user.name"></s:textfield></td>
<td>&nbsp;<s:submit value="Search" style="background-color:green; width:100px; height:30px; color:#FFF;"></s:submit></td>
<tr>
</tr>
</s:form>
</table>
              				</div>              				
            			</div>
            			<!-- /.box-header -->
            			<div class="box-body table-responsive no-padding"  style="height:375px;">
              				<table class="table table-bordered">
              					<thead>
				                <tr>
<th style="width:200px;">Traveller Name</th>
<th style="width:150px;">Gender</th>
<th style="width:150px;">Email</th>
<th style="width:150px;">Phone</th>
<th style="width:150px;">Bus Name</th>
<th style="width:150px;">Deparature Date</th>
<th style="width:100px;">Leaving From</th>
<th style="width:100px;">Going To</th>
<th style="width:100px;">Deparature Time</th>
<th style="width:100px;">Seat No.</th>
<th style="width:100px;">Subtotal Price</th>
<th style="width:100px;">Action</th>
</tr>
				                </thead>
							    <tbody>
							    	<s:iterator value="userlist">
<tr>
<td ><s:property value="name"></s:property></td>
<td ><s:property value="gender"></s:property></td>
<td ><s:property value="email"></s:property></td>
<td ><s:property value="phone"></s:property></td>
<td ><s:property value="busname"></s:property></td>
<td><s:property value="deparaturedate"></s:property></td>
<td><s:property value="leavingfrom"></s:property></td>
<td><s:property value="goingto"></s:property></td>
<td><s:property value="deparaturetime"></s:property></td>
<td ><s:property value="seatno"></s:property></td>
<td><s:property value="price"></s:property></td>
<td style="background-color:red; width:100px;">
<s:url action="deletebookinglist" var="deletebookinglist">
<s:param name="uid" value="uid">
</s:param>
</s:url>
<s:a href="%{deletebookinglist}" style="color:#FFF;">Delete</s:a>
</td>
</tr>
</s:iterator>
							    </tbody>
            				</table>
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