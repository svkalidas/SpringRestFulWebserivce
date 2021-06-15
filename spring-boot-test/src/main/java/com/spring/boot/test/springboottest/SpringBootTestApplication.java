package com.spring.boot.test.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.spring.boot.test.one","com.spring.boot.test.springboottest.*"})
public class SpringBootTestApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringBootTestApplication.class);
		
		//Setting additional profile via 'SpringApplication' class
		springApplication.setAdditionalProfiles("dev");
		springApplication.run(args);
		
	}

}
