import java.util.Scanner;

public class ParametricAverage {

  public static void main(String[] args) {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    System.out.println("Enter a number!");
    Scanner myScan = new Scanner(System.in);
    int num = myScan.nextInt();

    double sum = 0;

    for (int i = 0; i < num; i++) {
      System.out.println("Please, enter an integer!");
      sum += myScan.nextInt();
    }
    System.out.println("The sum of these numbers is: " + sum);

    double average = sum / num;
    System.out.println("The average of these numbers is: " + average);
  }
}
