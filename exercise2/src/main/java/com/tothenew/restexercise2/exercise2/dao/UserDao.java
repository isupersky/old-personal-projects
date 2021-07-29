package com.tothenew.restexercise2.exercise2.dao;

import com.fasterxml.jackson.databind.util.ArrayIterator;
import com.tothenew.restexercise2.exercise2.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Component
public class UserDao {
    public static List<User> userList = new ArrayList<>();

    public List<User> getAllUser(){
        return userList;
    }

    public User getUserById(Integer id){

        for(User user1 : userList){
            if(user1.getUserId()==id){
                return user1;
            }
        }
//        Iterator<User> iterator = userList.iterator();
//        while (iterator.hasNext()){
//            if(iterator.next().getUserId()==id)
//                return iterator.next();
//        }
        return null;
    }

    public void addUser(User user){
        userList.add(user);
    }
}
