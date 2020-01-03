package com.deloitte.project.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.deloitte.project.model.Users;



public class UserDAO {
	public static Connection connectToDB()
	{
		Connection connection=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			return connection;
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
				try {
					connection.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				return null;
		}

}
	public static void addUser(Users user)
	{
		System.out.println(user);
		try {
			Connection con = connectToDB();
			PreparedStatement stmt = con.prepareStatement("insert into Users values(?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1,Users.getCount());
			stmt.setString(2,user.getUserFName());
			stmt.setString(3, user.getUserLName());
			stmt.setLong(4, user.getContact());
			stmt.setString(5, user.getEmail());
			stmt.setString(6, user.getAddress());
			stmt.setString(7, user.getCity());
			stmt.setString(8, user.getPassword());
			stmt.setString(9, user.getRole());
			int affectedRows = stmt.executeUpdate() ;
			System.out.println("Affected rows:"+affectedRows);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static ArrayList<Users> displayUsers()
	{
		ArrayList<Users> userlist = new ArrayList<Users>();
		try
		{
			Connection con = connectToDB();
			PreparedStatement stmt = con.prepareStatement("select * from Users");
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				Users user = new Users();
			    user.setUserId(rs.getInt(1));
			    user.setUserFName(rs.getString(2));
			    user.setUserLName(rs.getString(3));
			    user.setContact(rs.getLong(4));
			    user.setEmail(rs.getString(5));
			    user.setAddress(rs.getString(6));
			    user.setCity(rs.getString(7));
			    user.setPassword(rs.getString(8));
			    user.setRole(rs.getString(9));
				userlist.add(user);	
			}
			con.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userlist;
	}
	public static void userLogin(String mailid, String pwd)
	{
		try
		{
			Connection con = connectToDB();
			PreparedStatement stmt = con.prepareStatement("select email,password from Users where email=? AND password=?");
			stmt.setString(1, mailid);
			stmt.setString(2, mailid);
			int count=0;
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				count++;
			}
			if(count!=0)
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("invalid username or password");
			}
			con.close();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
