package action;

import java.sql.SQLException;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;


import com.opensymphony.xwork2.ActionSupport;

import service.DBOperation;

import entity.Travel;

public class BookingAction extends ActionSupport {
	Travel travel=new Travel();
	ArrayList<Travel> tlist;

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public ArrayList<Travel> getTlist() {
		return tlist;
	}

	public void setTlist(ArrayList<Travel> tlist) {
		this.tlist = tlist;
	}

	public String display() throws SQLException
	{
		Boolean gflag=false;
		String goneprice="";
		String ttprice="";
		int cprice=0;
		int tprice=0;
		int nseat=0;
		String sseat="";
		tlist=new ArrayList<Travel>();
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		DBOperation db=new DBOperation();
		gflag=db.checkDisplayBookingData(travel);
		if(gflag)
		{	
		//input number of seats from user
		nseat=travel.getNumOfSeat();
		sseat=String.valueOf(nseat);
		session.setAttribute("seat", sseat);
				
		//carry one seat price from database
		goneprice=db.displayPrice(travel);
		session.setAttribute("onePrice", goneprice);
		
		//total price=input number of seats from user* one seat price
			if(goneprice!=null)
			{
			cprice=Integer.parseInt(goneprice);
			tprice=cprice*nseat;
			}
		ttprice=String.valueOf(tprice);
		session.setAttribute("price", ttprice);
		tlist=db.displayBookingData(travel);
		return "success";
		}
		else
		{
			addActionError("No ticket availabe on the selected date. Please try searching for other dates.");
			return "error";
		}
	}
	

}
