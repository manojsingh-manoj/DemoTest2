package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DemoTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoTest1Application.class, args);
	}
	
	@RequestMapping(value= "/practitioner/profile", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public String communicationMobile() {
		return "practitioner profile";
	}

}
