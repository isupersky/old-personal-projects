package com.tothenew.restexercise2.exercise2.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.util.Locale;

@RestController
public class HelloController {
    @Autowired
    private MessageSource messageSource;
    
    @ApiOperation(value = "Prints Hello World")
    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "hello World";
    }
    
    @ApiOperation(value = "Takes name as a parameter in URI and prints Hello Name")
    @GetMapping(path = "/hello/{name}")
    public String helloWorld(@PathVariable String name){
        return "Hello "+name;
    }
    
    @ApiOperation(value = "Internationalized Method")
    @GetMapping(path = "/hello-international/{name}")
    public String helloWorldInternational(@RequestHeader(name="Accept-Language",required = false) Locale locale, @PathVariable String name){

        return messageSource.getMessage("hello.world.message",null,locale)+ " " + name;
    }

//    @GetMapping(path = "/hello-international/{name}")
//    public String helloWorldInternational( @PathVariable String name){
//
//        return "hello.world.message"+ name;
//    }
}
