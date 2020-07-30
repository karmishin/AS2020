package xyz.karmishin.drontaxiweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import xyz.karmishin.drontaxiweb.entities.User;
import xyz.karmishin.drontaxiweb.services.UserService;

import javax.validation.Valid;
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

    @GetMapping("/users/{id}/edit")
    public String editUserGet(@PathVariable Long id, Model model) {
        User user = userService.id(id);
        model.addAttribute("object", "user");
        model.addAttribute("user", user);
        return "edit";
    }
    
    @PostMapping("/users")
    public String editUserPost(@Valid @ModelAttribute("user") User user, Model model) {
        return "redirect:/users";
    }

}
