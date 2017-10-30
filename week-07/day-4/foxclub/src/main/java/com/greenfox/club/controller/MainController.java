package com.greenfox.club.controller;

import com.greenfox.club.model.Drink;
import com.greenfox.club.model.Food;
import com.greenfox.club.model.Fox;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @RequestMapping(value = "/")
  public String main(Model model) {
    fox = new Fox("Mr. Fox", new ArrayList<>(), new Food("pur-pur bread"), new Drink("cloudy apple juice"));
    model.addAttribute("fox", fox);
    return "index";
  }

  @GetMapping(value = "/nutrition")
  public String showInfo(Model model) {
    model.addAttribute("feed", fox.getFood());
    model.addAttribute("give_drink", fox.getDrink());
    return "nutrition";
  }

  @PostMapping
  public String showInfo(@ModelAttribute Fox fox) {
    fox.feed();
    return "reidrect:/nutrition";
  }
}
