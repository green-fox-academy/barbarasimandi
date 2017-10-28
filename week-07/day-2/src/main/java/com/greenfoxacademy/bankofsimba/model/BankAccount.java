package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

  public String name;
  public double balance;
  public String animalType;
  public boolean king;
  public boolean goodGuy;

  public BankAccount(String name, double balance, String animalType, boolean king,
      boolean goodGuy) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.king = king;
    this.goodGuy = goodGuy;
  }

  public BankAccount() {
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public boolean isKing() {
    return king;
  }

  public boolean promote() {
    return king = true;
  }

  public boolean isGoodGuy() {
    return goodGuy;
  }

  public boolean makeBadGuy() {
    return goodGuy = false;
  }

  public String balanceToString() {
    return String.format("%.2f %s", balance, "Zebra");
  }

  public void raiseWithTen() {
    if (isKing()) {
      setBalance((int) (getBalance() + 100));
    } else {
      setBalance((int) (getBalance() + 10));
    }
  }
}
