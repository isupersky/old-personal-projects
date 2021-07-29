package com.tothenew.restexercise2.exercise2.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.tothenew.restexercise2.exercise2.dao.UserDao;
import com.tothenew.restexercise2.exercise2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@ApiModel(description = "User Controller Class")
@RestController
public class UserController {
    @Autowired
    UserDao userDao;
    
    @ApiOperation(value = "Get The List Of All Users")
    @GetMapping(path = "/users")
    public List<User> showAllusers(){
        return userDao.getAllUser();
    }
    
    @ApiOperation(value = "Get The Info About One User")
    @GetMapping(path = "/users/{id}")
    public User getUserById(@PathVariable Integer id){
        return userDao.getUserById(id);
    }
    
    @ApiOperation(value = "Add the User")
    @PostMapping(path = "/users")
    public void addUser(@RequestBody User user){
        userDao.addUser(user);
    }
    
    
    @ApiOperation(value = "Add the User using Dynamic Filter")
    @GetMapping(path="/users/users-Filters/{id}")
    public MappingJacksonValue addUserDynamicFilter(@PathVariable Integer id)
    {
        User user = userDao.getUserById(id);
        SimpleBeanPropertyFilter filter =SimpleBeanPropertyFilter
                                         .filterOutAllExcept("userName");
        FilterProvider filters = new SimpleFilterProvider()
                                    .addFilter("GetDynamicFilter",filter);
        MappingJacksonValue mapping = new MappingJacksonValue(user);
        mapping.setFilters(filters);
        return mapping;
    }
}
