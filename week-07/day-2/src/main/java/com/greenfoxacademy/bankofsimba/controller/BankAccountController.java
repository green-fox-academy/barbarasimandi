package com.greenfoxacademy.bankofsimba.controller;


import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankAccountController {

  BankAccount bankAccount = new BankAccount("Simba", 2000.00, "lion");

  @RequestMapping(value = "/bank")
  public String showAccount(Model model) {
    model.addAttribute("name", String.format("%s ", bankAccount.getName()));
    model.addAttribute("balance", String.format("%s ", bankAccount.getBalance()));
    model.addAttribute("animalType", String.format("%s ",bankAccount.getAnimalType()));
    return "default";
  }

}
