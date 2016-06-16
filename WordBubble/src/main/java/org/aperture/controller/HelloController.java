package org.aperture.controller;

import org.aperture.data.WordBubbleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
	
	@Autowired
	private WordBubbleDAO dao;

    @RequestMapping("/words")
    public String index(Model model, @RequestParam(value="searchCriteria", required=false) String searchCriteria) {
    	String value = "";
    	value = getDao().selectAllWordCount();
    	
    	model.addAttribute("searchCriteria", searchCriteria);
    	model.addAttribute("test",value);
    	
        return "forward:/index.jsp";
    }
	
	@RequestMapping("/wordsByPerson")
	public String wordsByPerson(Model model, String name, @RequestParam(value="searchCriteria", required=false) String searchCriteria) {
    	String value = "";
    	value = getDao().selectWordCountByName(name);
    	
    	model.addAttribute("searchCriteria", searchCriteria);
    	model.addAttribute("test",value);
    	
        return "forward:/index.jsp";
    }
	
	@RequestMapping("/wordsByCommunity")
	public String wordsByCommunity(Model model, String community, @RequestParam(value="searchCriteria", required=false) String searchCriteria) {
    	String value = "";
    	value = getDao().selectWordCountByCommunity(community);
    	
    	model.addAttribute("searchCriteria", searchCriteria);
    	model.addAttribute("test",value);
    	
        return "forward:/index.jsp";
    }

	public WordBubbleDAO getDao() {
		return dao;
	}

	public void setDao(WordBubbleDAO dao) {
		this.dao = dao;
	}
}