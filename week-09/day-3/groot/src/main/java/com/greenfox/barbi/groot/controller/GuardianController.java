package com.greenfox.barbi.groot.controller;

import com.greenfox.barbi.groot.Groot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping(value = "/groot")
  public Groot speakDearGroot(@RequestParam("message") String message) {
    Groot groot = new Groot(message);
    return groot;
  }
}
