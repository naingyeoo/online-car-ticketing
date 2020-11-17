package adminAction;

import java.sql.SQLException;

import service.DBOperation;
import entity.Service;

public class CreateNewServiceDataAction {
	Service service=new Service();

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	public String execute() throws SQLException
	{
		DBOperation db=new DBOperation();
		db.insertServiceData(service);
		return "success";
	}

}
