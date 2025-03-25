package com.parsa.springbootwebappdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Home(){
        System.out.println("Home method called!");
        return "index.jsp";
    }
}
