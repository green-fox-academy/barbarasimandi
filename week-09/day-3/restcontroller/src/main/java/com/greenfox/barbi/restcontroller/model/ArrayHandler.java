package com.greenfox.barbi.restcontroller.model;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandler {

  String what;
  List<Integer> numbers;

  public ArrayHandler(String what, List<Integer> numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public ArrayHandler() {
  }

  public Object getResultNumber() {
    if(what.equals("sum")) {
      Integer temp = 0;
      for (int i = 0; i < this.numbers.size() - 1; i++) {
        temp += numbers.get(i);
      }
      return new ResultNumber(temp);
    }

    else if (what.equals("multiply")) {
      Integer temp = 1;
      for (int i = 0; i <= this.numbers.size() - 1; i++) {
        temp *= numbers.get(i);
      }
      return new ResultNumber(temp);
    }

    else if (what.equals("double")) {
      List<Integer> temp = new ArrayList<>();
      for (int i = 0; i < this.numbers.size(); i++) {
        temp.add(numbers.get(i) * 2);
      }
      return new ResultNumberArray(temp);
    }
    return null;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

}
