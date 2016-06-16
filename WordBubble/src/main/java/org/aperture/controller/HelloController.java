package org.aperture.controller;

import org.aperture.data.WordBubbleDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/words")
    public String index(Model model, @RequestParam(value="searchCriteria", required=false) String searchCriteria) {
    	WordBubbleDAO dao = new WordBubbleDAO();
    	String value = "";
    	try {
			value = dao.selectAllWordCount();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	model.addAttribute("searchCriteria", searchCriteria);
    	model.addAttribute("test",value);
    	
        return "forward:/index.jsp";
    }
	
	@RequestMapping("/wordsByPerson")
	public String wordsByPerson(Model model, String name, @RequestParam(value="searchCriteria", required=false) String searchCriteria) {
    	WordBubbleDAO dao = new WordBubbleDAO();
    	String value = "";
    	try {
			value = dao.selectWordCountByPerson(name);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	model.addAttribute("searchCriteria", searchCriteria);
    	model.addAttribute("test",value);
    	
        return "forward:/index.jsp";
    }
	
	@RequestMapping("/wordsByCommunity")
	public String wordsByCommunity(Model model, String community, @RequestParam(value="searchCriteria", required=false) String searchCriteria) {
    	WordBubbleDAO dao = new WordBubbleDAO();
    	String value = "";
    	try {
			value = dao.selectWordCountByCommunity(community);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	model.addAttribute("searchCriteria", searchCriteria);
    	model.addAttribute("test",value);
    	
        return "forward:/index.jsp";
    }

}