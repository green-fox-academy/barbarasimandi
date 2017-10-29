package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.Bank;
import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BankAccountController {

  @Autowired
  Bank bank;

  @RequestMapping(value = "/one")
  public String showAccount(Model model) {
    model.addAttribute("name", String.format("%s", bank.bank.get(0).getName()));
    model.addAttribute("balance", String.format("%.2f %s", bank.bank.get(0).getBalance(), "Zebra"));
    model.addAttribute("animalType", String.format("%s", bank.bank.get(0).getAnimalType()));
    return "bank";
  }

  @RequestMapping(value = "/htmlception")
  public String htmlSubmit(Model model) {
    model.addAttribute("htmlText", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "enjoy";
  }

  @GetMapping(value = "/accounts")
  public String fillCharacter(Model model) {
    model.addAttribute("bankAccounts", bank.getBank());
    model.addAttribute("new_balance", new BankAccount());
    return "accounts";
  }

  @PostMapping(value = "/accounts")
  public String raiseBalance(@ModelAttribute BankAccount bankAccount) {
    for (BankAccount account : bank.getBank()) {
      if (account.getName().equals(bankAccount.getName())) {
        account.raiseWithTen();
      }
    }
    return "redirect:/accounts";
  }

  @PostMapping(value = "/new_balance")
  public String addNew(@ModelAttribute BankAccount bankAccount) {
    bank.addAcc(bankAccount);
    return "redirect:/accounts";
  }
}
