package com.message.service.configuration;

import com.message.service.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

  @Autowired
    MessageService service;

  public void processMessage(String message, String destination) {
    service.sendMessage(message, destination);
  }
}
