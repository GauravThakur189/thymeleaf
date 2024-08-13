package net.learnjava.java_thymeleaf.controller;


import net.learnjava.java_thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String getUser(Model model){
        User user  = new User("Gaurav Singh","gaurav@gmail.com","ADMIN","Male");
        model.addAttribute("user",user);
        return "userData";
    }

    @GetMapping("/link")
    public String linkExpression(Model model){
        model.addAttribute("id",1);
        return "linkExpression";
    }
}
