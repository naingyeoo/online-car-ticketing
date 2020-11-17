package adminAction;

import java.sql.SQLException;
import java.util.ArrayList;

import service.DBOperation;

import entity.Travel;
import entity.User;

public class DisplayBookingListAction {
	ArrayList<User> userlist;
	User user=new User();
	int uid;
	public ArrayList<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(ArrayList<User> userlist) {
		this.userlist = userlist;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}
	public String displaybookinglist() throws SQLException
	{
		userlist=new ArrayList<User>();
		DBOperation db=new DBOperation();
		userlist=db.displayBookingList();
		return "success";
	}
	public String deletebookinglist() throws SQLException
	{
		userlist=new ArrayList<User>();
		DBOperation db=new DBOperation();
		userlist=db.deleteBookingList(uid);
		return "success";
	}
	public String searchByName() throws SQLException
	{
		userlist=new ArrayList<User>();
		DBOperation db=new DBOperation();
		userlist=db.SearchByName(user);
		return "success";
	}
	
	
}
