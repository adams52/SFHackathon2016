package org.aperture.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ListMapper implements RowMapper<String> {
	
	@Override
    public String mapRow(ResultSet rs, int rowNum) throws SQLException 
    {
		String value = "";
			value += "" + rs.getString("Word") + ":";
			value += "" + rs.getInt("Count");
		
		return value;
    }
}