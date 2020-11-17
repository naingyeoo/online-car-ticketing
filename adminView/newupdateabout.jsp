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
	              		<h3 class="box-title"><s:text name="Please check your update about info"></s:text></h3>
	            	</div>
            			<!-- /.box-header -->
            			<div class="box-body table-responsive no-padding"  style="height:375px;">
              				<table class="table table-bordered">
              					<thead>
				                <tr>
<th style="width:150px;">City</th>
<th style="width:200px;">Place</th>
<th style="width:550px;">Phone Info</th>
</tr>
				                </thead>
							    <tbody>
							    	<tr>
<td><s:property value="about.city"></s:property></td>
<td><s:property value="about.place"></s:property></td>
<td><s:property value="about.phoneInfo"></s:property></td>
</tr>
							    </tbody>
            				</table>
            				<br>
<s:form action="displayabout" theme="simple">
&nbsp;&nbsp;<s:submit value="About" style="width:150px; background-color:green; color:white;"></s:submit>
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