package com.tothenew.springbootdemo.service;

import com.tothenew.springbootdemo.model.Books;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookService{
    public static List<Books> list = new ArrayList<>();

    public void listAdd(Books book){
        list.add(book);
    }
}

