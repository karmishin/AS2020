package xyz.karmishin.drontaxiweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import xyz.karmishin.drontaxiweb.entities.User;
import xyz.karmishin.drontaxiweb.services.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public String users(Model model) {
        List<User> userList = userService.all();
        model.addAttribute("users", userList);
        return "users";
    }

}
