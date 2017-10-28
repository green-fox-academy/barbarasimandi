package com.greenfoxacademy.bankofsimba.model;

import java.util.Arrays;
import java.util.List;

public class Bank {


  public List<BankAccount> bank;

  public Bank() {
    bank = Arrays.asList(new BankAccount("Simba", 2000, "lion", false, true),
    (new BankAccount("Mufasa", 3000, "lion", true, true)),
    (new BankAccount("Pumba", 500, "boar", false, true)),
    (new BankAccount("Timon", 400, "mongoose", false, true)),
    (new BankAccount("Rafiki", 10000, "monkey", false, true)),
    (new BankAccount("Zordon", 0, "lion", false, false)));
  }

  public List<BankAccount> getAccounts() {
    return bank;
  }

  public BankAccount getByName(String inputName) {
    BankAccount bankAccount = new BankAccount();
    for (int i = 0; i < bank.size(); i++) {
      if (bank.get(i).name.equals(inputName)) {
        bankAccount = bank.get(i);
      }
    } return bankAccount;
  }

  public double raise(String inputName) {
    for (int i = 0; i < bank.size(); i++) {
      if (bank.get(i).name.equals(inputName)) {
        bank.get(i).raiseWithTen();
      }
    } return this.getByName(inputName).getBalance();
  }
}
