package adminAction;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import service.DBOperation;
import entity.Check;
import entity.Travel;

public class UpdateSoldOutToAvailableAction {
	ArrayList<Travel> soldouttoalist;
	Travel travel=new Travel();
	Check check;
	String seatInfo;


	public ArrayList<Travel> getSoldouttoalist() {
		return soldouttoalist;
	}

	public void setSoldouttoalist(ArrayList<Travel> soldouttoalist) {
		this.soldouttoalist = soldouttoalist;
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
		soldouttoalist=new ArrayList<Travel>();
		DBOperation db=new DBOperation();
		soldouttoalist=db.displayData(travel);
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		String seatInfo="";
		if(check.isCheck1())
		{
			seatInfo=seatInfo+" No1.";
			db.aupdateSeat1(travel);
		}
		if(check.isCheck2())
		{
			seatInfo=seatInfo+" No2.";
			db.aupdateSeat2(travel);
		}

		if(check.isCheck3())
		{
			seatInfo=seatInfo+" No3.";
			db.aupdateSeat3(travel);
		}
		if(check.isCheck4())
		{
			seatInfo=seatInfo+" No4.";
			db.aupdateSeat4(travel);
		}
		if(check.isCheck5())
		{
			seatInfo=seatInfo+" No5.";
			db.aupdateSeat5(travel);
		}
		if(check.isCheck6())
		{
			seatInfo=seatInfo+" No6.";
			db.aupdateSeat6(travel);
		}
		if(check.isCheck7())
		{
			seatInfo=seatInfo+" No7.";
			db.aupdateSeat7(travel);
		}
		if(check.isCheck8())
		{
			seatInfo=seatInfo+" No8.";
			db.aupdateSeat8(travel);
		}
		if(check.isCheck9())
		{
			seatInfo=seatInfo+" No9.";
			db.aupdateSeat9(travel);
		}
		if(check.isCheck10())
		{
			seatInfo=seatInfo+" No10.";
			db.aupdateSeat10(travel);
		}
		if(check.isCheck11())
		{
			seatInfo=seatInfo+" No11.";
			db.aupdateSeat11(travel);
		}
		if(check.isCheck12())
		{
			seatInfo=seatInfo+" No12.";
			db.aupdateSeat12(travel);
		}
		if(check.isCheck13())
		{
			seatInfo=seatInfo+" No13.";
			db.aupdateSeat13(travel);
		}
		if(check.isCheck14())
		{
			seatInfo=seatInfo+" No14.";
			db.aupdateSeat14(travel);
		}
		if(check.isCheck15())
		{
			seatInfo=seatInfo+" No15.";
			db.aupdateSeat15(travel);
		}
		if(check.isCheck16())
		{
			seatInfo=seatInfo+" No16.";
			db.aupdateSeat16(travel);
		}
		if(check.isCheck17())
		{
			seatInfo=seatInfo+" No17.";
			db.aupdateSeat17(travel);
		}
		if(check.isCheck18())
		{
			seatInfo=seatInfo+" No18.";
			db.aupdateSeat18(travel);
		}
		if(check.isCheck19())
		{
			seatInfo=seatInfo+" No19.";
			db.aupdateSeat19(travel);
		}
		if(check.isCheck20())
		{
			seatInfo=seatInfo+" No20.";
			db.aupdateSeat20(travel);
		}
		if(check.isCheck21())
		{
			seatInfo=seatInfo+" No21.";
			db.aupdateSeat21(travel);
		}
		if(check.isCheck22())
		{
			seatInfo=seatInfo+" No22.";
			db.aupdateSeat22(travel);
		}
		if(check.isCheck23())
		{
			seatInfo=seatInfo+" No23.";
			db.aupdateSeat23(travel);
		}
		if(check.isCheck24())
		{
			seatInfo=seatInfo+" No24.";
			db.aupdateSeat24(travel);
		}
		if(check.isCheck24())
		{
			seatInfo=seatInfo+" No24.";
			db.aupdateSeat24(travel);
		}
		if(check.isCheck25())
		{
			seatInfo=seatInfo+" No25.";
			db.aupdateSeat25(travel);
		}
		if(check.isCheck26())
		{
			seatInfo=seatInfo+" No26.";
			db.aupdateSeat26(travel);
		}
		if(check.isCheck27())
		{
			seatInfo=seatInfo+" No27.";
			db.aupdateSeat27(travel);
		}
		if(check.isCheck28())
		{
			seatInfo=seatInfo+" No28.";
			db.aupdateSeat28(travel);
		}
		if(check.isCheck29())
		{
			seatInfo=seatInfo+" No29.";
			db.aupdateSeat29(travel);
		}
		if(check.isCheck30())
		{
			seatInfo=seatInfo+" No30.";
			db.aupdateSeat30(travel);
		}
		if(check.isCheck31())
		{
			seatInfo=seatInfo+" No31.";
			db.aupdateSeat31(travel);
		}
		if(check.isCheck32())
		{
			seatInfo=seatInfo+" No32.";
			db.aupdateSeat32(travel);
		}
		if(check.isCheck33())
		{
			seatInfo=seatInfo+" No33.";
			db.aupdateSeat33(travel);
		}
		if(check.isCheck34())
		{
			seatInfo=seatInfo+" No34.";
			db.aupdateSeat34(travel);
		}
		if(check.isCheck35())
		{
			seatInfo=seatInfo+" No35.";
			db.aupdateSeat35(travel);
		}
		if(check.isCheck36())
		{
			seatInfo=seatInfo+" No36.";
			db.aupdateSeat36(travel);
		}
		if(check.isCheck37())
		{
			seatInfo=seatInfo+" No37.";
			db.aupdateSeat37(travel);
		}
		if(check.isCheck38())
		{
			seatInfo=seatInfo+" No38.";
			db.aupdateSeat38(travel);
		}
		if(check.isCheck39())
		{
			seatInfo=seatInfo+" No39.";
			db.aupdateSeat39(travel);
		}
		if(check.isCheck40())
		{
			seatInfo=seatInfo+" No40.";
			db.aupdateSeat40(travel);
		}
		if(check.isCheck41())
		{
			seatInfo=seatInfo+" No41.";
			db.aupdateSeat41(travel);
		}
		if(check.isCheck42())
		{
			seatInfo=seatInfo+" No42.";
			db.aupdateSeat42(travel);
		}
		if(check.isCheck43())
		{
			seatInfo=seatInfo+" No43.";
			db.aupdateSeat43(travel);
		}
		if(check.isCheck44())
		{
			seatInfo=seatInfo+" No44.";
			db.aupdateSeat44(travel);
		}
		session.setAttribute("gseatInfo", seatInfo);
		return "success";
	}

}
