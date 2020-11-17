package adminAction;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import service.DBOperation;

import entity.Travel;

public class DisplayBusLineAction {
	ArrayList<Travel> buslist;
	Travel travel=new Travel();
	int sid;
	
	public ArrayList<Travel> getBuslist() {
		return buslist;
	}

	public void setBuslist(ArrayList<Travel> buslist) {
		this.buslist = buslist;
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String displaybusline() throws SQLException
	{
		buslist=new ArrayList<Travel>();
		DBOperation db=new DBOperation();
		buslist=db.displayBusLine();
		return "success";
	}
	public String deletebusline() throws SQLException
	{
		buslist=new ArrayList<Travel>();
		DBOperation db=new DBOperation();
		buslist=db.deleteBusLine(sid);
		return "success";
	}
	
	public String carryUpdateData() throws SQLException
	{
		buslist=new ArrayList<Travel>();
		DBOperation db=new DBOperation();
		buslist=db.carryUpdateProfile(sid);
		return "success";
	}
	


}
