package action;

import java.sql.SQLException;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import service.DBOperation;
import entity.Check;
import entity.Travel;

public class SeatAction extends ActionSupport {
	ArrayList<Travel> userlist;
	Travel travel=new Travel();
	Check check;
	String seatInfo;

	public ArrayList<Travel> getUserlist() {
		return userlist;
	}

	public void setUserlist(ArrayList<Travel> userlist) {
		this.userlist = userlist;
	}

	

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public Check getCheck() {
		return check;
	}

	public void setCheck(Check check) {
		this.check = check;
	}

	public String getSeatInfo() {
		return seatInfo;
	}

	public void setSeatInfo(String seatInfo) {
		this.seatInfo = seatInfo;
	}

	public String execute() throws SQLException
	{
		int cValue=0;
		int nseat=0;
		userlist=new ArrayList<Travel>();
		DBOperation db=new DBOperation();
		userlist=db.displayData(travel);
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		
		nseat=travel.getNumOfSeat();
		
		String seatInfo="";
		if(check!=null)
		{
		if(check.isCheck1())
		{
			cValue++;
		}
		if(check.isCheck2())
		{
			cValue++;
		}

		if(check.isCheck3())
		{
			cValue++;
		}
		if(check.isCheck4())
		{
			cValue++;
		}
		if(check.isCheck5())
		{
			cValue++;
		}
		if(check.isCheck6())
		{
			cValue++;
		}
		if(check.isCheck7())
		{
			cValue++;
		}
		if(check.isCheck8())
		{
			cValue++;
		}
		if(check.isCheck9())
		{
			cValue++;
		}
		if(check.isCheck10())
		{
			cValue++;
		}
		if(check.isCheck11())
		{
			cValue++;
		}
		if(check.isCheck12())
		{
			cValue++;
		}
		if(check.isCheck13())
		{
			cValue++;
		}
		if(check.isCheck14())
		{
			cValue++;
		}
		if(check.isCheck15())
		{
			cValue++;
		}
		if(check.isCheck16())
		{
			cValue++;
		}
		if(check.isCheck17())
		{
			cValue++;
		}
		if(check.isCheck18())
		{
			cValue++;
		}
		if(check.isCheck19())
		{
			cValue++;
		}
		if(check.isCheck20())
		{
			cValue++;
		}
		if(check.isCheck21())
		{
			cValue++;
		}
		if(check.isCheck22())
		{
			cValue++;
		}
		if(check.isCheck23())
		{
			cValue++;
		}
		if(check.isCheck24())
		{
			cValue++;
		}
		if(check.isCheck25())
		{
			cValue++;
		}
		if(check.isCheck26())
		{
			cValue++;
		}
		if(check.isCheck27())
		{
			cValue++;
		}
		if(check.isCheck28())
		{
			cValue++;
		}
		if(check.isCheck29())
		{
			cValue++;
		}
		if(check.isCheck30())
		{
			cValue++;
		}
		if(check.isCheck31())
		{
			cValue++;
		}
		if(check.isCheck32())
		{
			cValue++;
		}
		if(check.isCheck33())
		{
			cValue++;
		}
		if(check.isCheck34())
		{
			cValue++;
		}
		if(check.isCheck35())
		{
			cValue++;
		}
		if(check.isCheck36())
		{
			cValue++;
		}
		if(check.isCheck37())
		{
			cValue++;
		}
		if(check.isCheck38())
		{
			cValue++;
		}
		if(check.isCheck39())
		{
			cValue++;
		}
		if(check.isCheck40())
		{
			cValue++;
		}
		if(check.isCheck41())
		{
			cValue++;
		}
		if(check.isCheck42())
		{
			cValue++;
		}
		if(check.isCheck43())
		{
			cValue++;
		}
		if(check.isCheck44())
		{
			cValue++;
		}
		}
		if(nseat!=cValue)
		{
			if(check==null)
			{
				addActionError("All tickets are sold out. So, you can select seats from other trip. Please click back button");
			}
			else
			{
				addActionError("You must select "+nseat+" Seat(s).");
			}
			return "error";
		}
		else
		{
			if(check.isCheck1())
			{
				seatInfo=seatInfo+" No1.";
				db.updateSeat1(travel);
			}
			if(check.isCheck2())
			{
				seatInfo=seatInfo+" No2.";
				db.updateSeat2(travel);
			}
			if(check.isCheck3())
			{
				seatInfo=seatInfo+" No3.";
				db.updateSeat3(travel);
			}
			if(check.isCheck4())
			{
				seatInfo=seatInfo+" No4.";
				db.updateSeat4(travel);
			}
			if(check.isCheck5())
			{
				seatInfo=seatInfo+" No5.";
				db.updateSeat5(travel);
			}
			if(check.isCheck6())
			{
				seatInfo=seatInfo+" No6.";
				db.updateSeat6(travel);
			}
			if(check.isCheck7())
			{
				seatInfo=seatInfo+" No7.";
				db.updateSeat7(travel);
			}
			if(check.isCheck8())
			{
				seatInfo=seatInfo+" No8.";
				db.updateSeat8(travel);
			}
			if(check.isCheck9())
			{
				seatInfo=seatInfo+" No9.";
				db.updateSeat9(travel);
			}
			if(check.isCheck10())
			{
				seatInfo=seatInfo+" No10.";
				db.updateSeat10(travel);
			}
			if(check.isCheck11())
			{
				seatInfo=seatInfo+" No11.";
				db.updateSeat11(travel);
			}
			if(check.isCheck12())
			{
				seatInfo=seatInfo+" No12.";
				db.updateSeat12(travel);
			}
			if(check.isCheck13())
			{
				seatInfo=seatInfo+" No13.";
				db.updateSeat13(travel);
			}
			if(check.isCheck14())
			{
				seatInfo=seatInfo+" No14.";
				db.updateSeat14(travel);
			}
			if(check.isCheck15())
			{
				seatInfo=seatInfo+" No15.";
				db.updateSeat15(travel);
			}
			if(check.isCheck16())
			{
				seatInfo=seatInfo+" No16.";
				db.updateSeat16(travel);
			}
			if(check.isCheck17())
			{
				seatInfo=seatInfo+" No17.";
				db.updateSeat17(travel);
			}
			if(check.isCheck18())
			{
				seatInfo=seatInfo+" No18.";
				db.updateSeat18(travel);
			}
			if(check.isCheck19())
			{
				seatInfo=seatInfo+" No19.";
				db.updateSeat19(travel);
			}
			if(check.isCheck20())
			{
				seatInfo=seatInfo+" No20.";
				db.updateSeat20(travel);
			}
			if(check.isCheck21())
			{
				seatInfo=seatInfo+" No21.";
				db.updateSeat21(travel);
			}
			if(check.isCheck22())
			{
				seatInfo=seatInfo+" No22.";
				db.updateSeat22(travel);
			}
			if(check.isCheck23())
			{
				seatInfo=seatInfo+" No23.";
				db.updateSeat23(travel);
			}
			if(check.isCheck24())
			{
				seatInfo=seatInfo+" No24.";
				db.updateSeat24(travel);
			}
			if(check.isCheck25())
			{
				seatInfo=seatInfo+" No25.";
				db.updateSeat25(travel);
			}
			if(check.isCheck26())
			{
				seatInfo=seatInfo+" No26.";
				db.updateSeat26(travel);
			}
			if(check.isCheck27())
			{
				seatInfo=seatInfo+" No27.";
			db.updateSeat27(travel);
			}
			if(check.isCheck28())
			{
				seatInfo=seatInfo+" No28.";
				db.updateSeat28(travel);
			}
			if(check.isCheck29())
			{
				seatInfo=seatInfo+" No29.";
				db.updateSeat29(travel);
			}
			if(check.isCheck30())
			{
				seatInfo=seatInfo+" No30.";
				db.updateSeat30(travel);
			}
			if(check.isCheck31())
			{
				seatInfo=seatInfo+" No31.";
				db.updateSeat31(travel);
			}
			if(check.isCheck32())
			{
				seatInfo=seatInfo+" No32.";
				db.updateSeat32(travel);
			}
			if(check.isCheck33())
			{
				seatInfo=seatInfo+" No33.";
				db.updateSeat33(travel);
			}
			if(check.isCheck34())
			{
				seatInfo=seatInfo+" No34.";
				db.updateSeat34(travel);
			}
			if(check.isCheck35())
			{
				seatInfo=seatInfo+" No35.";
				db.updateSeat35(travel);
			}
			if(check.isCheck36())
			{
				seatInfo=seatInfo+" No36.";
				db.updateSeat36(travel);
			}
			if(check.isCheck37())
			{
				seatInfo=seatInfo+" No37.";
				db.updateSeat37(travel);
			}
			if(check.isCheck38())
			{
				seatInfo=seatInfo+" No38.";
				db.updateSeat38(travel);
			}
			if(check.isCheck39())
			{
				seatInfo=seatInfo+" No39.";
				db.updateSeat39(travel);
			}
			if(check.isCheck40())
			{
				seatInfo=seatInfo+" No40.";
				db.updateSeat40(travel);
			}
			if(check.isCheck41())
			{
				seatInfo=seatInfo+" No41.";
				db.updateSeat41(travel);
			}
			if(check.isCheck42())
			{
				seatInfo=seatInfo+" No42.";
				db.updateSeat42(travel);
			}
			if(check.isCheck43())
			{
				seatInfo=seatInfo+" No43.";
				db.updateSeat43(travel);
			}
			if(check.isCheck44())
			{
				seatInfo=seatInfo+" No44.";
				db.updateSeat44(travel);
			}
			session.setAttribute("gseatInfo", seatInfo);
			return "success";
			}
		
	}

}
