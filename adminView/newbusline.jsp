<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="shortcut icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    <link rel="icon" type="image/x-icon" href="/BookingSystem/imagePhoto/abcd.png" />
    </head>
<body>
	<s:include value="/adminView/header.jsp"/>
  	<div class="content-wrapper">
		<section class="content-header">
    	</section>
		<!-- Main content -->
    	<section class="content container-fluid">
			<div class="col-md-12">
	          <!-- Horizontal Form -->
	         	<div class="box box-info">
	            	<div class="box-header with-border">
	              		<h3 class="box-title"><s:text name="Create New Bus Line"></s:text></h3>
	            	</div>
	            	<s:form action="createNewBusLine" theme="simple">
	            	<table>
<tr>
<th>&nbsp;&nbsp;Bus Name</th>
<th>Departure Date</th>
<th>Leaving From</th>
<th>Going To</th>
<th>Departure Time:</th>
<th>Price:</th>
</tr>
<tr>
<td>&nbsp;&nbsp;<s:textarea name="travel.busname" style="width:120px; height:30px;"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.deparaturedate" id="demo1" style="width:120px; height:30px;"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.leavingfrom" style="width:120px; height:30px;"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.goingto" style="width:120px; height:30px;"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.deparaturetime" style="width:120px; height:30px;"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.price" style="width:120px; height:30px;"></s:textarea>&nbsp;&nbsp;</td>
</tr>
<tr><td><br></td></tr>
<tr>
<th>&nbsp;&nbsp;SeatNo1</th>
<th>SeatNo2</th>
<th>SeatNo3</th>
<th>SeatNo4</th>
<th>SeatNo5</th>
<th>SeatNo6</th>
</tr>
<tr>
<td>&nbsp;&nbsp;<s:textarea name="travel.s1" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s2" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s3" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s4" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s5" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s6" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
</tr>
</tr>
<tr><td><br></td></tr>
<tr>
<th>&nbsp;&nbsp;SeatNo7</th>
<th>SeatNo8</th>
<th>SeatNo9</th>
<th>SeatNo10</th>
<th>SeatNo11</th>
<th>SeatNo12</th>
</tr>
<tr>
<td>&nbsp;&nbsp;<s:textarea name="travel.s7" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s8" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s9" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s10" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s11" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s12" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
</tr>
<tr><td><br></td></tr>

<tr>
<th>&nbsp;&nbsp;SeatNo13</th>
<th>SeatNo14</th>
<th>SeatNo15</th>
<th>SeatNo16</th>
<th>SeatNo17</th>
<th>SeatNo18</th>
</tr>
<tr>
<td>&nbsp;&nbsp;<s:textarea name="travel.s13" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s14" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s15" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s16" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s17" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s18" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
</tr>
<tr><td><br></td></tr>
<tr>
<th>&nbsp;&nbsp;SeatNo19</th>
<th>SeatNo20</th>
<th>SeatNo21</th>
<th>SeatNo22</th>
<th>SeatNo23</th>
<th>SeatNo24</th>
</tr>
<tr>
<td>&nbsp;&nbsp;<s:textarea name="travel.s19" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s20" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s21" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s22" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s23" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s24" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
</tr>
<tr><td><br></td></tr>
<tr>
<th>&nbsp;&nbsp;SeatNo25</th>
<th>SeatNo26</th>
<th>SeatNo27</th>
<th>SeatNo28</th>
<th>SeatNo29</th>
<th>SeatNo30</th>
</tr>
<tr>
<td>&nbsp;&nbsp;<s:textarea name="travel.s25" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s26" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s27" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s28" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s29" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s30" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
</tr>
<tr><td><br></td></tr>
<tr>
<th>&nbsp;&nbsp;SeatNo31</th>
<th>SeatNo32</th>
<th>SeatNo33</th>
<th>SeatNo34</th>
<th>SeatNo35</th>
<th>SeatNo36</th>
</tr>
<tr>
<td>&nbsp;&nbsp;<s:textarea name="travel.s231" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s32" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s33" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s34" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s35" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s36" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
</tr>
<tr><td><br></td></tr>
<tr>
<th>&nbsp;&nbsp;SeatNo37</th>
<th>SeatNo38</th>
<th>SeatNo39</th>
<th>SeatNo40</th>
<th>SeatNo41</th>
<th>SeatNo42</th>
</tr>
<tr>
<td>&nbsp;&nbsp;<s:textarea name="travel.s37" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s38" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s39" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s40" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s41" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s42" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
</tr>
<tr><td><br></td></tr>
<tr>
<th>&nbsp;&nbsp;SeatNo43</th>
<th>SeatNo44</th>
<th>numOfSeat</th>
<th></th>
<th></th>
<th></th>
</tr>
<tr>
<td>&nbsp;&nbsp;<s:textarea name="travel.s43" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.s44" style="width:120px; height:30px;" value="0"></s:textarea>&nbsp;&nbsp;</td>
<td><s:textarea name="travel.numOfSeat" style="width:120px; height:30px;" value="44"></s:textarea>&nbsp;&nbsp;</td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<tr><td><br></td></tr>
<tr>
<td>&nbsp;&nbsp;<s:submit value="Create" style="width:120px; background-color:green; color:white;"></s:submit></td>
</tr>
<tr><td><br></td></tr>
</table>
</s:form>
	          	</div>
	        </div>	
        </section>
    </div> 
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.3/jquery-ui.min.js"></script>
	<script type="text/javascript">
	 $("#demo1").datepicker({
	        changeMonth: true,
	        changeYear: true,
	        hideIfNoPrevNext: true,
	        dateFormat: "dd/mm/yy",
	        minDate: +0, 
	        
	    }); 
		
	</script>	         			
  	<!-- /.content-wrapper -->
	<s:include value="/adminView/footer.jsp"/>
</body>
</html>