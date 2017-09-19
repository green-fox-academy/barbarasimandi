import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {
    // create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // it should print "fail" if the parameter is 0

    divideByZero(0);
  }

  public static void divideByZero(int num) {

    try {
      int result = 10 / num;
    } catch (ArithmeticException ex) {
      System.out.println("fail");
    }
  }
}