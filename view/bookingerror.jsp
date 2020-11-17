<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/themes/smoothness/jquery-ui.css" />
		<link rel="shortcut icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel="icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
	</head>
	<s:include value="/view/header.jsp"/>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <!-- START PRIMARY -->
    </div>
    <div id="primary" class="sidebar-no">
    	<div class="container group">
			<div class="row">
			   	<div id="primary" class="sidebar-right">
			    	<div class="container group">
			            <div class="row">
			                <!-- START CONTENT -->
			                <div id="content-blog" class="span9 content group">
			                    <div class="post type-post status-publish format-video sticky hentry category-design hentry-post group blog-small">
			                    	<div class="thumbnail">
			                            <div class="row">
				                            <div class="slogan">
										        <center><h1 class="home_title title_bottom_space">No ticket availabe on the selected date. Please try searching for other dates.</h1></center>
										    	<center>
										    	<s:form action="searchAgain" theme="simple">
<tr>
<td></td>
<td>
<s:submit value="Search Again" style="width:200px;" id="loginbtn"></s:submit>
</td>
</tr>
<tr><td><br><br><br><br><br><br><br><br><br><br></td><td></td></tr>
</s:form>
</center>
										    </div>
										</div>
			                        </div>
			                    </div>
					     	</div>
					    	<%-- <s:include value="/views/sidebar.jsp"/> --%>
					    </div>
			        </div>
			    </div>
		    </div>
		</div><script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/jquery-ui.min.js"></script>
	<script type="text/javascript">
	 $("#demo").datepicker({
	        changeMonth: true,
	        changeYear: true,
	        hideIfNoPrevNext: true,
	        dateFormat: "dd/mm/yy",
	        minDate: +0, 
	        beforeShowDay:$.datepicker.noWeekends,
	    }); 
		
	</script>
<s:include value="/view/footer.jsp"/>
</html>