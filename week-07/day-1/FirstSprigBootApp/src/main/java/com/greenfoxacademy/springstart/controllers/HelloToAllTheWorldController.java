package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloToAllTheWorldController {

  @RequestMapping(value = "/hello2")
  public String greetingInLanguages(@RequestParam String yourName2, Model model2) {

    Hello hello = new Hello();

    model2.addAttribute("hello", String.format("%s", hello.getActualHello()));
    model2.addAttribute("color", hello.getActualColor());
    model2.addAttribute("fontSize", hello.getActualFontSize());
    model2.addAttribute("name2", String.format("%s ", yourName2));
    return "greeting";
  }
}
