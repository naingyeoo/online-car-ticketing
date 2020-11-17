package adminAction;

import java.sql.SQLException;
import java.util.ArrayList;

import service.DBOperation;

import entity.About;
import entity.Service;
import entity.Travel;

public class DisplayAboutAction {
	ArrayList<About> aboutlist;
	About about=new About();
	int aboutid;
	
	
	public ArrayList<About> getAboutlist() {
		return aboutlist;
	}
	public void setAboutlist(ArrayList<About> aboutlist) {
		this.aboutlist = aboutlist;
	}
	public About getAbout() {
		return about;
	}
	public void setAbout(About about) {
		this.about = about;
	}
	public int getAboutid() {
		return aboutid;
	}
	public void setAboutid(int aboutid) {
		this.aboutid = aboutid;
	}
	public String displayabout() throws SQLException
	{
		aboutlist=new ArrayList<About>();
		DBOperation db=new DBOperation();
		aboutlist=db.displayAbout();
		return "success";
	}
	public String deleteabout() throws SQLException
	{
		aboutlist=new ArrayList<About>();
		DBOperation db=new DBOperation();
		aboutlist=db.deleteAbout(aboutid);
		return "success";
	}
	public String carryAbout() throws SQLException
	{
		aboutlist=new ArrayList<About>();
		DBOperation db=new DBOperation();
		aboutlist=db.carryAbout(aboutid);
		return "success";
	}
	
	
}
