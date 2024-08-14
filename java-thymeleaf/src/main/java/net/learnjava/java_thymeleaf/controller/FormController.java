package net.learnjava.java_thymeleaf.controller;

import net.learnjava.java_thymeleaf.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    @GetMapping("/register")
    public String registration(Model model){
        UserForm userForm = new UserForm();
        model.addAttribute("userForm",userForm);

        List<String> listProfession = Arrays.asList("developer","tester","ui/ux","architect");
        model.addAttribute("listProfession",listProfession);
        return "register-form";
    }

    @PostMapping("/register/save")
    public String submitForm(Model model , @ModelAttribute("userForm") UserForm userForm){
        model.addAttribute("userForm",userForm);
        return "register-success";
    }
}
