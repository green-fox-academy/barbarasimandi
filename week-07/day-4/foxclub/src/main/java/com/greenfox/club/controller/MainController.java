package com.greenfox.club.controller;

import com.greenfox.club.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @RequestMapping(value = "/")
  public String main(Model model) {
    model.addAttribute("fox", fox);
    return "index";
  }
}
