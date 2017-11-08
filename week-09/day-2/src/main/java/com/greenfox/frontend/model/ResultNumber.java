package com.greenfox.frontend.model;

public class ResultNumber {

  Integer result;
  String what;

  public ResultNumber(Integer until, String what) {

    this.what = what;


    if (what.equals("sum")) {
      Integer temp = 0;
      for (int i = 1; i <= until; i++) {
        temp += i;
      }
      this.result = temp;
    }

    else if (what.equals("factor")) {
      Integer temp = 1;
      for (int i = 1; i <= until; i++) {
        temp *= i;
      }
      this.result = temp;
    }
  }

  public ResultNumber() {
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }
}
