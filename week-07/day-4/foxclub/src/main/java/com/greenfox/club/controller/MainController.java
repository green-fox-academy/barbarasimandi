package com.greenfox.club.controller;

import com.greenfox.club.model.Drink;
import com.greenfox.club.model.Food;
import com.greenfox.club.model.Fox;
import com.greenfox.club.model.Trick;
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

  @Autowired
  Trick trick;

  @RequestMapping(value = "/")
  public String main(Model model) {
    model.addAttribute("fox", fox);
    return "index";
  }

  @GetMapping(value = "/nutrition")
  public String nutrition(Model model) {
    model.addAttribute("fox", fox);
    model.addAttribute("food", Food.values());
    model.addAttribute("drink", Drink.values());
    return "nutrition";
  }

  @PostMapping("/feed")
  public String setFood(@ModelAttribute Fox fox) {
    fox.setFood(fox.getFood());
    fox.setDrink(fox.getDrink());
    return "reidrect:/";
  }

  @GetMapping("/trickcenter")
  public String tricks(Model model) {
    model.addAttribute("fox", fox);
    model.addAttribute("trick", trick);
    return "trickcenter";
  }

  @PostMapping("/addTrick")
  public String addTrick(@ModelAttribute Trick trick) {
    fox.addTrick(trick);
    return "redirect:/trickcenter";
  }
}

