package com.greenfox.frontend.controller;

import com.greenfox.frontend.model.Doubling;
import com.greenfox.frontend.model.Greeting;
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

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public Greeting greeting(
      @RequestParam(value = "name", required = true) String name,
      @RequestParam(value = "title", required = true) String title) {
    Greeting greeting = new Greeting(name, title);
    return greeting;
  }

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
}
