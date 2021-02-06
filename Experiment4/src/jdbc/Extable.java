package jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
 public class Extable
 {

 public static void main(String[] args)
 {
 
 try
 {
 Class.forName("com.mysql.jdbc.Driver");
 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
 Statement stmt = con.createStatement();
 
 ResultSet rs = stmt.executeQuery("Select * from stude where std_id = 111");
 
 System.out.println("std_id\tstd_name\tst_grade\tstd_branch");
 
 while(rs.next()){
	 System.out.println(rs.getString(1)+"\t" + rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t");
 }
 con.close();
 }
 catch(ClassNotFoundException | SQLException e){
	 e.printStackTrace();}
 }
 }