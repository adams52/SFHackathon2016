package org.aperture.data;

public class WordBubbleSQL {
	
	public static final String CREATE_TABLE = "DROP TABLE IF EXISTS BusinessSocial;" +
			"CREATE TABLE BusinessSocial (Name string, Community string, Word string, Count integer)";
	
	public static final String INSERT_DATA = "INSERT INTO BusinessSocial (Name, Community, Word, Count) " +
			"VALUES ('Ben Adams', 'Red Mic', 'Test', 1)" +
			", ('Ben Adams', 'Red Mic', 'Night', 2)" +
			", ('Ben Adams', 'Red Mic', 'Mic', 3)" +
			", ('Ben Adams', 'Systems Technology', 'Autonomous', 4)" +
			", ('Ben Adams', 'Systems Technology', 'Vehicles', 5)" +
			", ('Ben Adams', 'Systems Technology', 'Bridge', 6)" +
			", ('Ben Adams', 'Ask Oak', 'Star', 7)" +
			", ('Ben Adams', 'Ask Oak', 'IT', 8)" +
			", ('Ben Adams', 'Ask Oak', 'Modernization', 9)" +
			", ('Ben Adams', 'Ask Oak', 'Remarkable', 10)" +
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
	
	public static final String SELECT_ALL_WORD_COUNT = "SELECT Word, Sum(Count) AS Count FROM BusinessSocial GROUP BY Word ORDER BY Count DESC";
	
	public static final String SELECT_WORD_COUNT_BY_NAME = "SELECT Word, Sum(Count) AS Count " +
			"FROM BusinessSocial " +
			"WHERE Name = ? " +
			"GROUP BY Word " +
			"ORDER BY Count DESC";
	
	public static final String SELECT_WORD_COUNT_BY_COMMUNITY = "SELECT Word, Sum(Count) AS Count " +
			"FROM BusinessSocial " +
			"WHERE Community = ? " +
			"GROUP BY Word " +
			"ORDER BY Count DESC";
}
