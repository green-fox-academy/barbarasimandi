import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    calculator();
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations:
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
  }

  public static void calculator() {
  Scanner myScan = new Scanner(System.in);

  System.out.println("Please enter in the type of operation you'd like to work with!");
  String operation = myScan.nextLine();

  System.out.println("Enter the first operand");
  int a = myScan.nextInt();

  System.out.println("Enter the second operand");
  int b = myScan.nextInt();


    if (operation.equals("+")) {
      int result = a + b;
      System.out.println("The result is: " + result);
    }
    else if (operation.equals("-")) {
      int result = a - b;
      System.out.println("The result is: " + result);
    }
    else if (operation.equals("*")) {
      int result = a * b;
      System.out.println("The result is: " + result);
    }
    else if (operation.equals("/")) {
      int result = a / b;
      System.out.println("The result is: " + result);
    }
  }
}
