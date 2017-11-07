package com.greenfox.frontend.controller;

import com.greenfox.frontend.model.Doubling;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubling doubling(@RequestParam(value = "input", required = true) Integer input) {
    Doubling doubling = new Doubling(input);
    return doubling;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public DoublingError doublingError() {
    DoublingError error = new DoublingError();
    error.setError("Please provide an input!");
    return error;
  }
}
