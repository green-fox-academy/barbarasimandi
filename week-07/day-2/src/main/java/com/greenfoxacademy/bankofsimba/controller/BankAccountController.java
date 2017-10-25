package com.greenfoxacademy.bankofsimba.controller;


import com.greenfoxacademy.bankofsimba.model.BankAccount;
import java.text.DecimalFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankAccountController {

  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");
  DecimalFormat df = new DecimalFormat("0.00##");

  @RequestMapping(value = "/bank")
  public String showAccount(Model model) {
    model.addAttribute("name", String.format("%s", bankAccount.getName()));
    model.addAttribute("balance", String.format("%.2f %s", bankAccount.getBalance(), "Zebra"));
    model.addAttribute("animalType", String.format("%s",bankAccount.getAnimalType()));
    return "default";
  }

  @RequestMapping(value = "/enjoy")
  public String htmlSubmit(Model model) {
    model.addAttribute("htmlText", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "enjoy";
  }
}
