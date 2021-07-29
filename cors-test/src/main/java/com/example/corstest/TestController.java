package com.example.corstest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{
  static int count =0;

  @CrossOrigin(origins = "http://localhost:3000")
  @GetMapping(path= "/greeting")
  public Test greeting() {
    count++;
    System.out.println("==== in greeting ====");
    Test testObj = new Test();
    return testObj;
  }
}

class Test{
  String greetings = "hello World";

  public String getGreetings() {
    return greetings;
  }

  public void setGreetings(String greetings) {
    this.greetings = greetings;
  }
}