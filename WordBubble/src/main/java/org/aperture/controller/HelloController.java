package org.aperture.controller;

import org.springframework.web.bind.annotation.RestController;
import org.aperture.data.WordBubbleDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/words")
    public String index(Model model) {
    	WordBubbleDAO dao = new WordBubbleDAO();
    	String value = "";
    	try {
			value = dao.selectAllWordCount();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	model.addAttribute("test",value);
    	
        return "forward:/index.jsp";
    }

}