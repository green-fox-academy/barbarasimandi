package com.greenfox.frontend.model;

public class Appenda {

  String appended;

  public Appenda(String appended) {
    this.appended = appended.concat("a");
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
