package net.learnjava.java_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {


    @GetMapping("/gaurav")
    public String printHelloWorld(Model model){
        model.addAttribute("message","hello gaurav");
        return "gaurav";
    }

}
