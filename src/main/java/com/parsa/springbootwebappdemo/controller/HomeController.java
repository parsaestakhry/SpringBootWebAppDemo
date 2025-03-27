package com.parsa.springbootwebappdemo.controller;


import com.parsa.springbootwebappdemo.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Home(){
        System.out.println("Home method called!");
        return "index";
    }


    @RequestMapping("add")
    public String add(@RequestParam("num1") int num, int num2, Model model,ModelAndView modelAndView ){

        int result = num + num2;

        model.addAttribute("result", result);

        System.out.println(result);




        System.out.println("Add method called");
        return "result";
    }


    @RequestMapping("addAlien")
    public String addAlient(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView modelAndView ){

        Alien alien = new Alien();
        modelAndView.addObject("alien", alien);

        modelAndView.setViewName("result");

        alien.setAid(aid);
        alien.setAname(aname);







        System.out.println("Add Alien method called");
        return "result";
    }
}
