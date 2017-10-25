package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  static AtomicLong idIncrementer = new AtomicLong();

  @RequestMapping(value = "/web/greeting")
  public String greeting(@RequestParam String yourName, Model model) {
    model.addAttribute("name", String.format("%s ", yourName));
    model.addAttribute("times", String.format("%s ", idIncrementer.incrementAndGet()));
    return "greeting";
  }
}
