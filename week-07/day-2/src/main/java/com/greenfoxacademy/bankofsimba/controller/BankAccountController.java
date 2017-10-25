package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BankAccountController {

  List<BankAccount> bank = new ArrayList<>();
  BankAccount simbAccount = new BankAccount("Simba", 2000, "lion");
  BankAccount mufasAccount = new BankAccount("Mufasa", 3000, "lion");
  BankAccount pumbAccount = new BankAccount("Pumba", 500, "boar");
  BankAccount timonAccount = new BankAccount("Timon", 400, "mongoose");
  BankAccount rafikiAccount = new BankAccount("Rafiki", 10000, "monkey");
  BankAccount zordonAccount = new BankAccount("Zordon", 0, "lion");

  @RequestMapping(value = "/bank")
  public String showAccount(Model model) {
    model.addAttribute("name", String.format("%s", simbAccount.getName()));
    model.addAttribute("balance", String.format("%.2f %s", simbAccount.getBalance(), "Zebra"));
    model.addAttribute("animalType", String.format("%s", simbAccount.getAnimalType()));
    return "bank";
  }

  @RequestMapping(value = "/enjoy")
  public String htmlSubmit(Model model) {
    model.addAttribute("htmlText", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "enjoy";
  }

  @RequestMapping(value = "/accounts")
  public String fillCharacter(Model model) {
    bank.add(simbAccount);
    mufasAccount.promote();
    bank.add(mufasAccount);
    bank.add(pumbAccount);
    bank.add(timonAccount);
    bank.add(rafikiAccount);
    zordonAccount.makeBadGuy();
    bank.add(zordonAccount);
    model.addAttribute("bankAccounts", bank);
  return "characters";
  }
}
