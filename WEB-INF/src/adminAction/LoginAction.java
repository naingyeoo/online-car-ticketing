package adminAction;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import service.DBOperation;

public class LoginAction extends ActionSupport {
	String name;
	String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() throws SQLException, ClassNotFoundException
	{
		DBOperation db=new DBOperation();
		Boolean flag=db.loginCheck(name, password);
		if(flag==true)
		{
			return "success";
		}
		else
		{
			addActionError("User name and password is not correct");
			return "error";
		}
		
		
	}

}
