package com.gtd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TimestoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimestoryApplication.class, args);
	}

	@RequestMapping("/hello")
  public String hello(){
	  return "Hello timestory with springboot + gradle !";
  }
}
