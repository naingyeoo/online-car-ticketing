package adminAction;

import java.sql.SQLException;

import service.DBOperation;
import entity.Travel;

public class CreateNewBusLineAction {
	Travel travel=new Travel();

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}
	
	public String execute() throws SQLException
	{
		DBOperation db=new DBOperation();
		db.insertTravel(travel);
		return "success";
		
	}

}
