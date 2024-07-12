package com.scm.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {

    //page  controllers are used to handle request in spring boot

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("home page handller");
        

        //sending data to views
         model.addAttribute("name", "substring technology ");
         model.addAttribute("youtubechannel", "https//printmy channel");
         model.addAttribute("github", "https://github.com/Amarjyoti8260");
        return "home";
    }
    //rout for about 

    @RequestMapping("/about")
    public String aboutPage(){
        
        System.out.println("about page loading ");
        return "about";
    }


    //services


    @RequestMapping("/services")
    public String servicesPage(){
        
        System.out.println("aservices page loading ");
        return "services";
    }

}
