package com.greenfox.error.model.controller;

import com.greenfox.error.model.config.UserService;
import com.greenfox.error.model.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    @Autowired
    UserService service;

    @GetMapping("/main")
    public String index(Model model) {
        model.addAttribute("new_user", new User());
        model.addAttribute("yolo", service.getAll());
        return "main";
    }

    @PostMapping()
    public String create(@ModelAttribute User user) {
        service.save(user);
        return "redirect:/main";
    }
}