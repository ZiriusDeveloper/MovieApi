package com.zirius.zerp.movieApi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static final String URL = "jdbc:mysql://localhost:3306/zerp";
    public static final String USER = "";
    public static final String PASS = "";

   
    protected Connection connection = null;
    public final void getConnection() throws DBException
	{
        try{
            if (connection == null) 
            {
                Class.forName("com.mysql.cj.jdbc.Driver");  
                connection = DriverManager.getConnection( URL , USER , PASS);
                System.out.println("Connection get");
            }
        }catch(Exception e)
        {
           e.printStackTrace();
           new DBException(e.getMessage());
        }
    }

    public final void finalize()
	{
		try
		{
			if(connection != null || connection.isClosed() == false)
			{
				connection.close(); connection = null;
			}
 	    }
		catch(SQLException e)
		{
			
		}
    }

}