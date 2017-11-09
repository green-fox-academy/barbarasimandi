package com.greenfox.barbi.groot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Groot {

  @JsonInclude(Include.NON_EMPTY)
  String received;

  @JsonInclude(Include.NON_NULL)
  String translated;

  public Groot(String received) {
    this.received = received;
    translated = received.equals("") ? null : "I am Groot!";
  }

  public Groot() {
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }
}
