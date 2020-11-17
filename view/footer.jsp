<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<head>
	
	</head>
	<body>
	<div id="footer">
	    <div id="copyright"><!-- START COPYRIGHT -->
	        <div class="container">
	            <div class="row">
	                <div class="left">
	                    <p>
	                       <center><strong>&nbsp; © 2019 Online Bus Ticket Booking</strong></center>
	                    </p>
	                </div>
	            </div>
	        </div>
	    </div><!-- END COPYRIGHT -->    
    	<div class="wrapper-border"></div>
    </div><!-- END WRAPPER -->


<script type="text/javascript">
    // Standard google maps function
    function initialize() {
        var myLatlng = new google.maps.LatLng(40.779502, -73.967857);
        var myOptions = {
            zoom: 12,
            center: myLatlng,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        }
        map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);
        TestMarker();
    }

    // Function for adding a marker to the page.
    function addMarker(location) {
        marker = new google.maps.Marker({
            position: location,
            map: map
        });
    }

    // Testing the addMarker function
    function TestMarker() {
           CentralPark = new google.maps.LatLng(37.7699298, -122.4469157);
           addMarker(CentralPark);
    }
</script>
<script type="text/javascript">
	$(function () {
		$('#datepicker').datepicker({
		      autoclose: true
		    })
	})
	</script>
  
<script type='text/javascript' src='/BookingSystem/js/comment-reply.min.js'></script>
<script type='text/javascript' src='/BookingSystem/js/underscore.min.js'></script>
<script type='text/javascript' src='/BookingSystem/js/jquery/jquery.masonry.min.js'></script>
<script type='text/javascript' src='/BookingSystem/sliders/polaroid/js/jquery.polaroid.js'></script>
<script type='text/javascript' src='/BookingSystem/js/jquery.colorbox-min.js'></script>
<script type='text/javascript' src='/BookingSystem/js/jquery.easing.js'></script>
<script type='text/javascript' src='/BookingSystem/js/jquery.flexslider-min.js'></script>
<script type='text/javascript' src='/BookingSystem/sliders/elastic/js/jquery.eislideshow.js'></script>
<script type='text/javascript' src='/BookingSystem/js/jquery.carouFredSel-6.1.0-packed.js'></script>
<script type='text/javascript' src='/BookingSystem/portfolios/libra/js/jquery.yit_portfolio_libra.js'></script>
<script type='text/javascript' src='/BookingSystem/js/jQuery.BlackAndWhite.js'></script>
<script type='text/javascript' src='/BookingSystem/js/jquery.touchSwipe.min.js'></script>
<script type='text/javascript' src='/BookingSystem/sliders/polaroid/js/jquery.transform-0.8.0.min.js'></script>
<script type='text/javascript' src='/BookingSystem/sliders/polaroid/js/jquery.preloader.js'></script>
<script type='text/javascript' src='/BookingSystem/js/hoverIntent.min.js'></script>
<script type='text/javascript' src='/BookingSystem/js/media-upload.min.js'></script>
<script type='text/javascript' src='/BookingSystem/js/jquery.clickout.min.js'></script>
<script type='text/javascript' src='/BookingSystem/js/responsive.js'></script>
<script type='text/javascript' src='/BookingSystem/js/mobilemenu.js'></script>
<script type='text/javascript' src='/BookingSystem/js/jquery.superfish.js'></script>
<script type='text/javascript' src='/BookingSystem/js/jquery.placeholder.js'></script>
<script type='text/javascript' src='/BookingSystem/js/contact.js'></script>
<script type='text/javascript' src='/BookingSystem/js/jquery.tweetable.js'></script>
<script type='text/javascript' src='/BookingSystem/js/jquery.tipsy.js'></script>
<script type='text/javascript' src='/BookingSystem/js/jquery.cycle.min.js'></script>
<script type='text/javascript' src='/BookingSystem/js/shortcodes.js'></script>
<script src="/BookingSystem/Admin/js/viewJS/bootstrap-datepicker.min.js"></script>
<script type='text/javascript' src='/BookingSystem/js/jquery.custom.js'></script>

</body>
<!-- END BODY -->
</html>