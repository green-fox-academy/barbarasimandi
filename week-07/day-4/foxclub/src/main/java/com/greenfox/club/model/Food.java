package com.greenfox.club.model;

public enum Food {
  PURPURBREAD, APPLE, LANGOS;

  Food() {
  }

  public String getName() {
    return Food.values().toString();
  }

}
