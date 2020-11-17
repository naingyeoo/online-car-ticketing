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
  			<h1>Admin Change Password</h1>
    	</section>
		<!-- Main content -->
    	<section class="content container-fluid">
			<div class="row">
        		<div class="col-xs-12">
          			<div class="box">
            			<div class="box-header">
              				<div>
              				</div>              				
            			</div>
            			<!-- /.box-header -->
            			<div class="box-body table-responsive no-padding"  style="height:375px;">
            			<s:form action="adminChangePasswordAction" theme="simple">
              				<table>
              					<thead>
              					<tr>
<td><h4>&nbsp;&nbsp;Old Password:<sup style="color:red;">*</sup>&nbsp;&nbsp;</h4></td>
<td ><s:password name="adminOldPassword" style="border:2px solid #143552;"></s:password></td>
<td><font color="red"><s:fielderror fieldName="adminOldPassword"></s:fielderror></font></td>
</tr>
<tr>
<td><h4>&nbsp;&nbsp;New Password:<sup style="color:red;">*</sup>&nbsp;&nbsp;</h4></td>
<td><s:password name="adminNewPassword" style="border:2px solid #143552;"></s:password></td>
<td><font color="red"><s:fielderror fieldName="adminNewPassword"></s:fielderror></font></td>
</tr>
<tr>
<td><h4>&nbsp;&nbsp;Confirm Password:<sup style="color:red;">*</sup>&nbsp;&nbsp;</h4></td>
<td><s:password name="adminConfirmPassword" style="border:2px solid #143552;"></s:password></td>
<td><font color="red"><s:fielderror fieldName="adminConfirmPassword"></s:fielderror></font></td>
</tr>
<tr>
<td colspan=2 style="text-align:right;">
<s:submit value="Change" style="width:180px; background-color:green; color:white;"></s:submit>
</td>
<td></td>
</tr>
				                </thead>
				                <tbody>
				                
							    </tbody>
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