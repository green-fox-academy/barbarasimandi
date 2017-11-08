package com.greenfox.barbi.restcontroller.controller;

import com.greenfox.barbi.restcontroller.model.Appenda;
import com.greenfox.barbi.restcontroller.model.ArrayHandler;
import com.greenfox.barbi.restcontroller.model.Doubling;
import com.greenfox.barbi.restcontroller.model.Greeting;
import com.greenfox.barbi.restcontroller.model.ResultNumber;
import com.greenfox.barbi.restcontroller.model.Target;
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
  public ResultNumber sumOrMultiply(@PathVariable String what, @RequestBody Target target) {
    ResultNumber resultNumber = target.getResultNumber(what);
    return resultNumber;
  }

  @RequestMapping(value = "/arrays", method = RequestMethod.POST)
  public Object handleTheArray(@RequestBody ArrayHandler arrayHandler) {
    Object result = arrayHandler.getResultNumber();
    return result;
  }
}