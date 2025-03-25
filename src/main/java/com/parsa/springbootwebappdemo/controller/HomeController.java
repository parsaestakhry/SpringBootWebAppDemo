package com.parsa.springbootwebappdemo.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Home(){
        System.out.println("Home method called!");
        return "index.jsp";
    }


    @RequestMapping("add")
    public String add(@RequestParam("num1") int num, int num2, HttpSession session){

        int result = num + num2;

        session.setAttribute("result", result);

        System.out.println(result);




        System.out.println("Add method called");
        return "result.jsp";
    }
}
