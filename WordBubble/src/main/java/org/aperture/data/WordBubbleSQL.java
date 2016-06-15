package org.aperture.data;

public class WordBubbleSQL {
	
	public static final String CREATE_TABLE = "DROP TABLE IF EXISTS BusinessSocial;" +
			"CREATE TABLE BusinessSocial (Name string, Community string, Word string, Count integer)";
	
	public static final String INSERT_DATA = "INSERT INTO BusinessSocial (Name, Community, Word, Count) " +
			"VALUES ('Ben Adams', 'Red Mic', 'Red', 2)" +
			", ('Ben Adams', 'Red Mic', 'Red', 3)" +
			", ('Ben Adams', 'Red Mic', 'Mic', 5)" +
			", ('Ben Adams', 'Systems Technology', 'Autonomous', 3)" +
			", ('Ben Adams', 'Systems Technology', 'Vehicles', 4)" +
			", ('Ben Adams', 'Systems Technology', 'Bridge', 2)" +
			", ('Ben Adams', 'Ask Oak', 'Star', 3)" +
			", ('Ben Adams', 'Ask Oak', 'IT', 5)" +
			", ('Ben Adams', 'Ask Oak', 'Modernization', 4)" +
			", ('Ben Adams', 'Ask Oak', 'Remarkable', 5)" +
			", ('Nive Suresh', 'Red Mic', 'IT', 7)" +
			", ('Nive Suresh', 'Red Mic', 'Modernization', 3)" +
			", ('Nive Suresh', 'Red Mic', 'Remarkable', 1)" +
			", ('Nive Suresh', 'Red Mic', 'Service', 8)" +
			", ('Nive Suresh', 'Systems Technology', 'Autonomous', 2)" +
			", ('Nive Suresh', 'Systems Technology', 'Cars', 5)" +
			", ('Nive Suresh', 'Systems Technology', 'Hackday', 13)" +
			", ('Nive Suresh', 'Ask Oak', 'Mark', 2)" +
			", ('Nive Suresh', 'Ask Oak', 'Oakley', 2)" +
			", ('Nive Suresh', 'Ask Oak', 'Laptop', 7)" +
			", ('Joanna Snipes', 'Red Mic', 'IT', 1)" +
			", ('Joanna Snipes', 'Red Mic', 'Red', 2)" + 
			", ('Joanna Snipes', 'Red Mic', 'Ask', 5)" + 
			", ('Joanna Snipes', 'Systems Technology', 'Modernization', 2)" + 
			", ('Joanna Snipes', 'Systems Technology', 'Android', 9)" + 
			", ('Joanna Snipes', 'Systems Technology', 'Bands', 2)" + 
			", ('Joanna Snipes', 'Systems Technology', 'Autonomous', 10)" + 
			", ('Joanna Snipes', 'Ask Oak', 'Hacking', 7)" + 
			", ('Joanna Snipes', 'Ask Oak', 'Production', 3)" + 
			", ('Joanna Snipes', 'Ask Oak', 'Test', 5)";
	
	public static final String SELECT_ALL_DATA = "SELECT * FROM BusinessSocial";
	
	public static final String SELECT_ALL_WORD_COUNT = "SELECT Word, Sum(Count) AS Count FROM BusinessSocial GROUP BY Word";
	
	
//	statement.executeUpdate("drop table if exists person");
//    statement.executeUpdate("create table person (id integer, name string)");
//    statement.executeUpdate("insert into person values(1, 'leo')");
//    statement.executeUpdate("insert into person values(2, 'yui')");
}
