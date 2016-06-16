package org.aperture.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WordBubbleDAO {
	
	public String selectAllWordCount() throws ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");

		Connection connection = null;
		String value = "";
		try {
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.

			ResultSet rs2 = statement.executeQuery(WordBubbleSQL.SELECT_ALL_WORD_COUNT);
			
			while (rs2.next()) {
				value += "" + rs2.getString("Word") + ":";
				value += "" + rs2.getInt("Count") + ";";
			}
		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// connection close failed.
				System.err.println(e);
			}
		}
		
		return value;

	}
	
	public String selectWordCountByPerson(String person) throws ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");

		Connection connection = null;
		String value = "";
		try {
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.

			ResultSet rs2 = statement.executeQuery("SELECT Word, Sum(Count) AS Count FROM BusinessSocial WHERE Name = '" + person + "' GROUP BY Word ORDER BY Count DESC");
			
			while (rs2.next()) {
				value += "" + rs2.getString("Word") + ":";
				value += "" + rs2.getInt("Count") + ";";
			}
		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// connection close failed.
				System.err.println(e);
			}
		}
		
		return value;

	}
	
	public String selectWordCountByCommunity(String community) throws ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");

		Connection connection = null;
		String value = "";
		try {
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.

			ResultSet rs2 = statement.executeQuery("SELECT Word, Sum(Count) AS Count FROM BusinessSocial WHERE Community = '" + community + "' GROUP BY Word ORDER BY Count DESC");
			
			while (rs2.next()) {
				value += "" + rs2.getString("Word") + ":";
				value += "" + rs2.getInt("Count") + ";";
			}
		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// connection close failed.
				System.err.println(e);
			}
		}
		
		return value;

	}
	
	public ResultSet executeSelect(String sql) throws ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");

		Connection connection = null;
		ResultSet rs = null;
		try {
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.

			rs = statement.executeQuery(sql);
			
		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// connection close failed.
				System.err.println(e);
			}
		}
		
		return rs;
	}

	public String selectAll() throws ClassNotFoundException {
		
		Class.forName("org.sqlite.JDBC");

		Connection connection = null;
		String value = "";
		try {
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.

			ResultSet rs2 = statement.executeQuery(WordBubbleSQL.SELECT_ALL_DATA);
			
			while (rs2.next()) {

				value += "Name:" + rs2.getString("Name");
				value += "\nCommunity:" + rs2.getString("Community");
				value += "\nWord:" + rs2.getString("Word");
				value += "\nCount:" + rs2.getInt("Count");
				value += "--------------------------------\n";
			}
		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// connection close failed.
				System.err.println(e);
			}
		}

		
		return value;
	}

	public void prepareDatabase() throws ClassNotFoundException {
		executeUpdate(WordBubbleSQL.CREATE_TABLE);
		executeUpdate(WordBubbleSQL.INSERT_DATA);
	}

	public void executeUpdate(String sql) throws ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");

		Connection connection = null;
		try {
			// create a database connection
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30); // set timeout to 30 sec.

			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// if the error message is "out of memory",
			// it probably means no database file is found
			System.err.println(e.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// connection close failed.
				System.err.println(e);
			}
		}

	}

}