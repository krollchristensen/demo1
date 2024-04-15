package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/")
    public String welcome(Model model) {
        model.addAttribute("message", "Velkommen til vores applikation!");
        return "welcome";
    }

    @GetMapping("/signup")
    public String signUpForm(Model model) {
        return "signup";
    }

    @PostMapping("/signup")
    public String signUpUser(@RequestParam String username, @RequestParam String password, Model model) {
        model.addAttribute("username", username);
        // Her skal du implementere logikken til at gemme brugeren
        return "signup-success";
    }
}
