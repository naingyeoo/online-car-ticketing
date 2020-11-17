<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE struts PUBLIC
	"-//Apache Software Foundation//DTD Struts Configuration 2.3//EN"
	"http://struts.apache.org/dtds/struts-2.3.dtd">

<struts>

    <constant name="struts.enable.DynamicMethodInvocation" value="false" />
    <constant name="struts.devMode" value="false" />
    <constant name="struts.custom.i18n.resources" value="global" />   


  <package name="action" namespace="/" extends="struts-default">
        <action name="loginAction" method="execute" class="action.LoginAction">
            <result name="success">/views/home.jsp</result>
            <result name="input">/views/login.jsp</result>
            <result name="error">/views/login.jsp</result>
        </action> 
        <action name="adminLoginAction" method="execute" class="action.AdminLoginAction">
            <result name="success">/Admin/adminViews/dashboard.jsp</result>
            <result name="input">/Admin/adminViews/login.jsp</result>
            <result name="error">/Admin/adminViews/login.jsp</result>
        </action>
        <action name="mloginAction" method="execute" class="action.MloginAction">
            <result name="success">/mviews/mhome.jsp</result>
            <result name="input">/mviews/mlogin.jsp</result>
            <result name="error">/mviews/mlogin.jsp</result>
        </action>  
        <action name="signinAction" method="execute" class="action.SigninAction">
            <result name="success">/views/memberlogin.jsp</result>
            <result name="input">/views/signin.jsp</result>
            <result name="error">/views/signin.jsp</result>
        </action> 
        <action name="msigninAction" method="execute" class="action.MsigninAction">
            <result name="success">/mviews/mmemberLogin.jsp</result>
            <result name="input">/mviews/msignin.jsp</result>
            <result name="error">/mviews/msignin.jsp</result>
        </action> 
        <action name="memberChangePasswordAction" method="execute" class="action.MemberChangePasswordAction">
            <result name="success">/views/home.jsp</result>
            <result name="input">/views/memberChangePassword.jsp</result>
            <result name="error">/views/memberChangePassword.jsp</result>
        </action>
        <action name="mmemberChangePasswordAction" method="execute" class="action.MmemberChangePasswordAction">
            <result name="success">/mviews/mhome.jsp</result>
            <result name="input">/mviews/mmemberChangePassword.jsp</result>
            <result name="error">/mviews/mmemberChangePassword.jsp</result>
        </action>    
         <action name="applicantCheckAction" method="execute" class="action.ApplicantCheckAction">
        	<result name="success">/Admin/adminViews/applicant/applicant.jsp</result>
        </action>
        
        <action name="displayApplicantAction" method="execute" class="action.AdminApplicantAction">
        	<result name="success">/Admin/adminViews/applicant/applicant.jsp</result>
        </action>
        
        <action name="displayApplicantListAction" method="execute" class="action.AdminApplicantListAction">
        	<result name="success">/Admin/adminViews/applicant/applicantlist.jsp</result>
        </action>
        
        <action name="applicantExportAction" method="execute" class="action.ApplicantExportAction">
        	<result name="success">/Admin/adminViews/applicant/applicantlist.jsp</result>
        </action>
        
         <action name="applicantDateListExportAction" method="execute" class="action.ApplicantDateListExportAction">
        	<result name="success">/Admin/adminViews/applicant/applicantlist.jsp</result>
        </action>
        
        <action name="applicantsearchIDAction" method="execute" class="action.AdminApplicantSearchIDAction">
        	<result name="success">/Admin/adminViews/applicant/applicantSearchID.jsp</result>
        </action>
        
         <action name="applicantsearchIDListAction" method="execute" class="action.AdminApplicantSearchIDListAction">
        	<result name="success">/Admin/adminViews/applicant/applicantsearchIDList.jsp</result>
        </action>
        
        <action name="applicantsearchDateAction" method="execute" class="action.AdminApplicantSearchDateAction">
        	<result name="success">/Admin/adminViews/applicant/applicantSearchDate.jsp</result>
        </action>
        
         <action name="applicantsearchDateListAction" method="execute" class="action.AdminApplicantSearchDateListAction">
        	<result name="success">/Admin/adminViews/applicant/applicantSearchDateList.jsp</result>
        </action>
        
         <action name="applicantsearchNameAction" method="execute" class="action.AdminApplicantSearchNameAction">
        	<result name="success">/Admin/adminViews/applicant/applicantSearchName.jsp</result>
        </action>
        
          <action name="applicantsearchNameListAction" method="execute" class="action.AdminApplicantSearchNameListAction">
        	<result name="success">/Admin/adminViews/applicant/applicantSearchNameList.jsp</result>
        </action>
     
        <action name="adminPassportOfficeCreateAction" method="execute" class="action.AdminPassportOfficeCreateAction">
            <result name="success">/Admin/adminViews/passportOffice/newPassportOffice.jsp</result>
        </action>
        <action name="displayPassportOfficeAction" method="display" class="action.AdminPassportOfficeAction">
        	<result name="success">/Admin/adminViews/passportOffice/officeView.jsp</result>
        </action> 
        <action name="updatePassportOfficeAction" class="action.AdminPassportOfficeUpdateAction">
			<result name="success">/Admin/adminViews/passportOffice/newUpdateOffice.jsp</result>
		</action> 
        <action name="adminNormalFeeCreateAction" method="execute" class="action.AdminNormalFeeCreateAction">
            <result name="success">/Admin/adminViews/passportFee/newNormalFee.jsp</result>
            <result name="error">/Admin/adminViews/passportFee/normalFeeCreate.jsp</result>
            <result name="input">/Admin/adminViews/passportFee/normalFeeCreate.jsp</result>
        </action>
        <action name="updatePassportOffice" method="updatePassportOffice" class="action.AdminPassportOfficeAction">
        	<result name="success">/Admin/adminViews/passportOffice/officeUpdate.jsp</result>
        </action>
        <action name="displayFeeAction" method="display" class="action.AdminFeeAction">
        	<result name="success">/Admin/adminViews/passportFee/feeView.jsp</result>
        </action> 
        <action name="updateNormalFeeAction" class="action.AdminNormalFeeUpdateAction">
			<result name="success">/Admin/adminViews/passportFee/newUpdateNormalFee.jsp</result>
		</action> 
        <action name="adminOtherFeeCreateAction" method="execute" class="action.AdminOtherFeeCreateAction">
            <result name="success">/Admin/adminViews/passportFee/newOtherFee.jsp</result>
        </action>   
         <action name="updateOtherFeeAction" class="action.AdminOtherFeeUpdateAction">
			<result name="success">/Admin/adminViews/passportFee/newUpdateOtherFee.jsp</result>
		</action> 
		<action name="updateNormalFee" method="updateFee" class="action.AdminFeeAction">
        	<result name="success">/Admin/adminViews/passportFee/normalFeeUpdate.jsp</result>
        </action>
		<action name="updateOtherFee" method="updateFee" class="action.AdminFeeAction">
        	<result name="success">/Admin/adminViews/passportFee/otherFeeUpdate.jsp</result>
        </action>
		
		<action name="displayPassportTypeAction" method="display" class="action.AdminPassportTypeAction">
        	<result name="success">/Admin/adminViews/passportType/typeView.jsp</result>
        </action> 
        <action name="updatePassportTypeAction" class="action.AdminPassportTypeUpdateAction">
			<result name="success">/Admin/adminViews/passportType/newUpdateType.jsp</result>
		</action>  
		 <action name="updatePassportType" method="updatePassportType" class="action.AdminPassportTypeAction">
        	<result name="success">/Admin/adminViews/passportType/typeUpdate.jsp</result>
        </action>
        <action name="updateHolidayAction" method="execute" class="action.AdminHolidayUpdateAction">
			<result name="success">/Admin/adminViews/Holidays/newUpdateHoliday.jsp</result>
		</action>  
		<action name="displayHolidayAction" method="display" class="action.AdminHolidayAction">
        	<result name="success">/Admin/adminViews/Holidays/holidayView.jsp</result>
        </action>
        <action name="adminHolidayCreateAction" method="execute" class="action.AdminHolidayCreateAction">
            <result name="success">/Admin/adminViews/Holidays/newHoliday.jsp</result>
        </action> 
        <action name="deleteholiday" method="delete" class="action.AdminHolidayAction">
        	<result name="success">Admin/adminViews/Holidays/holidayView.jsp</result>
        </action>
        <action name="updateHoliday" method="updateHoliday" class="action.AdminHolidayAction">
        	<result name="success">/Admin/adminViews/Holidays/holidayUpdate.jsp</result>
        </action>
        <action name="adminChangePasswordAction" method="execute" class="action.AdminChangePasswordAction">
            <result name="success">/Admin/adminViews/login.jsp</result>
            <result name="input">/Admin/adminViews/adminChangePassword.jsp</result>
            <result name="error">/Admin/adminViews/adminChangePassword.jsp</result>
        </action>
        
    </package> 
    
    <package name="action2" namespace="/" extends="struts-default">   
        <action name="admin" >
            <result>/Admin/adminViews/login.jsp</result>
        </action>
        <action name="applicantRegisterAction" method="execute" class="action.ApplicantRegisterAction">
            <result name="success">/views/preregisterform.jsp</result>
            <result name="input">/views/applicant.jsp</result>
            <result name="error">/views/applicant.jsp</result>
        </action>
        
         <action name="mapplicantRegisterAction" method="execute" class="action.mApplicantRegisterAction">
            <result name="success">/mviews/mpreregisterform.jsp</result>
            <result name="input">/mviews/mapplicant.jsp</result>
            <result name="error">/mviews/mapplicant.jsp</result>
        </action>
        
    </package>
     <package name="action2" namespace="/" extends="struts-default">   
        <action name="inserttype" method="execute" class="action.Alltypeaction">
            <result name="success">/Admin/adminViews/passportType/typeView.jsp</result>
        </action>
        <action name="delete" method="execute" class="action.Alltypeaction">
            <result name="success">/Admin/adminViews/passportType/typeView.jsp</result>
        </action>
    </package>
    
    <package name="news" namespace="/" extends="struts-default">   
        <action name="adminNewsCreateAction" method="execute" class="action.AdminNewsCreateAction">
            <result name="success">/Admin/adminViews/passportNews/nextPassportNews.jsp</result>
            <result name="error">/Admin/adminViews/passportNews/newsCreate.jsp</result>            
        </action>
        <action name="displayPassportNewsAction" method="display" class="action.AdminNewsAction">
        	<result name="success">/Admin/adminViews/passportNews/newsView.jsp</result>
        </action> 
        <action name="displayPassportNewsAction"  class="action.AdminNewsAction">
        	<result name="success">/Admin/adminViews/passportNews/newsView.jsp</result>
        </action>
        <action name="delete" method="delete" class="action.AdminNewsDeleteAction">
			<result name="success">/Admin/adminViews/passportNews/newsView.jsp</result>
		</action> 
		<action name="updatePassportNews" method="updatePassportNews" class="action.AdminNewsAction">
        	<result name="success">/Admin/adminViews/passportNews/newsUpdate.jsp</result>
			<result name="error">/Admin/adminViews/passportNews/newsUpdate.jsp</result>
        </action>
        <action name="updatePassportNewsAction" class="action.AdminPassportNewsUpdateAction">
			<result name="success">/Admin/adminViews/passportNews/updateNews.jsp</result>
			<result name="error">/Admin/adminViews/passportNews/newsUpdate.jsp</result>
		</action>
		
    </package>
    
    

</struts>
