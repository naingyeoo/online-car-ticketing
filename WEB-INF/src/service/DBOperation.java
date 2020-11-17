package service;

import java.sql.Connection;



import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entity.About;
import entity.Check;
import entity.Service;
import entity.Travel;
import entity.User;

public class DBOperation {
	Connection conn;
	public DBOperation()
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
	}
	//travel.jsp Select Booking time and date
	public ArrayList<Travel> displayBookingData(Travel travel) throws SQLException
	{
		ArrayList<Travel> tlist=new ArrayList<Travel>();
		String gdate=travel.getDeparaturedate();
		String gfrom=travel.getLeavingfrom();
		String ggoingto=travel.getGoingto();
		String sqdisplay="select * from Travel where deparaturedate='"+gdate+"' and leavingfrom='"+gfrom+"' and goingto='"+ggoingto+"'";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sqdisplay);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			tlist.add(t);
		}
		return tlist;	
	}
	public Boolean checkDisplayBookingData(Travel travel) throws SQLException
	{
		Boolean flag=false;
		String gdate=travel.getDeparaturedate();
		String gfrom=travel.getLeavingfrom();
		String ggoingto=travel.getGoingto();
		String sqdisplay="select * from Travel where deparaturedate='"+gdate+"' and leavingfrom='"+gfrom+"' and goingto='"+ggoingto+"'";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sqdisplay);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			flag=true;
		}
		return flag;
		
	}
	//travel.jsp get price
	public String displayPrice(Travel travel) throws SQLException
	{
		String gdate=travel.getDeparaturedate();
		String gfrom=travel.getLeavingfrom();
		String ggoingto=travel.getGoingto();
		String resultprice="";
		String sqdisplay="select * from Travel where deparaturedate='"+gdate+"' and leavingfrom='"+gfrom+"' and goingto='"+ggoingto+"'";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sqdisplay);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			resultprice=t.getPrice();
		}
		return resultprice;
	}
	//get deparatuerdate
			public String displaybusname(Travel travel) throws SQLException
			{
				String gdate=travel.getDeparaturedate();
				String gfrom=travel.getLeavingfrom();
				String ggoingto=travel.getGoingto();
				String gdeparaturetime=travel.getDeparaturetime();
				String busname="";
				String sqdisplay="select * from Travel where deparaturedate='"+gdate+"' and leavingfrom='"+gfrom+"' and goingto='"+ggoingto+"' and deparaturetime='"+gdeparaturetime+"'";
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery(sqdisplay);
				while(rs.next())
				{
					Travel t=new Travel();
					t.setSid(rs.getInt(1));
					t.setBusname(rs.getString(2));
					t.setDeparaturedate(rs.getString(3));
					t.setLeavingfrom(rs.getString(4));
					t.setGoingto(rs.getString(5));
					t.setDeparaturetime(rs.getString(6));
					t.setPrice(rs.getString(7));
					t.setS1(rs.getString(8));
					t.setS2(rs.getString(9));
					t.setS3(rs.getString(10));
					t.setS4(rs.getString(11));
					t.setS5(rs.getString(12));
					t.setS6(rs.getString(13));
					t.setS7(rs.getString(14));
					t.setS8(rs.getString(15));
					t.setS9(rs.getString(16));
					t.setS10(rs.getString(17));
					t.setS11(rs.getString(18));
					t.setS12(rs.getString(19));
					t.setS13(rs.getString(20));
					t.setS14(rs.getString(21));
					t.setS15(rs.getString(22));
					t.setS16(rs.getString(23));
					t.setS17(rs.getString(24));
					t.setS18(rs.getString(25));
					t.setS19(rs.getString(26));
					t.setS20(rs.getString(27));
					t.setS21(rs.getString(28));
					t.setS22(rs.getString(29));
					t.setS23(rs.getString(30));
					t.setS24(rs.getString(31));
					t.setS25(rs.getString(32));
					t.setS26(rs.getString(33));
					t.setS27(rs.getString(34));
					t.setS28(rs.getString(35));
					t.setS29(rs.getString(36));
					t.setS30(rs.getString(37));
					t.setS31(rs.getString(38));
					t.setS32(rs.getString(39));
					t.setS33(rs.getString(40));
					t.setS34(rs.getString(41));
					t.setS35(rs.getString(42));
					t.setS36(rs.getString(43));
					t.setS37(rs.getString(44));
					t.setS38(rs.getString(45));
					t.setS39(rs.getString(46));
					t.setS40(rs.getString(47));
					t.setS41(rs.getString(48));
					t.setS42(rs.getString(49));
					t.setS43(rs.getString(50));
					t.setS44(rs.getString(51));
					t.setNumOfSeat(rs.getInt(52));
					busname=t.getBusname();
				}
				return busname;
			}
	//get deparatuerdate
		public String displaydeparatuerdate(Travel travel) throws SQLException
		{
			String gdate=travel.getDeparaturedate();
			String gfrom=travel.getLeavingfrom();
			String ggoingto=travel.getGoingto();
			String gdeparaturetime=travel.getDeparaturetime();
			String deparatuerdate="";
			String sqdisplay="select * from Travel where deparaturedate='"+gdate+"' and leavingfrom='"+gfrom+"' and goingto='"+ggoingto+"' and deparaturetime='"+gdeparaturetime+"'";
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sqdisplay);
			while(rs.next())
			{
				Travel t=new Travel();
				t.setSid(rs.getInt(1));
				t.setBusname(rs.getString(2));
				t.setDeparaturedate(rs.getString(3));
				t.setLeavingfrom(rs.getString(4));
				t.setGoingto(rs.getString(5));
				t.setDeparaturetime(rs.getString(6));
				t.setPrice(rs.getString(7));
				t.setS1(rs.getString(8));
				t.setS2(rs.getString(9));
				t.setS3(rs.getString(10));
				t.setS4(rs.getString(11));
				t.setS5(rs.getString(12));
				t.setS6(rs.getString(13));
				t.setS7(rs.getString(14));
				t.setS8(rs.getString(15));
				t.setS9(rs.getString(16));
				t.setS10(rs.getString(17));
				t.setS11(rs.getString(18));
				t.setS12(rs.getString(19));
				t.setS13(rs.getString(20));
				t.setS14(rs.getString(21));
				t.setS15(rs.getString(22));
				t.setS16(rs.getString(23));
				t.setS17(rs.getString(24));
				t.setS18(rs.getString(25));
				t.setS19(rs.getString(26));
				t.setS20(rs.getString(27));
				t.setS21(rs.getString(28));
				t.setS22(rs.getString(29));
				t.setS23(rs.getString(30));
				t.setS24(rs.getString(31));
				t.setS25(rs.getString(32));
				t.setS26(rs.getString(33));
				t.setS27(rs.getString(34));
				t.setS28(rs.getString(35));
				t.setS29(rs.getString(36));
				t.setS30(rs.getString(37));
				t.setS31(rs.getString(38));
				t.setS32(rs.getString(39));
				t.setS33(rs.getString(40));
				t.setS34(rs.getString(41));
				t.setS35(rs.getString(42));
				t.setS36(rs.getString(43));
				t.setS37(rs.getString(44));
				t.setS38(rs.getString(45));
				t.setS39(rs.getString(46));
				t.setS40(rs.getString(47));
				t.setS41(rs.getString(48));
				t.setS42(rs.getString(49));
				t.setS43(rs.getString(50));
				t.setS44(rs.getString(51));
				t.setNumOfSeat(rs.getInt(52));
				deparatuerdate=t.getDeparaturedate();
			}
			return deparatuerdate;
		}
	
		//get leavingfrom
				public String displayleavingfrom(Travel travel) throws SQLException
				{
					String gdate=travel.getDeparaturedate();
					String gfrom=travel.getLeavingfrom();
					String ggoingto=travel.getGoingto();
					String gdeparaturetime=travel.getDeparaturetime();
					String leavingfrom="";
					String sqdisplay="select * from Travel where deparaturedate='"+gdate+"' and leavingfrom='"+gfrom+"' and goingto='"+ggoingto+"' and deparaturetime='"+gdeparaturetime+"'";
					Statement st=conn.createStatement();
					ResultSet rs=st.executeQuery(sqdisplay);
					while(rs.next())
					{
						Travel t=new Travel();
						t.setSid(rs.getInt(1));
						t.setBusname(rs.getString(2));
						t.setDeparaturedate(rs.getString(3));
						t.setLeavingfrom(rs.getString(4));
						t.setGoingto(rs.getString(5));
						t.setDeparaturetime(rs.getString(6));
						t.setPrice(rs.getString(7));
						t.setS1(rs.getString(8));
						t.setS2(rs.getString(9));
						t.setS3(rs.getString(10));
						t.setS4(rs.getString(11));
						t.setS5(rs.getString(12));
						t.setS6(rs.getString(13));
						t.setS7(rs.getString(14));
						t.setS8(rs.getString(15));
						t.setS9(rs.getString(16));
						t.setS10(rs.getString(17));
						t.setS11(rs.getString(18));
						t.setS12(rs.getString(19));
						t.setS13(rs.getString(20));
						t.setS14(rs.getString(21));
						t.setS15(rs.getString(22));
						t.setS16(rs.getString(23));
						t.setS17(rs.getString(24));
						t.setS18(rs.getString(25));
						t.setS19(rs.getString(26));
						t.setS20(rs.getString(27));
						t.setS21(rs.getString(28));
						t.setS22(rs.getString(29));
						t.setS23(rs.getString(30));
						t.setS24(rs.getString(31));
						t.setS25(rs.getString(32));
						t.setS26(rs.getString(33));
						t.setS27(rs.getString(34));
						t.setS28(rs.getString(35));
						t.setS29(rs.getString(36));
						t.setS30(rs.getString(37));
						t.setS31(rs.getString(38));
						t.setS32(rs.getString(39));
						t.setS33(rs.getString(40));
						t.setS34(rs.getString(41));
						t.setS35(rs.getString(42));
						t.setS36(rs.getString(43));
						t.setS37(rs.getString(44));
						t.setS38(rs.getString(45));
						t.setS39(rs.getString(46));
						t.setS40(rs.getString(47));
						t.setS41(rs.getString(48));
						t.setS42(rs.getString(49));
						t.setS43(rs.getString(50));
						t.setS44(rs.getString(51));
						t.setNumOfSeat(rs.getInt(52));
						leavingfrom=t.getLeavingfrom();
					}
					return leavingfrom;
				}
				
				//get goingto
				public String displaygoingto(Travel travel) throws SQLException
				{
					String gdate=travel.getDeparaturedate();
					String gfrom=travel.getLeavingfrom();
					String ggoingto=travel.getGoingto();
					String gdeparaturetime=travel.getDeparaturetime();
					String goingto="";
					String sqdisplay="select * from Travel where deparaturedate='"+gdate+"' and leavingfrom='"+gfrom+"' and goingto='"+ggoingto+"' and deparaturetime='"+gdeparaturetime+"'";
					Statement st=conn.createStatement();
					ResultSet rs=st.executeQuery(sqdisplay);
					while(rs.next())
					{
						Travel t=new Travel();
						t.setSid(rs.getInt(1));
						t.setBusname(rs.getString(2));
						t.setDeparaturedate(rs.getString(3));
						t.setLeavingfrom(rs.getString(4));
						t.setGoingto(rs.getString(5));
						t.setDeparaturetime(rs.getString(6));
						t.setPrice(rs.getString(7));
						t.setS1(rs.getString(8));
						t.setS2(rs.getString(9));
						t.setS3(rs.getString(10));
						t.setS4(rs.getString(11));
						t.setS5(rs.getString(12));
						t.setS6(rs.getString(13));
						t.setS7(rs.getString(14));
						t.setS8(rs.getString(15));
						t.setS9(rs.getString(16));
						t.setS10(rs.getString(17));
						t.setS11(rs.getString(18));
						t.setS12(rs.getString(19));
						t.setS13(rs.getString(20));
						t.setS14(rs.getString(21));
						t.setS15(rs.getString(22));
						t.setS16(rs.getString(23));
						t.setS17(rs.getString(24));
						t.setS18(rs.getString(25));
						t.setS19(rs.getString(26));
						t.setS20(rs.getString(27));
						t.setS21(rs.getString(28));
						t.setS22(rs.getString(29));
						t.setS23(rs.getString(30));
						t.setS24(rs.getString(31));
						t.setS25(rs.getString(32));
						t.setS26(rs.getString(33));
						t.setS27(rs.getString(34));
						t.setS28(rs.getString(35));
						t.setS29(rs.getString(36));
						t.setS30(rs.getString(37));
						t.setS31(rs.getString(38));
						t.setS32(rs.getString(39));
						t.setS33(rs.getString(40));
						t.setS34(rs.getString(41));
						t.setS35(rs.getString(42));
						t.setS36(rs.getString(43));
						t.setS37(rs.getString(44));
						t.setS38(rs.getString(45));
						t.setS39(rs.getString(46));
						t.setS40(rs.getString(47));
						t.setS41(rs.getString(48));
						t.setS42(rs.getString(49));
						t.setS43(rs.getString(50));
						t.setS44(rs.getString(51));
						t.setNumOfSeat(rs.getInt(52));
						goingto=t.getGoingto();
					}
					return goingto;
				}
				//get deparatuertime
				public String displaydeparatuertime(Travel travel) throws SQLException
				{
					String gdate=travel.getDeparaturedate();
					String gfrom=travel.getLeavingfrom();
					String ggoingto=travel.getGoingto();
					String gdeparaturetime=travel.getDeparaturetime();
					String deparatuertime="";
					String sqdisplay="select * from Travel where deparaturedate='"+gdate+"' and leavingfrom='"+gfrom+"' and goingto='"+ggoingto+"' and deparaturetime='"+gdeparaturetime+"'";
					Statement st=conn.createStatement();
					ResultSet rs=st.executeQuery(sqdisplay);
					while(rs.next())
					{
						Travel t=new Travel();
						t.setSid(rs.getInt(1));
						t.setBusname(rs.getString(2));
						t.setDeparaturedate(rs.getString(3));
						t.setLeavingfrom(rs.getString(4));
						t.setGoingto(rs.getString(5));
						t.setDeparaturetime(rs.getString(6));
						t.setPrice(rs.getString(7));
						t.setS1(rs.getString(8));
						t.setS2(rs.getString(9));
						t.setS3(rs.getString(10));
						t.setS4(rs.getString(11));
						t.setS5(rs.getString(12));
						t.setS6(rs.getString(13));
						t.setS7(rs.getString(14));
						t.setS8(rs.getString(15));
						t.setS9(rs.getString(16));
						t.setS10(rs.getString(17));
						t.setS11(rs.getString(18));
						t.setS12(rs.getString(19));
						t.setS13(rs.getString(20));
						t.setS14(rs.getString(21));
						t.setS15(rs.getString(22));
						t.setS16(rs.getString(23));
						t.setS17(rs.getString(24));
						t.setS18(rs.getString(25));
						t.setS19(rs.getString(26));
						t.setS20(rs.getString(27));
						t.setS21(rs.getString(28));
						t.setS22(rs.getString(29));
						t.setS23(rs.getString(30));
						t.setS24(rs.getString(31));
						t.setS25(rs.getString(32));
						t.setS26(rs.getString(33));
						t.setS27(rs.getString(34));
						t.setS28(rs.getString(35));
						t.setS29(rs.getString(36));
						t.setS30(rs.getString(37));
						t.setS31(rs.getString(38));
						t.setS32(rs.getString(39));
						t.setS33(rs.getString(40));
						t.setS34(rs.getString(41));
						t.setS35(rs.getString(42));
						t.setS36(rs.getString(43));
						t.setS37(rs.getString(44));
						t.setS38(rs.getString(45));
						t.setS39(rs.getString(46));
						t.setS40(rs.getString(47));
						t.setS41(rs.getString(48));
						t.setS42(rs.getString(49));
						t.setS43(rs.getString(50));
						t.setS44(rs.getString(51));
						t.setNumOfSeat(rs.getInt(52));
						deparatuertime=t.getDeparaturetime();
					}
					return deparatuertime;
				}
	//seat.jsp
	public String showTableSeat1(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat1="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat1=t.getS1();
		}
		return seat1;
	}
	public String showTableSeat2(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat2="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat2=t.getS2();
		}
		return seat2;
	}
	public String showTableSeat3(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat3="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat3=t.getS3();
		}
		return seat3;
	}
	public String showTableSeat4(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat4="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat4=t.getS4();
		}
		return seat4;
	}
	public String showTableSeat5(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat5="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat5=t.getS5();
		}
		return seat5;
	}
	public String showTableSeat6(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat6="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat6=t.getS6();
		}
		return seat6;
	}
	public String showTableSeat7(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat7="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat7=t.getS7();
		}
		return seat7;
	}
	public String showTableSeat8(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat8="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat8=t.getS8();
		}
		return seat8;
	}
	public String showTableSeat9(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat9="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat9=t.getS9();
		}
		return seat9;
	}
	public String showTableSeat10(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat10="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat10=t.getS10();
		}
		return seat10;
	}
	public String showTableSeat11(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat11="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat11=t.getS11();
		}
		return seat11;
	}
	public String showTableSeat12(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat12="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat12=t.getS12();
		}
		return seat12;
	}
	public String showTableSeat13(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat13="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat13=t.getS13();
		}
		return seat13;
	}
	public String showTableSeat14(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat14="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat14=t.getS14();
		}
		return seat14;
	}
	public String showTableSeat15(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat15="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat15=t.getS15();
		}
		return seat15;
	}
	public String showTableSeat16(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat16="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat16=t.getS16();
		}
		return seat16;
	}
	public String showTableSeat17(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat17="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat17=t.getS17();
		}
		return seat17;
	}
	public String showTableSeat18(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat18="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat18=t.getS18();
		}
		return seat18;
	}
	public String showTableSeat19(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat19="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat19=t.getS19();
		}
		return seat19;
	}
	public String showTableSeat20(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat20="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat20=t.getS20();
		}
		return seat20;
	}
	public String showTableSeat21(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat21="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat21=t.getS21();
		}
		return seat21;
	}
	public String showTableSeat22(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat22="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat22=t.getS22();
		}
		return seat22;
	}
	public String showTableSeat23(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat23="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat23=t.getS23();
		}
		return seat23;
	}
	public String showTableSeat24(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat24="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat24=t.getS24();
		}
		return seat24;
	}
	public String showTableSeat25(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat25="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat25=t.getS25();
		}
		return seat25;
	}
	public String showTableSeat26(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat26="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat26=t.getS26();
		}
		return seat26;
	}
	public String showTableSeat27(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat27="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat27=t.getS27();
		}
		return seat27;
	}
	public String showTableSeat28(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat28="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat28=t.getS28();
		}
		return seat28;
	}
	public String showTableSeat29(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat29="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat29=t.getS29();
		}
		return seat29;
	}
	public String showTableSeat30(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat30="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat30=t.getS30();
		}
		return seat30;
	}
	public String showTableSeat31(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat31="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat31=t.getS31();
		}
		return seat31;
	}
	public String showTableSeat32(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat32="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat32=t.getS32();
		}
		return seat32;
	}
	public String showTableSeat33(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat33="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat33=t.getS33();
		}
		return seat33;
	}
	public String showTableSeat34(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat34="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat34=t.getS34();
		}
		return seat34;
	}
	public String showTableSeat35(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat35="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat35=t.getS35();
		}
		return seat35;
	}
	public String showTableSeat36(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat36="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat36=t.getS36();
		}
		return seat36;
	}
	public String showTableSeat37(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat37="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat37=t.getS37();
		}
		return seat37;
	}
	public String showTableSeat38(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat38="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat38=t.getS38();
		}
		return seat38;
	}
	public String showTableSeat39(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat39="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat39=t.getS39();
		}
		return seat39;
	}
	public String showTableSeat40(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat40="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat40=t.getS40();
		}
		return seat40;
	}
	public String showTableSeat41(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat41="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat41=t.getS41();
		}
		return seat41;
	}
	public String showTableSeat42(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat42="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat42=t.getS42();
		}
		return seat42;
	}
	public String showTableSeat43(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat43="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat43=t.getS43();
		}
		return seat43;
	}
	public String showTableSeat44(Travel travel) throws SQLException
	{
		Statement st= conn.createStatement();
		String seat44="";
		String str="";
		String rbusname=travel.getBusname();
		String rdate=travel.getDeparaturedate();
		String rleavingfrom=travel.getLeavingfrom();
		String rgoingto=travel.getGoingto();
		String rdeparaturetime=travel.getDeparaturetime();
		str ="select * from Travel where busname='"+rbusname+"' and deparaturedate='"+rdate+"' and leavingfrom='"+rleavingfrom+"' and goingto='"+rgoingto+"' and deparaturetime='"+rdeparaturetime+"'";
		ResultSet rs = st.executeQuery(str);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seat44=t.getS44();
		}
		return seat44;
	}
	public void updateSeat1(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s1='"+1+"' where s1='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat2(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s2='"+1+"' where s2='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat3(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s3='"+1+"' where s3='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat4(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s4='"+1+"' where s4='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat5(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s5='"+1+"' where s5='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat6(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s6='"+1+"' where s6='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat7(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s7='"+1+"' where s7='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat8(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s8='"+1+"' where s8='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	
	public void updateSeat9(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s9='"+1+"' where s9='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat10(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s10='"+1+"' where s10='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat11(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s11='"+1+"' where s11='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat12(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s12='"+1+"' where s12='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat13(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s13='"+1+"' where s13='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat14(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s14='"+1+"' where s14='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat15(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s15='"+1+"' where s15='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat16(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s16='"+1+"' where s16='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat17(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s17='"+1+"' where s17='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat18(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s18='"+1+"' where s18='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat19(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s19='"+1+"' where s19='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat20(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s20='"+1+"' where s20='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat21(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s21='"+1+"' where s21='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat22(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s22='"+1+"' where s22='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat23(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s23='"+1+"' where s23='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat24(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s24='"+1+"' where s24='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat25(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s25='"+1+"' where s25='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat26(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s26='"+1+"' where s26='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat27(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s27='"+1+"' where s27='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat28(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s28='"+1+"' where s28='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat29(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s29='"+1+"' where s29='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat30(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s30='"+1+"' where s30='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat31(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s31='"+1+"' where s31='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat32(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s32='"+1+"' where s32='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat33(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s33='"+1+"' where s33='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat34(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s34='"+1+"' where s34='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat35(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s35='"+1+"' where s35='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat36(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s36='"+1+"' where s36='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat37(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s37='"+1+"' where s37='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat38(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s38='"+1+"' where s38='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat39(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s39='"+1+"' where s39='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat40(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s40='"+1+"' where s40='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat41(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s41='"+1+"' where s41='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat42(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s42='"+1+"' where s42='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat43(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s43='"+1+"' where s43='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public void updateSeat44(Travel travel) throws SQLException
	{
		String ubusname=travel.getBusname();
		String udeparaturedate=travel.getDeparaturedate();
		String uleavingfrom=travel.getLeavingfrom();
		String ugoingto=travel.getGoingto();
		String udeparaturetime=travel.getDeparaturetime();
		String sqlupade="";
		sqlupade="update Travel set s44='"+1+"' where s44='"+0+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
		PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
		pstupdate.executeUpdate();
	}
	public ArrayList<Travel> displayData(Travel travel) throws SQLException
	{
		ArrayList<Travel> tablelist=new ArrayList<Travel>();
		String gbusname=travel.getBusname();
		String gdeparaturedate=travel.getDeparaturedate();
		String gfrom=travel.getLeavingfrom();
		String ggoingto=travel.getGoingto();
		String gdeparaturetime=travel.getDeparaturetime();
		String sqdisplay="";
		sqdisplay="select * from Travel where busname='"+gbusname+"' and deparaturedate='"+gdeparaturedate+"' and leavingfrom='"+gfrom+"' and goingto='"+ggoingto+"' and deparaturetime='"+gdeparaturetime+"'";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sqdisplay);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			tablelist.add(t);
		}
		return tablelist;	
	}
	
	public ArrayList<Travel> displaySeatData(Travel travel) throws SQLException
	{
		ArrayList<Travel> seatlist=new ArrayList<Travel>();
		String gbusname=travel.getBusname();
		String gdeparaturedate=travel.getDeparaturedate();
		String gfrom=travel.getLeavingfrom();
		String ggoingto=travel.getGoingto();
		String gdeparaturetime=travel.getDeparaturetime();
		String sqdisplay="";
		sqdisplay="select * from Travel where busname='"+gbusname+"' and deparaturedate='"+gdeparaturedate+"' and leavingfrom='"+gfrom+"' and goingto='"+ggoingto+"' and deparaturetime='"+gdeparaturetime+"'";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sqdisplay);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			seatlist.add(t);
		}
		return seatlist;	
	}
	
	//Insert user information
	public void insertUserInfo(User user) throws SQLException
	{
			String sq="insert into User values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps=conn.prepareStatement(sq);
			ps.setInt(1, user.getUid());
			ps.setString(2, user.getName());
			ps.setString(3, user.getGender());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getPhone());
			ps.setString(6, user.getBusname());
			ps.setString(7, user.getDeparaturedate());
			ps.setString(8, user.getLeavingfrom());
			ps.setString(9, user.getGoingto());
			ps.setString(10, user.getDeparaturetime());
			ps.setString(11, user.getSeatno());
			ps.setString(12, user.getPrice());
			ps.executeUpdate();
	}
	
	//admin login check
	public boolean loginCheck(String name, String password) throws SQLException
	{
		Boolean flag=false;
		String sql="select * from Login where name='"+name+"' and password='"+password+"'";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		flag=rs.next();
		return flag;
	}
	
	//admin display bus line
	public ArrayList<Travel> displayBusLine() throws SQLException
	{
		ArrayList<Travel> blist=new ArrayList<Travel>();
		String sqdisplay="select * from Travel";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sqdisplay);
		while(rs.next())
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			blist.add(t);
		}
		return blist;	
	}
	
	//delete bus line
	public ArrayList<Travel> deleteBusLine(int sid) throws SQLException
	{
		String sqdelete="delete from Travel where sid="+sid;
		PreparedStatement pstdelete=conn.prepareStatement(sqdelete);
		pstdelete.executeUpdate();
		return displayBusLine();
	}
	
	//carry update bus line data
	public ArrayList<Travel> carryUpdateProfile(int sid) throws SQLException
	{
		ArrayList<Travel> buslist=new ArrayList<Travel>();
		String sqdisplay="select * from Travel where sid="+sid;
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sqdisplay);
		while(rs.next()) 
		{
			Travel t=new Travel();
			t.setSid(rs.getInt(1));
			t.setBusname(rs.getString(2));
			t.setDeparaturedate(rs.getString(3));
			t.setLeavingfrom(rs.getString(4));
			t.setGoingto(rs.getString(5));
			t.setDeparaturetime(rs.getString(6));
			t.setPrice(rs.getString(7));
			t.setS1(rs.getString(8));
			t.setS2(rs.getString(9));
			t.setS3(rs.getString(10));
			t.setS4(rs.getString(11));
			t.setS5(rs.getString(12));
			t.setS6(rs.getString(13));
			t.setS7(rs.getString(14));
			t.setS8(rs.getString(15));
			t.setS9(rs.getString(16));
			t.setS10(rs.getString(17));
			t.setS11(rs.getString(18));
			t.setS12(rs.getString(19));
			t.setS13(rs.getString(20));
			t.setS14(rs.getString(21));
			t.setS15(rs.getString(22));
			t.setS16(rs.getString(23));
			t.setS17(rs.getString(24));
			t.setS18(rs.getString(25));
			t.setS19(rs.getString(26));
			t.setS20(rs.getString(27));
			t.setS21(rs.getString(28));
			t.setS22(rs.getString(29));
			t.setS23(rs.getString(30));
			t.setS24(rs.getString(31));
			t.setS25(rs.getString(32));
			t.setS26(rs.getString(33));
			t.setS27(rs.getString(34));
			t.setS28(rs.getString(35));
			t.setS29(rs.getString(36));
			t.setS30(rs.getString(37));
			t.setS31(rs.getString(38));
			t.setS32(rs.getString(39));
			t.setS33(rs.getString(40));
			t.setS34(rs.getString(41));
			t.setS35(rs.getString(42));
			t.setS36(rs.getString(43));
			t.setS37(rs.getString(44));
			t.setS38(rs.getString(45));
			t.setS39(rs.getString(46));
			t.setS40(rs.getString(47));
			t.setS41(rs.getString(48));
			t.setS42(rs.getString(49));
			t.setS43(rs.getString(50));
			t.setS44(rs.getString(51));
			t.setNumOfSeat(rs.getInt(52));
			buslist.add(t);
		}
		return buslist;
	}
	
	
	//Admin New Bus Line Create
		public void insertTravel(Travel travel ) throws SQLException
		{
				String sq="insert into Travel values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement ps=conn.prepareStatement(sq);
				ps.setInt(1, travel.getSid());
				ps.setString(2,travel.getBusname());
				ps.setString(3, travel.getDeparaturedate());
				ps.setString(4, travel.getLeavingfrom());
				ps.setString(5, travel.getGoingto());
				ps.setString(6, travel.getDeparaturetime());
				ps.setString(7,travel.getPrice()); 
				ps.setString(8,travel.getS1()); 
				ps.setString(9, travel.getS2());
				ps.setString(10,travel.getS3());
				ps.setString(11,travel.getS4());
				ps.setString(12,travel.getS5());
				ps.setString(13,travel.getS6()); 
				ps.setString(14, travel.getS7());
				ps.setString(15,travel.getS8());
				ps.setString(16,travel.getS9());
				ps.setString(17,travel.getS10());
				ps.setString(18,travel.getS11());
				ps.setString(19,travel.getS12());
				ps.setString(20, travel.getS13());
				ps.setString(21, travel.getS14());
				ps.setString(22, travel.getS15());
				ps.setString(23, travel.getS16());
				ps.setString(24, travel.getS17());
				ps.setString(25, travel.getS18());
				ps.setString(26, travel.getS19());
				ps.setString(27, travel.getS20());
				ps.setString(28, travel.getS21());
				ps.setString(29, travel.getS22());
				ps.setString(30, travel.getS23());
				ps.setString(31, travel.getS24());
				ps.setString(32, travel.getS25());
				ps.setString(33, travel.getS26());
				ps.setString(34, travel.getS27());
				ps.setString(35, travel.getS28());
				ps.setString(36, travel.getS29());
				ps.setString(37, travel.getS30());
				ps.setString(38, travel.getS31());
				ps.setString(39, travel.getS32());
				ps.setString(40, travel.getS33());
				ps.setString(41, travel.getS34());
				ps.setString(42, travel.getS35());
				ps.setString(43, travel.getS36());
				ps.setString(44, travel.getS37());
				ps.setString(45, travel.getS38());
				ps.setString(46, travel.getS39());
				ps.setString(47, travel.getS40());
				ps.setString(48, travel.getS41());
				ps.setString(49, travel.getS42());
				ps.setString(50, travel.getS43());
				ps.setString(51, travel.getS44());
				ps.setInt(52, travel.getNumOfSeat());
				ps.executeUpdate();
		}
		
		//admin display booking list
		public ArrayList<User> displayBookingList() throws SQLException
		{
			ArrayList<User> userlist=new ArrayList<User>();
			String sqdisplay="select * from User";
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sqdisplay);
			while(rs.next())
			{
				User u=new User();
				u.setUid(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setGender(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setPhone(rs.getString(5));
				u.setBusname(rs.getString(6));
				u.setDeparaturedate(rs.getString(7));
				u.setLeavingfrom(rs.getString(8));
				u.setGoingto(rs.getString(9));
				u.setDeparaturetime(rs.getString(10));
				u.setSeatno(rs.getString(11));
				u.setPrice(rs.getString(12));
				userlist.add(u);
			}
			return userlist;	
		}
		
		//delete booking list
		public ArrayList<User> deleteBookingList(int uid) throws SQLException
		{
			String sqdelete="delete from User where uid="+uid;
			PreparedStatement pstdelete=conn.prepareStatement(sqdelete);
			pstdelete.executeUpdate();
			return displayBookingList();
		}
		
		//Search By User Name
		public ArrayList<User> SearchByName(User user) throws SQLException
		{
			ArrayList<User> userlist=new ArrayList<User>();
			String gtravellerName=user.getName();
			String sqdisplay="";
			sqdisplay="select * from User where name='"+gtravellerName+"'";
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sqdisplay);
			while(rs.next())
			{
				User u=new User();
				u.setUid(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setGender(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setPhone(rs.getString(5));
				u.setBusname(rs.getString(6));
				u.setDeparaturedate(rs.getString(7));
				u.setLeavingfrom(rs.getString(8));
				u.setGoingto(rs.getString(9));
				u.setDeparaturetime(rs.getString(10));
				u.setSeatno(rs.getString(11));
				u.setPrice(rs.getString(12));
				userlist.add(u);
			}
			return userlist;
		}
		
		//Admin Change Password
		public void adminChangePassword(String adminOldPassword, String adminNewPassword) throws SQLException
		{
			String sqlId = "select * from Login where password='"+adminOldPassword+"'";
			Statement stId=conn.createStatement();
			ResultSet rsId=stId.executeQuery(sqlId);
			String resultId = null;
			while(rsId.next()){
					resultId = rsId.getString("id");
			}
			String sqlName = "select * from Login where password='"+adminOldPassword+"'";
			Statement stName=conn.createStatement();
			ResultSet rsName=stName.executeQuery(sqlName);
			String resultName = null;
			while(rsName.next()){
					resultName = rsName.getString("name");
			}
			String sql = "update Login set password='"+adminNewPassword+"' where id='"+resultId+"' and name='"+resultName+"'";
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		}
		//admin display service data
		public ArrayList<Service> displayServiceData() throws SQLException
		{
			ArrayList<Service> servicelist=new ArrayList<Service>();
			String sqdisplay="select * from Service";
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sqdisplay);
			while(rs.next())
			{
				Service s=new Service();
				s.setServiceid(rs.getInt(1));
				s.setServicedata(rs.getString(2));
				servicelist.add(s);
			}
			return servicelist;	
		}
		
		//delete bus Service
		public ArrayList<Service> deleteServiceData(int serviceid) throws SQLException
		{
			String sqdelete="delete from Service where serviceid="+serviceid;
			PreparedStatement pstdelete=conn.prepareStatement(sqdelete);
			pstdelete.executeUpdate();
			return displayServiceData();
		}
		
		//Admin create new service data
		public void insertServiceData(Service service ) throws SQLException
		{
				String sq="insert into Service values(?, ?)";
				PreparedStatement ps=conn.prepareStatement(sq);
				ps.setInt(1, service.getServiceid());
				ps.setString(2,service.getServicedata());
				ps.executeUpdate();
		}
		//admin display about data
				public ArrayList<About> displayAbout() throws SQLException
				{
					ArrayList<About> aboutlist=new ArrayList<About>();
					String sqdisplay="select * from About";
					Statement st=conn.createStatement();
					ResultSet rs=st.executeQuery(sqdisplay);
					while(rs.next())
					{
						About a=new About();
						a.setAboutid(rs.getInt(1));
						a.setCity(rs.getString(2));
						a.setPlace(rs.getString(3));
						a.setPhoneInfo(rs.getString(4));
						aboutlist.add(a);
					}
					return aboutlist;	
				}
				
				//delete about data
				public ArrayList<About> deleteAbout(int aboutid) throws SQLException
				{
					String sqdelete="delete from About where aboutid="+aboutid;
					PreparedStatement pstdelete=conn.prepareStatement(sqdelete);
					pstdelete.executeUpdate();
					return displayAbout();
				}
				
				//Carry about data to update
				public ArrayList<About> carryAbout(int aboutid) throws SQLException
				{
					ArrayList<About> aboutlist=new ArrayList<About>();
					String sqdisplay="select * from About where aboutid="+aboutid;
					Statement st=conn.createStatement();
					ResultSet rs=st.executeQuery(sqdisplay);
					while(rs.next()) 
					{
						About a=new About();
						a.setAboutid(rs.getInt(1));
						a.setCity(rs.getString(2));
						a.setPlace(rs.getString(3));
						a.setPhoneInfo(rs.getString(4));
						aboutlist.add(a);
					}
					return aboutlist;
				}
				//Admin create new service data
				public void insertAbout(About about) throws SQLException
				{
						String sq="insert into About values(?, ?, ?, ?)";
						PreparedStatement ps=conn.prepareStatement(sq);
						ps.setInt(1, about.getAboutid());
						ps.setString(2,about.getCity());
						ps.setString(3, about.getPlace());
						ps.setString(4, about.getPhoneInfo());
						ps.executeUpdate();
				}
				
				//Admin Update Sold Out Seat to Available Seat
				public void aupdateSeat1(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s1='"+0+"' where s1='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat2(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s2='"+0+"' where s2='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat3(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s3='"+0+"' where s3='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat4(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s4='"+0+"' where s4='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat5(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s5='"+0+"' where s5='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat6(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s6='"+0+"' where s6='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat7(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s7='"+0+"' where s7='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat8(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s8='"+0+"' where s8='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				
				public void aupdateSeat9(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s9='"+0+"' where s9='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat10(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s10='"+0+"' where s10='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat11(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s11='"+0+"' where s11='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat12(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s12='"+0+"' where s12='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat13(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s13='"+0+"' where s13='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat14(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s14='"+0+"' where s14='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat15(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s15='"+0+"' where s15='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat16(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s16='"+0+"' where s16='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat17(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s17='"+0+"' where s17='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat18(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s18='"+0+"' where s18='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat19(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s19='"+0+"' where s19='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat20(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s20='"+0+"' where s20='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat21(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s21='"+0+"' where s21='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat22(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s22='"+0+"' where s22='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat23(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s23='"+0+"' where s23='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat24(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s24='"+0+"' where s24='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat25(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s25='"+0+"' where s25='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat26(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s26='"+0+"' where s26='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat27(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s27='"+0+"' where s27='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat28(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s28='"+0+"' where s28='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat29(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s29='"+0+"' where s29='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat30(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s30='"+0+"' where s30='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat31(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s31='"+0+"' where s31='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat32(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s32='"+0+"' where s32='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat33(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s33='"+0+"' where s33='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat34(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s34='"+0+"' where s34='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat35(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s35='"+0+"' where s35='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat36(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s36='"+0+"' where s36='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat37(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s37='"+0+"' where s37='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat38(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s38='"+0+"' where s38='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat39(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s39='"+0+"' where s39='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat40(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s40='"+0+"' where s40='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat41(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s41='"+0+"' where s41='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat42(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s42='"+0+"' where s42='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat43(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s43='"+0+"' where s43='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public void aupdateSeat44(Travel travel) throws SQLException
				{
					String ubusname=travel.getBusname();
					String udeparaturedate=travel.getDeparaturedate();
					String uleavingfrom=travel.getLeavingfrom();
					String ugoingto=travel.getGoingto();
					String udeparaturetime=travel.getDeparaturetime();
					String sqlupade="";
					sqlupade="update Travel set s44='"+0+"' where s44='"+1+"' and busname='"+ubusname+"' and deparaturedate='"+udeparaturedate+"' and leavingfrom='"+uleavingfrom+"' and goingto='"+ugoingto+"' and deparaturetime='"+udeparaturetime+"'";
					PreparedStatement pstupdate=conn.prepareStatement(sqlupade);
					pstupdate.executeUpdate();
				}
				public Boolean adminCheckDisplayBookingData(Travel travel) throws SQLException
				{
					Boolean flag=false;
					String gdate=travel.getDeparaturedate();
					String gfrom=travel.getLeavingfrom();
					String ggoingto=travel.getGoingto();
					String gtime=travel.getDeparaturetime();
					String sqdisplay="select * from Travel where deparaturedate='"+gdate+"' and leavingfrom='"+gfrom+"' and goingto='"+ggoingto+"' and deparaturetime='"+gtime+"'";
					Statement st=conn.createStatement();
					ResultSet rs=st.executeQuery(sqdisplay);
					while(rs.next())
					{
						Travel t=new Travel();
						t.setSid(rs.getInt(1));
						t.setBusname(rs.getString(2));
						t.setDeparaturedate(rs.getString(3));
						t.setLeavingfrom(rs.getString(4));
						t.setGoingto(rs.getString(5));
						t.setDeparaturetime(rs.getString(6));
						t.setPrice(rs.getString(7));
						t.setS1(rs.getString(8));
						t.setS2(rs.getString(9));
						t.setS3(rs.getString(10));
						t.setS4(rs.getString(11));
						t.setS5(rs.getString(12));
						t.setS6(rs.getString(13));
						t.setS7(rs.getString(14));
						t.setS8(rs.getString(15));
						t.setS9(rs.getString(16));
						t.setS10(rs.getString(17));
						t.setS11(rs.getString(18));
						t.setS12(rs.getString(19));
						t.setS13(rs.getString(20));
						t.setS14(rs.getString(21));
						t.setS15(rs.getString(22));
						t.setS16(rs.getString(23));
						t.setS17(rs.getString(24));
						t.setS18(rs.getString(25));
						t.setS19(rs.getString(26));
						t.setS20(rs.getString(27));
						t.setS21(rs.getString(28));
						t.setS22(rs.getString(29));
						t.setS23(rs.getString(30));
						t.setS24(rs.getString(31));
						t.setS25(rs.getString(32));
						t.setS26(rs.getString(33));
						t.setS27(rs.getString(34));
						t.setS28(rs.getString(35));
						t.setS29(rs.getString(36));
						t.setS30(rs.getString(37));
						t.setS31(rs.getString(38));
						t.setS32(rs.getString(39));
						t.setS33(rs.getString(40));
						t.setS34(rs.getString(41));
						t.setS35(rs.getString(42));
						t.setS36(rs.getString(43));
						t.setS37(rs.getString(44));
						t.setS38(rs.getString(45));
						t.setS39(rs.getString(46));
						t.setS40(rs.getString(47));
						t.setS41(rs.getString(48));
						t.setS42(rs.getString(49));
						t.setS43(rs.getString(50));
						t.setS44(rs.getString(51));
						t.setNumOfSeat(rs.getInt(52));
						flag=true;
					}
					return flag;
					
				}
		
}
	

