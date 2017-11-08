package com.greenfox.frontend.model;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandler {

  Integer result;
  String what;
  List<Integer> numbers;

  public ArrayHandler(String what, List<Integer> numbers) {
    this.what = what;
    this.numbers = numbers;

    if (what.equals("sum")) {
      Integer temp = 0;
      for (int i = 1; i <= numbers.size(); i++) {
        temp += i;
      }
      this.result = temp;
    }

    else if (what.equals("factor")) {
      Integer temp = 1;
      for (int i = 1; i <= numbers.size(); i++) {
        temp *= i;
      }
      this.result = temp;
    }

    else if (what.equals("double")) {
      List<Integer> temp = new ArrayList<>();
      for (int i = 0; i < numbers.size(); i++) {
        temp.add(numbers.get(i) * 2);
      }
    }
  }

  public ArrayHandler() {
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

//  public Integer sum() {
//
//  }
}
