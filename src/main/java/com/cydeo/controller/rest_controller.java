package com.cydeo.controller;

import com.cydeo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class rest_controller {

    @GetMapping("/rest")
    public String helloRest(){
        return "hello Rest";
    }
    @GetMapping("/user")
    public User user(){

        User user1 = new User("1","Mohamed","hihi@gmail.com");
        return user1;
    }
    @GetMapping("/{id}")
    public String pathVariable(@PathVariable String id){

        return "variable is :"+id;
    }
    @GetMapping("/request")
    public String requestPar(@RequestParam String name){
        return "the name is: "+name;
    }

}
