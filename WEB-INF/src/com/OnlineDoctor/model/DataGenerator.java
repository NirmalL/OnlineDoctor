package com.OnlineDoctor.model;

import java.sql.*;

public class DataGenerator {
   static String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static String DB_URL = "jdbc:mysql://ce-414/bmidatabase";

   static String USER = "e11000"; //replace this with your registration number
   static String PASS = "";
   static Connection conn = null;

public DataGenerator() throws Exception
{
if(conn == null)
        	conn = DriverManager.getConnection(DB_URL,USER,PASS);
        Class.forName("com.mysql.jdbc.Driver");
}



 public String calculate (String name, float height, float weight) throws Exception
{

	float bmi = weight/(height*height);
	String answer = null;      
	
/*	 check whether the client already exists in the database. 
	 if the client exists, return the follwing three items in one string: 
		1. current BMI value 
		2. previous BMI value that is in the database 
		3. the difference between the current and the previous BMI values 
	and then update the database to reflect the new BMI value 
	if the client does not exist: 
		return a string that contains the current BMI value 
		and then insert a new entry containing the calculated BMI.
*/
	return answer; 
}

public boolean updateBMI(String name, float bmi)
{
	try
	{
	 String sql = "UPDATE bmidata SET bmi=? where name=?";
	PreparedStatement stmt = conn.prepareStatement(sql);
	stmt.setFloat(1,bmi);
	stmt.setString(2,name); 
	stmt.executeUpdate();
	return true;
	}
	catch(Exception ex)
	{
		return false;
	}
}

public boolean insertBMI(String name, float bmi)
{
	try
	{
		String sql = "INSERT into bmidata (name,bmi) values (?,?);";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1,name);
		stmt.setFloat(2,bmi);
		stmt.executeUpdate();
		return true;
	}
	catch(Exception ex)
	{
		return false;
	}
}

public float getBMI(String name)
{
	try
	{
		String sql = "SELECT name,bmi FROM bmidata WHERE name=?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1,name);
		ResultSet rs = stmt.executeQuery();
		if(rs.next())
			return rs.getFloat("bmi");
		else
			return 0F;	
	}
	catch(Exception ex)
	{
		return -1;
	}
}

}
