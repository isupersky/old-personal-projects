//Create a simple REST ful service in Spring Boot which returns the Response "Welcome to spring boot".

package com.tothenew.sbootExercise.ques1.ques1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Ques1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ques1Application.class, args);

	}

}

@RestController
class WelcomeMessage{

	@GetMapping("/Welcome")
	public String printWelcom(){

		return "Welcome to spring boot";
	}


}
