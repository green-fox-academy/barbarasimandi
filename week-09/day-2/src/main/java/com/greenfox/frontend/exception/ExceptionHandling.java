package com.greenfox.frontend.exception;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandling {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public Error giveError(MissingServletRequestParameterException exception) {
    Error error = new Error();
    if (exception.getParameterName().equals("input")) {
      error.setError("Please provide an input!");
    } else if (exception.getParameterName().equals("name")) {
      error.setError("Please provide a name!");
    } else if (exception.getParameterName().equals("title")) {
      error.setError("Please provide a title!");
    }
    return error;
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public Error setError(HttpMessageNotReadableException httpException) {
    Error error = new Error();
    error.setError("Please provide a number!");
    return error;
  }

}
