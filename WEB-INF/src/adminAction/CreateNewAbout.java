package adminAction;

import java.sql.SQLException;

import service.DBOperation;
import entity.About;

public class CreateNewAbout {
	About about=new About();

	
	public About getAbout() {
		return about;
	}


	public void setAbout(About about) {
		this.about = about;
	}


	public String execute() throws SQLException
	{
		DBOperation db=new DBOperation();
		db.insertAbout(about);
		return "success";
		
	}

}
