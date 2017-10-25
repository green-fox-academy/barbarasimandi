package com.greenfoxacademy.springstart.models;

import java.awt.Color;
import java.util.Arrays;

public class Hello {
  static String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
  String actualHello;

  static String[] colors = {"red", "green", "blue", "cyan", "magenta", "yellow"};
  String actualColor;

  static String[] fontSize = {"42px", "30px", "60px", "33px", "52px", "31px", "42px", "86px"};
  String actualFontSize;

  public Hello() {
    actualHello = hellos[(int)(Math.random()*hellos.length)];
    actualColor = colors[(int)(Math.random()*colors.length)];
    actualFontSize = fontSize[(int)(Math.random()*fontSize.length)];
  }

  public String getActualHello() {
    return actualHello;
  }

  public String getActualColor() {
    return actualColor;
  }

  public String getActualFontSize() {
    return actualFontSize;
  }
}
