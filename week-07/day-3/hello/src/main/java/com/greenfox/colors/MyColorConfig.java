package com.greenfox.colors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyColorConfig {

  @Bean
  public MyColor getRed() {
    return new RedColor();
  }

  @Bean
  public MyColor getGreen() {
    return new GreenColor();
  }
}
