package adminAction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.About;




public class UpdateAboutAction {
	About about=new About();
	Connection conn;

	public About getAbout() {
		return about;
	}

	public void setAbout(About about) {
		this.about = about;
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
		String sqlupade="update About set phoneInfo=? where city=? and place=?";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.setString(1, about.getPhoneInfo());
		pstupdate.setString(2, about.getCity());
		pstupdate.setString(3, about.getPlace());
		pstupdate.executeUpdate();
		return "success";
	}
}
