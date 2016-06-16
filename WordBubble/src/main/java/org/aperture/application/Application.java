package org.aperture.application;

import org.aperture.data.DataConnection;
import org.aperture.data.WordBubbleDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.*;

@EnableAutoConfiguration
@ComponentScan({"org.aperture.controller", "org.aperture.data"})
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}