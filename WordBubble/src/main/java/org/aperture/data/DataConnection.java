package org.aperture.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnection {
	
	public void createConnection() throws ClassNotFoundException
	  {
	    // load the sqlite-JDBC driver using the current class loader
	    Class.forName("org.sqlite.JDBC");

	    Connection connection = null;
	    try
	    {
	      // create a database connection
	      connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
	      Statement statement = connection.createStatement();
	      statement.setQueryTimeout(30);  // set timeout to 30 sec.
	      
	      statement.executeUpdate(WordBubbleSQL.CREATE_TABLE);
	      statement.executeUpdate(WordBubbleSQL.INSERT_DATA);
	      ResultSet rs2 = statement.executeQuery(WordBubbleSQL.SELECT_ALL_DATA);
	      while (rs2.next())
	      {
	        // read the result set
	        System.out.println("name = " + rs2.getString("Name"));
	        System.out.println("word = " + rs2.getString("Word"));
	      }
	      rs2.close();
	    }
	    catch(SQLException e)
	    {
	      // if the error message is "out of memory", 
	      // it probably means no database file is found
	      System.err.println(e.getMessage());
	    }
	    finally
	    {
	      try
	      {
	        if(connection != null)
	          connection.close();
	      }
	      catch(SQLException e)
	      {
	        // connection close failed.
	        System.err.println(e);
	      }
	    }
	  }

}
