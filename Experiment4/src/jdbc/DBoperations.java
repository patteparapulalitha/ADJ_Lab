package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBoperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// load the jdbc driver-4 into application for mysql.
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection.
			// DriverManager.getConnection(connectionURL, username,password)
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			
			
			
			
			String query="update student_values set redgno=? where grade=?";
			
			PreparedStatement upsmt=con.prepareStatement(query);
			
			upsmt.setString(1289, "O");
			upsmt.setString(1290, "A");
			
			int rows=upsmt.executeUpdate();
			// retrieve the data from resultset
			System.out.println(rows+" row(s) are updated.");
			
			
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from student_values");
			System.out.println("redgno\tgrade\t");
			
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t");
			}
			
			con.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}
