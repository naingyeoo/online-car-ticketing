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
  			<h1>Bus Line</h1>
    	</section>
		<!-- Main content -->
    	<section class="content container-fluid">
			<div class="row">
        		<div class="col-xs-12">
          			<div class="box">
            			<div class="box-header">
              				<h3 class="box-title">All Bus Line(<s:property value="buslist.size" />)</h3>
              				<div>
              					<table>
              					<tr>
              					<td><s:text name="Create New Bus Line"></s:text>&nbsp;&nbsp;&nbsp;</td>
              					<td style="background-color:orange; width:100px; height:30px;">
              					<s:a href="/BookingSystem/adminView/newbusline.jsp" style="color:#FFF;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Create</s:a>
              					</td>
              					</tr>
              					</table>
              				</div>              				
            			</div>
            			<!-- /.box-header -->
            			<div class="box-body table-responsive no-padding"  style="height:375px;">
              				<table class="table table-bordered">
              					<thead>
				                <tr>
				                	<th>Bus Name</th>
<th>Deparature Date</th>
<th>Leaving From</th>
<th>Going To</th>
<th>Deparature Time</th>
<th>Price</th>
									<th colspan='2'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Action</th>
								</tr>
				                </thead>
							    <tbody>
							    	<s:iterator value="buslist">
<tr>
<td ><s:property value="busname"></s:property></td>
<td><s:property value="deparaturedate"></s:property></td>
<td><s:property value="leavingfrom"></s:property></td>
<td><s:property value="goingto"></s:property></td>
<td><s:property value="deparaturetime"></s:property></td>
<td><s:property value="price"></s:property></td>
<td style="background-color:green; width:100px;">
<s:url action="carryUpdateData" var="carryUpdateData">
<s:param name="sid" value="sid">
</s:param>
</s:url>
<s:a href="%{carryUpdateData}" style="color:#FFF;">Update</s:a></td>
<td style="background-color:red; width:100px; ">
<s:url action="deletebusline" var="deletebusline">
<s:param name="sid" value="sid">
</s:param>
</s:url>
<s:a href="%{deletebusline}" style="color:#FFF;">Delete</s:a>
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