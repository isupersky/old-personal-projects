package com.tothenew.springbootdemo.controller;

import com.tothenew.springbootdemo.model.Books;
import com.tothenew.springbootdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
//import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;
//import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.servlet.LocaleContextResolver;

//import org.springframework../
import javax.swing.text.html.parser.Entity;
import java.util.*;

@RestController
public class BooksController {


    @Autowired
    private MessageSource messageSource;

    @Autowired
    BookService service;


    @GetMapping(path="/Books")
    public List returnSomething(){
//        Date date = new Date();
//        EntityModel<Books>
        return Arrays.asList(new Books(1,"Aakash"), new Books(2,"Shivani"),new Books(3,"Aayushi"),new Books(4,"Abhishek"));
    }

    @GetMapping("/books-bean")
    public Books BooksBean(){
        return new Books(01,"Aakash Sinha");
    }

//    @GetMapping("/Books/{name}")
//    public EntityModel<Books> BooksPathVariable(@PathVariable String name){
//
//         Books books=new Books(1,name);
//
////        WebMvcLinkBuilder linkTo = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn( this.getClass()).returnSomething());
//
////        HashMap<Integer,Books> str=new HashMap<Integer, Books>();
////            str.put(1,new Books(1,"Aakash"));
////            str.put(1,new Books(2,"Aakash2"));
////            str.put(1,new Books(3,"Aakash3"));
////            str.put(1,new Books(4,"Aakash4"));
////
////
////        return str.get(id);
//
//    }

    @PostMapping(path = "/bookPostExample")
    public void addBooksDetails(@RequestBody Books book){
        service.listAdd(book);
//        return "User Added";
    }

    @GetMapping(path = "/bookPostExample")
    public List addBooksDetails(){
        return BookService.list;
//        service.listAdd(book);
//        return "User Added";
    }

    @GetMapping(path = "/hello")
    public String returnHelloWorld(){
        return "Hello World";
    }
//
//    @GetMapping("/hello-world-internationalization")
//    public String helloWorldInternationalised(@RequestHeader(name="Accept-Language") Locale locale){
//        return messageSource.getMessage("hello.world.message",null,locale);
//    }

    @GetMapping("/hello-world-internationalization")
    public String helloWorldInternationalised(){
        return messageSource.getMessage("hello.world.message",null, LocaleContextHolder.getLocale());
    }


}
