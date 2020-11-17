<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="service.DBOperation"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="shortcut icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel="icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
	<title>Service</title>
</head>
<body>
	<%
		Class.forName("com.mysql.jdbc.Driver");
	  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db?useUnicode=yes&characterEncoding=UTF-8", "root", "root");
	%>
	<s:include value="/view/header.jsp"/>
	<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Express Bus Ticket Outlets</h3> 
	<!-- START PRIMARY -->
	<div id="primary" class="sidebar-right">
    	<div class="container group">
            <div class="row">
             <!-- START CONTENT -->
                <div id="content-blog" class="span9 content group">
                    <div class="post type-post status-publish format-video sticky hentry category-design hentry-post group blog-small">
						<div class="thumbnail">
						    <div class="table-responsive">
			        				<table>
						    <tr><td><h3>Yangon</h3></td></tr>
			        				<%
			        					String gcity="Yangon";
										String sqly="select * from About where city='"+gcity+"'";
										Statement sty=conn.createStatement();
										ResultSet rsy=sty.executeQuery(sqly);
										while (rsy.next())
										{
									%>
									<tr><td><%=rsy.getString(3) %>:&nbsp;<%=rsy.getString(4) %></td></tr>
									<% }%>
									</table>
									<table>
						    <tr><td><h3>Mandalay</h3></td></tr>
			        				<%
			        				String ggcity="Mandalay";
										String sqlm="select * from About where city='"+ggcity+"'";
										Statement stm=conn.createStatement();
										ResultSet rsm=stm.executeQuery(sqlm);
										while (rsm.next())
										{
									%>
									<tr><td><%=rsm.getString(3) %>:&nbsp;<%=rsm.getString(4) %></td></tr>
									<% }%>
									</table>
									<table>
						    <tr><td><h3>Meiktila</h3></td></tr>
			        				<%
			        				String mgcity="Meiktila";
										String sqlmeik="select * from About where city='"+mgcity+"'";
										Statement stmeik=conn.createStatement();
										ResultSet rsmeik=stm.executeQuery(sqlmeik);
										while (rsmeik.next())
										{
									%>
									<tr><td><%=rsmeik.getString(3) %>:&nbsp;<%=rsmeik.getString(4) %></td></tr>
									<% }%>
									</table>
							</div>							       
				      	</div>
					</div>
				</div>
				<%-- <s:include value="/views/sidebar.jsp"/> --%>
			</div>
		</div>
	</div>  
	<s:include value="/view/footer.jsp"/> 
</body>
</html>