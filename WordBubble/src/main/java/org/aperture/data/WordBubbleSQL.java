package org.aperture.data;

public class WordBubbleSQL {
	
	public static final String CREATE_TABLE = "DROP TABLE IF EXISTS BusinessSocial;" +
			"CREATE TABLE BusinessSocial (Name string, Community string, Word string, Count integer)";
	
	public static final String INSERT_DATA = "INSERT INTO BusinessSocial (Name, Community, Word, Count) " +
			"VALUES ('Ben Adams', 'Red Mic', 'Red', 10)" +
			", ('Ben Adams', 'Red Mic', 'Red', 15)" +
			", ('Ben Adams', 'Red Mic', 'Mic', 25)" +
			", ('Ben Adams', 'Systems Technology', 'Autonomous', 30)" +
			", ('Ben Adams', 'Systems Technology', 'Vehicles', 43)" +
			", ('Ben Adams', 'Systems Technology', 'Bridge', 22)" +
			", ('Ben Adams', 'Ask Oak', 'Star', 7)" +
			", ('Ben Adams', 'Ask Oak', 'IT', 5)" +
			", ('Ben Adams', 'Ask Oak', 'Modernization', 32)" +
			", ('Ben Adams', 'Ask Oak', 'Remarkable', 25)" +
			", ('Nive Suresh', 'Red Mic', 'IT', 27)" +
			", ('Nive Suresh', 'Red Mic', 'Modernization', 37)" +
			", ('Nive Suresh', 'Red Mic', 'Remarkable', 41)" +
			", ('Nive Suresh', 'Red Mic', 'Service', 30)" +
			", ('Nive Suresh', 'Systems Technology', 'Autonomous', 40)" +
			", ('Nive Suresh', 'Systems Technology', 'Cars', 47)" +
			", ('Nive Suresh', 'Systems Technology', 'Hackday', 13)" +
			", ('Nive Suresh', 'Ask Oak', 'Mark', 20)" +
			", ('Nive Suresh', 'Ask Oak', 'Oakley', 32)" +
			", ('Nive Suresh', 'Ask Oak', 'Laptop', 17)" +
			", ('Joanna Snipes', 'Red Mic', 'IT', 19)" +
			", ('Joanna Snipes', 'Red Mic', 'Red', 12)" + 
			", ('Joanna Snipes', 'Red Mic', 'Ask', 15)" + 
			", ('Joanna Snipes', 'Systems Technology', 'Modernization', 20)" + 
			", ('Joanna Snipes', 'Systems Technology', 'Android', 20)" + 
			", ('Joanna Snipes', 'Systems Technology', 'Bands', 12)" + 
			", ('Joanna Snipes', 'Systems Technology', 'Autonomous', 10)" + 
			", ('Joanna Snipes', 'Ask Oak', 'Hacking', 22)" + 
			", ('Joanna Snipes', 'Ask Oak', 'Production', 13)" + 
			", ('Joanna Snipes', 'Ask Oak', 'Test', 15)";
	
	public static final String SELECT_ALL_DATA = "SELECT * FROM BusinessSocial";
	
	public static final String SELECT_ALL_WORD_COUNT = "SELECT Word, Sum(Count) AS Count FROM BusinessSocial GROUP BY Word";
	
	
//	statement.executeUpdate("drop table if exists person");
//    statement.executeUpdate("create table person (id integer, name string)");
//    statement.executeUpdate("insert into person values(1, 'leo')");
//    statement.executeUpdate("insert into person values(2, 'yui')");
}
