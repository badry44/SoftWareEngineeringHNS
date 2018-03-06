package com.project.Entity;
import java.sql.*;
public class User {
public String UserName;
public String Password;

public User(String _UserName,String _Password)
{
	UserName = _UserName;
	Password = _Password;
}
public Connection GetConnectionToDB()
{
	try
	{
		Connection con = DriverManager.getConnection("jdbc:sqlserver://.\\MSSQLSERVER12\\HNS", "sa", "root");
		System.out.println(":::::");
		return con;
	}
	catch(Exception ex)
	{
		return null;
	}
}
}
