package action;

import java.sql.SQLException;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import service.DBOperation;
import entity.Travel;
import entity.User;

public class RegisterAction extends ActionSupport{
	User user=new User();
	Travel travel;

	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public Travel getTravel() {
		return travel;
	}



	public void setTravel(Travel travel) {
		this.travel = travel;
	}



	public String execute() throws SQLException
	{
		travel=new Travel();
		DBOperation db=new DBOperation();
		db.insertUserInfo(user);
		return "success";
	}

}
