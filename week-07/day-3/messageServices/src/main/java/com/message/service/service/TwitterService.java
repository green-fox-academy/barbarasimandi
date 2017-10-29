package com.message.service.service;

import com.message.service.service.MessageService;

public class TwitterService implements MessageService {

  @Override
  public void sendMessage(String message, String user) {
    System.out.println("Twitter message: " + message + "To: " + user);
  }
}
