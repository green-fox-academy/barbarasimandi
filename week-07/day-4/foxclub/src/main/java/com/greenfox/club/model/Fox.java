package com.greenfox.club.model;

import java.util.List;

public class Fox {
    String name;
    List<Trick> listOfTricks;
    Food food;
    Drink drink;

  public Fox() {
  }

  public Fox(String name) {
    this.name = name;
  }
}
