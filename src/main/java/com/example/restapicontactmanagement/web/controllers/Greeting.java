package com.example.restapicontactmanagement.web.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Greeting {
    //Get http://localhost:8080/hello?name=ci2
   /* @GetMapping("/hello")
    public String getGreeting(@RequestParam String name) {
        return "hello "+name;
    }*/ 
   //Get http://localhost:8080/hello/ci2
   @GetMapping("/hello/{name}")
    public String getGreeting(@PathVariable String name) {
        return "hello "+name;
    }





    
}