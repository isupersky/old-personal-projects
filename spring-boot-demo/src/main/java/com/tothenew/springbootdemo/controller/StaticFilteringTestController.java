package com.tothenew.springbootdemo.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticFilteringTestController {

    @JsonIgnore
    int testInteger = 100;

     int testInteger2 =200;

     @GetMapping(path = "/testInteger")
    public Test returnValue(){
        return new Test(100,200);

    }

    @GetMapping(path = "/testInteger2")
    public int returnValue2(){
        return testInteger2;

    }
}


class Test{
    @JsonIgnore
    int test1;
    int test2;

    public Test(int test1, int test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }
}
