package com.greenfox.frontend.controller;

import com.greenfox.frontend.model.Appenda;
import com.greenfox.frontend.model.DoUntil;
import com.greenfox.frontend.model.Doubling;
import com.greenfox.frontend.model.Greeting;
import com.greenfox.frontend.model.Until;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubling doubleIt(@RequestParam(value = "input", required = true) Integer input) {
    Doubling doubling = new Doubling(input);
    return doubling;
  }

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public Greeting greet(
      @RequestParam(value = "name", required = true) String name,
      @RequestParam(value = "title", required = true) String title) {
    Greeting greeting = new Greeting(name, title);
    return greeting;
  }

  @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
  public Appenda append(@PathVariable String appendable) {
    Appenda appenda = new Appenda(appendable);
    return appenda;
  }

  @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
  public DoUntil doIt(@PathVariable String what, @RequestBody Until until) {
    DoUntil doUntil = new DoUntil(until.getUntil(), what);
    return doUntil;
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

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public Error setError(HttpMessageNotReadableException httpException) {
    Error error = new Error();
    error.setError("Please provide a number!");
    return error;
  }
}
