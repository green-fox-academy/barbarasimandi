package com.greenfox.barbi.groot.exception;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

  @org.springframework.web.bind.annotation.ExceptionHandler(MissingServletRequestParameterException.class)
  public GrootError giveError(MissingServletRequestParameterException exception) {
    GrootError error = new GrootError();
    if (exception.getParameterName().equals("message")) {
      error.setError("I am Groot!");
    }
    return error;
  }
}
