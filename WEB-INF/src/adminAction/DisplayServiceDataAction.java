package adminAction;

import java.sql.SQLException;
import java.util.ArrayList;

import service.DBOperation;

import entity.Service;

public class DisplayServiceDataAction {
	ArrayList<Service> servicelist;
	Service service=new Service();
	int serviceid;
	
	public ArrayList<Service> getServicelist() {
		return servicelist;
	}
	public void setServicelist(ArrayList<Service> servicelist) {
		this.servicelist = servicelist;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	public int getServiceid() {
		return serviceid;
	}
	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}
	public String displayservicedata() throws SQLException
	{
		servicelist=new ArrayList<Service>();
		DBOperation db=new DBOperation();
		servicelist=db.displayServiceData();
		return "success";
	}
	public String deleteservicedata() throws SQLException
	{
		servicelist=new ArrayList<Service>();
		DBOperation db=new DBOperation();
		servicelist=db.deleteServiceData(serviceid);
		return "success";
	}
	
	
}
