package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import autoConf.Holoman;

//@SpringBootConfiguration
//@ComponentScan
//@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(DemoApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}


}
