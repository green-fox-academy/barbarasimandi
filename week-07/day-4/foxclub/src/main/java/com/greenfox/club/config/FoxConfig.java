package com.greenfox.club.config;

import com.greenfox.club.model.Drink;
import com.greenfox.club.model.Food;
import com.greenfox.club.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoxConfig {

  Food food;
  Drink drink;

  @Bean
  public Fox foxBean() {
    return new Fox();
  }

  public void feed(Fox fox) {
    fox.setFood("banana");
    fox.getDrink("tea");
  }
}
