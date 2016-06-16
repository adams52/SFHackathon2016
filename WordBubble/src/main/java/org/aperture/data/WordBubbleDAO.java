package org.aperture.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class WordBubbleDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(readOnly=true)
	public String selectAllWordCount() {
		List<String> wordCount = jdbcTemplate.query(WordBubbleSQL.SELECT_ALL_WORD_COUNT, new ListMapper());
		String value = concatWordCounts(wordCount);
		return value;
	}

	@Transactional(readOnly=true)
	public String selectWordCountByName(String name) {
		List<String> wordCount = jdbcTemplate.query(WordBubbleSQL.SELECT_WORD_COUNT_BY_NAME, new Object[] { name },
				new ListMapper()); 
		String value = concatWordCounts(wordCount);
		return value;
	}

	@Transactional(readOnly=true)
	public String selectWordCountByCommunity(String community) {
		List<String> wordCount = jdbcTemplate.query(WordBubbleSQL.SELECT_WORD_COUNT_BY_COMMUNITY,
				new Object[] { community }, new ListMapper());
		String value = concatWordCounts(wordCount);
		return value;
	}
	
	private String concatWordCounts(List<String> wordCounts) {
		String value = "";
		for (int x = 0; x < wordCounts.size(); x++) {
			value += wordCounts.get(x);
			if (x < wordCounts.size() - 1) {
				value +=  ";";
			} 
		}
		
		return value;
	}

}