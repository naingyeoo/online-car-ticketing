package adminAction;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import service.DBOperation;
import entity.Travel;

public class SearchSoldOutSeatInfoAction extends ActionSupport {
	ArrayList<Travel> seatUpdatelist;

	Travel travel=new Travel();

	public ArrayList<Travel> getSeatUpdatelist() {
		return seatUpdatelist;
	}

	public void setSeatUpdatelist(ArrayList<Travel> seatUpdatelist) {
		this.seatUpdatelist = seatUpdatelist;
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}


	public String execute() throws SQLException
	{
		Boolean gflag=false;
		DBOperation db=new DBOperation();
		gflag=db.adminCheckDisplayBookingData(travel);
		if(gflag)
		{	
		seatUpdatelist=new ArrayList<Travel>();
		String gs1;
		String gs2;
		String gs3;
		String gs4;
		String gs5;
		String gs6;
		String gs7;
		String gs8;
		String gs9;
		String gs10;
		String gs11;
		String gs12;
		String gs13;
		String gs14;
		String gs15;
		String gs16;
		String gs17;
		String gs18;
		String gs19;
		String gs20;
		String gs21;
		String gs22;
		String gs23;
		String gs24;
		String gs25;
		String gs26;
		String gs27;
		String gs28;
		String gs29;
		String gs30;
		String gs31;
		String gs32;
		String gs33;
		String gs34;
		String gs35;
		String gs36;
		String gs37;
		String gs38;
		String gs39;
		String gs40;
		String gs41;
		String gs42;
		String gs43;
		String gs44;
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		gs1=db.showTableSeat1(travel);
		session.setAttribute("rs1", gs1);
		gs2=db.showTableSeat2(travel);
		session.setAttribute("rs2", gs2);
		gs3=db.showTableSeat3(travel);
		session.setAttribute("rs3", gs3);
		gs4=db.showTableSeat4(travel);
		session.setAttribute("rs4", gs4);
		gs5=db.showTableSeat5(travel);
		session.setAttribute("rs5", gs5);
		gs6=db.showTableSeat6(travel);
		session.setAttribute("rs6", gs6);
		gs7=db.showTableSeat7(travel);
		session.setAttribute("rs7", gs7);
		gs8=db.showTableSeat8(travel);
		session.setAttribute("rs8", gs8);
		gs9=db.showTableSeat9(travel);
		session.setAttribute("rs9", gs9);
		gs10=db.showTableSeat10(travel);
		session.setAttribute("rs10", gs10);
		gs11=db.showTableSeat11(travel);
		session.setAttribute("rs11", gs11);
		gs12=db.showTableSeat12(travel);
		session.setAttribute("rs12", gs12);
		gs13=db.showTableSeat13(travel);
		session.setAttribute("rs13", gs13);
		gs14=db.showTableSeat14(travel);
		session.setAttribute("rs14", gs14);
		gs15=db.showTableSeat15(travel);
		session.setAttribute("rs15", gs15);
		gs16=db.showTableSeat16(travel);
		session.setAttribute("rs16", gs16);
		gs17=db.showTableSeat17(travel);
		session.setAttribute("rs17", gs17);
		gs18=db.showTableSeat18(travel);
		session.setAttribute("rs18", gs18);
		gs19=db.showTableSeat19(travel);
		session.setAttribute("rs19", gs19);
		gs20=db.showTableSeat20(travel);
		session.setAttribute("rs20", gs20);
		gs21=db.showTableSeat21(travel);
		session.setAttribute("rs21", gs21);
		gs22=db.showTableSeat22(travel);
		session.setAttribute("rs22", gs22);
		gs23=db.showTableSeat23(travel);
		session.setAttribute("rs23", gs23);
		gs24=db.showTableSeat24(travel);
		session.setAttribute("rs24", gs24);
		gs25=db.showTableSeat25(travel);
		session.setAttribute("rs25", gs25);
		gs26=db.showTableSeat26(travel);
		session.setAttribute("rs26", gs26);
		gs27=db.showTableSeat27(travel);
		session.setAttribute("rs27", gs27);
		gs28=db.showTableSeat28(travel);
		session.setAttribute("rs28", gs28);
		gs29=db.showTableSeat29(travel);
		session.setAttribute("rs29", gs29);
		gs30=db.showTableSeat30(travel);
		session.setAttribute("rs30", gs30);
		gs31=db.showTableSeat31(travel);
		session.setAttribute("rs31", gs31);
		gs32=db.showTableSeat32(travel);
		session.setAttribute("rs32", gs32);
		gs33=db.showTableSeat33(travel);
		session.setAttribute("rs33", gs33);
		gs34=db.showTableSeat34(travel);
		session.setAttribute("rs34", gs34);
		gs35=db.showTableSeat35(travel);
		session.setAttribute("rs35", gs35);
		gs36=db.showTableSeat36(travel);
		session.setAttribute("rs36", gs36);
		gs37=db.showTableSeat37(travel);
		session.setAttribute("rs37", gs37);
		gs38=db.showTableSeat38(travel);
		session.setAttribute("rs38", gs38);
		gs39=db.showTableSeat39(travel);
		session.setAttribute("rs39", gs39);
		gs40=db.showTableSeat40(travel);
		session.setAttribute("rs40", gs40);
		gs41=db.showTableSeat41(travel);
		session.setAttribute("rs41", gs41);
		gs42=db.showTableSeat42(travel);
		session.setAttribute("rs42", gs42);
		gs43=db.showTableSeat43(travel);
		session.setAttribute("rs43", gs43);
		gs44=db.showTableSeat44(travel);
		session.setAttribute("rs44", gs44);
		seatUpdatelist=db.displayData(travel);
		return "success";
		}
		else
		{
			addActionError("Bus Line Information is not found.");
			return "error";
		}
	}

		



}
