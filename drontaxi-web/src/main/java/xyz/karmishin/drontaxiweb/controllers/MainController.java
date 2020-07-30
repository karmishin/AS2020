package xyz.karmishin.drontaxiweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.karmishin.drontaxiweb.services.UserService;

@Controller
public class MainController {
    @GetMapping("/")
    public String root() {
        return "redirect:/orders";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }
}
