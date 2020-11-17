package adminAction;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import service.DBOperation;

public class AdminChangePasswordAction extends ActionSupport{
	String adminOldPassword;
	String adminNewPassword;
	String adminConfirmPassword;

	public String getAdminOldPassword() {
		return adminOldPassword;
	}

	public void setAdminOldPassword(String adminOldPassword) {
		this.adminOldPassword = adminOldPassword;
	}

	public String getAdminNewPassword() {
		return adminNewPassword;
	}

	public void setAdminNewPassword(String adminNewPassword) {
		this.adminNewPassword = adminNewPassword;
	}



	public String getAdminConfirmPassword() {
		return adminConfirmPassword;
	}



	public void setAdminConfirmPassword(String adminConfirmPassword) {
		this.adminConfirmPassword = adminConfirmPassword;
	}



	public String execute() throws SQLException
	{
		DBOperation data=new DBOperation();
		data.adminChangePassword(adminOldPassword, adminNewPassword);
		return "success";
	}
}
