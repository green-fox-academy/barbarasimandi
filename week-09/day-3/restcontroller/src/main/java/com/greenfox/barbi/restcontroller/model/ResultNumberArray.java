package com.greenfox.barbi.restcontroller.model;

import java.util.List;

public class ResultNumberArray {

  List<Integer> result;

  public ResultNumberArray(List<Integer> result) {
    this.result = result;
  }

  public ResultNumberArray() {
  }

  public List<Integer> getResult() {
    return result;
  }

  public void setResult(List<Integer> result) {
    this.result = result;
  }
}
