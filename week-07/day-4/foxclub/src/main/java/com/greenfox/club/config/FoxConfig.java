package com.greenfox.club.config;

import com.greenfox.club.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxConfig {

  @Bean
  public Fox foxBean() {
    return new Fox();
  }
}
