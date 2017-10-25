package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
  String name;
  double balance;
  String animalType;
  boolean king;
  boolean goodGuy;

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    king = false;
    goodGuy = true;
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
}
