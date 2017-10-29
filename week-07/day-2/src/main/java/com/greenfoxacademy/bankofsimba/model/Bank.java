package com.greenfoxacademy.bankofsimba.model;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Bank {

  public List<BankAccount> bank;

  public Bank() {
    bank = new ArrayList<>();
    bank.add(new BankAccount("Simba", 2000, "lion", false, true));
    bank.add(new BankAccount("Mufasa", 3000, "lion", true, true));
    bank.add(new BankAccount("Pumba", 500, "boar", false, true));
    bank.add(new BankAccount("Timon", 400, "mongoose", false, true));
    bank.add(new BankAccount("Rafiki", 10000, "monkey", false, true));
    bank.add(new BankAccount("Zordon", 0, "lion", false, false));
  }


  public List<BankAccount> getBank() {
    return bank;
  }


  public void setBank(List<BankAccount> bank) {
    this.bank = bank;
  }

  public void addAcc(BankAccount bankAccount) {
    bank.add(bankAccount);
  }
}
