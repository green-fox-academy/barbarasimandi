package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  static AtomicLong idIncrementer;
  long id;
  String content;

  public Greeting(String content) {
    if (idIncrementer == null) {
      idIncrementer = new AtomicLong();
    }
    id = idIncrementer.incrementAndGet();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
