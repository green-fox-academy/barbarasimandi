package com.greenfox.club.model;

public enum Drink {
  BEER, ORANGE_JUICE, WATER;

  Drink() {
  }

  public String getName() {
    return Drink.values().toString();
  }
}
