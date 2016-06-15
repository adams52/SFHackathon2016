package org.aperture.application;

import org.aperture.data.DataConnection;
import org.aperture.data.WordBubbleDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.*;

@EnableAutoConfiguration
@ComponentScan({"org.aperture.controller"})
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
    	WordBubbleDAO dao = new WordBubbleDAO();
    	try {
			dao.prepareDatabase();
			System.out.println(dao.selectAllWordCount());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        SpringApplication.run(Application.class);
    }

}