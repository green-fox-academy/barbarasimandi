package com.greenfoxacademy.bankofsimba;

import com.greenfoxacademy.bankofsimba.model.Bank;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {

  @Bean
  public Bank newBank() {
    return new Bank();
  }
}
