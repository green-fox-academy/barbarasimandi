package com.message.service.configuration;

import com.message.service.service.EmailService;
import com.message.service.service.MessageService;
import com.message.service.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MessageConfiguration {

  @Bean
  @Primary
  public MessageService emailMessage(){
    return new EmailService();
  }

  @Bean
  public MessageService twitterMessage(){
    return new TwitterService();
  }

  @Bean
  public MessageProceeder proceeder() {
    return new MessageProceeder();
  }
}
