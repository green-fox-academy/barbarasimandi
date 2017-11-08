package com.greenfox.barbi.restcontroller.model;

public class Doubling {
    Integer received;
    Integer result;

  public Doubling(Integer received) {
    this.received = received;
    result = received * 2;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
