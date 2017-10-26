package com.message.service.configuration;

import com.message.service.service.EmailService;
import com.message.service.service.MessageService;
import com.message.service.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

  @Bean
  public MessageService emailMessage(){
    return new EmailService();
  }


  public MessageService twitterMessage(){
    return new TwitterService();
  }

  @Bean
  public MessageProceeder proceeder() {
    return new MessageProceeder();
  }
}
