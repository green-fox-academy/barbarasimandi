package com.greenfox.barbi.restcontroller.controller;

import com.greenfox.barbi.restcontroller.model.Appenda;
import com.greenfox.barbi.restcontroller.model.ArrayHandler;
import com.greenfox.barbi.restcontroller.model.Doubling;
import com.greenfox.barbi.restcontroller.model.Greeting;
import com.greenfox.barbi.restcontroller.model.Log;
import com.greenfox.barbi.restcontroller.model.LogHistory;
import com.greenfox.barbi.restcontroller.model.ResultNumber;
import com.greenfox.barbi.restcontroller.model.Target;
import com.greenfox.barbi.restcontroller.repository.LogRepository;
import com.greenfox.barbi.restcontroller.service.LogService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  LogService logService;

  @Autowired
  LogRepository logRepository;

  @GetMapping(value = "/doubling")
  public Doubling doubleIt(@RequestParam(value = "input") Integer input, HttpServletRequest request) {
    Log log = new Log(request);
    logRepository.save(log);
    Doubling doubling = new Doubling(input);
    return doubling;
  }

  @GetMapping(value = "/greeter")
  public Greeting greet(@RequestParam(value = "name") String name, @RequestParam(value = "title") String title, HttpServletRequest request) {
    Log log = new Log(request);
    logRepository.save(log);
    Greeting greeting = new Greeting(name, title);
    return greeting;
  }

  @GetMapping(value = "/appenda/{appendable}")
  public Appenda append(@PathVariable String appendable, HttpServletRequest request) {
    Log log = new Log(request);
    logRepository.save(log);
    Appenda appenda = new Appenda(appendable);
    return appenda;
  }

  @PostMapping(value = "/dountil/{what}")
  public ResultNumber sumOrMultiply(@PathVariable String what, @RequestBody Target target, HttpServletRequest request) {
    Log log = new Log(request);
    logRepository.save(log);
    ResultNumber resultNumber = target.getResultNumber(what);
    return resultNumber;
  }

  @PostMapping(value = "/arrays")
  public Object handleTheArray(@RequestBody ArrayHandler arrayHandler, HttpServletRequest request) {
    Log log = new Log(request);
    logRepository.save(log);
    Object result = arrayHandler.getResultNumber();
    return result;
  }

  @GetMapping("/log")
  public LogHistory getLogs() {
    List<Log> entries = new ArrayList<>();
    for (Log entry: logRepository.findAll()) {
      entries.add(entry);
    }
    LogHistory history = new LogHistory(entries, entries.size());
    return history;
  }
}
