package com.message.service.service;

public class EmailService implements MessageService {

  @Override
  public void sendMessage(String message, String user) {
    System.out.println("E-mail message: " + message + "To: " + user);
  }
}
