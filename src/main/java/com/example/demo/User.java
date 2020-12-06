package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

   // @GetMapping("/")
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String getUser(){
        return "IM a jayram pathhh";
    }

    @GetMapping("/user")
    public UserBean getUserName(){
        return new UserBean("Jayram");
    }
}
