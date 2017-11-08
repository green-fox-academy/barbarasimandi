package com.greenfox.barbi.restcontroller.service;

import com.greenfox.barbi.restcontroller.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogService {

  @Autowired
  LogRepository logRepository;

}
