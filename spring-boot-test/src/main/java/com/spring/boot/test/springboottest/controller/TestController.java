package com.spring.boot.test.springboottest.controller;

import org.apache.catalina.valves.JDBCAccessLogValve;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@ConditionalOnClass({String.class,JDBCAccessLogValve.class})
public class TestController {
	
	@GetMapping("/")
	public String getMessage() {
		return "Hello World!!";
	}

}
