import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {
    // create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // it should print "fail" if the parameter is 0

    System.out.println("Enter a divisor!");
    Scanner myScan = new Scanner(System.in);
    int num = myScan.nextInt();

    divideByZero(num);
  }

  public static int divideByZero(int num) {

    int result = 0;

    try {
      result = 10 / num;
    } catch (ArithmeticException ex) {
      System.out.println("fail");
    }

    System.out.println(result);
    return result;
  }
}