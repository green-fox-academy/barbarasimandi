package com.greenfox.club.model;

public class Drink {
    public String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Drink(String name) {

    this.name = name;
  }

  @Override
  public String toString() {
    return this.name.toString();
  }
}
