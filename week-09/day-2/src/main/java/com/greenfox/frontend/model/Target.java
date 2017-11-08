package com.greenfox.frontend.model;

public class Target {
    Integer until;

  public Target(Integer until) {
    this.until = until;
  }

  public Target() {
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }

  public ResultNumber getResultNumber(String what) {

    if(what.equals("sum")) {
      Integer temp = 0;
      for (int i = 2; i <= this.until; i++) {
        temp += i;
      }
      return new ResultNumber(temp);
    }

    else if (what.equals("factor")) {
      Integer temp = 1;
      for (int i = 1; i <= this.until; i++) {
        temp *= i;
      }
      return new ResultNumber(temp);
    }
    return null;
  }
}
