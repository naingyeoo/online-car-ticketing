package adminAction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import entity.Travel;


public class UpdateBusLineAction {
	Travel travel=new Travel();
	Connection conn;

	
	public Travel getTravel() {
		return travel;
	}


	public void setTravel(Travel travel) {
		this.travel = travel;
	}


	public String execute() throws SQLException
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sqlupade="update Travel set price=? where busname=? and deparaturedate=? and leavingfrom=? and goingto=? and deparaturetime=?";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.setString(1, travel.getPrice());
		pstupdate.setString(2, travel.getBusname());
		pstupdate.setString(3, travel.getDeparaturedate());
		pstupdate.setString(4, travel.getLeavingfrom());
		pstupdate.setString(5, travel.getGoingto());
		pstupdate.setString(6, travel.getDeparaturetime());
		pstupdate.executeUpdate();
		return "success";
	}
}
