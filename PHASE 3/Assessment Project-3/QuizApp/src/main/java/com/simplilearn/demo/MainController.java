package com.simplilearn.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "Hello Welcome to this QUIZ competition";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Hey hi are you ready for the competition";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hello admin here you can see all the participants details";
    }

}