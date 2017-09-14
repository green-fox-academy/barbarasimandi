import java.util.Scanner;

public class GuessTheNumber {

  public static void main(String[] args) {
    System.out.println(guesss(8));
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8

  }
  public static int guesss(int numbie){

    Scanner scannie = new Scanner(System.in);
    System.out.println("Enter a number!");

    int guess = scannie.nextInt();

    for (int i = 0; i < guess; i++) {
      if (guess > numbie) {
        System.out.println("The stored number is lower.");
        System.out.println("Enter another number, you can have one more guess, so be more clever this time!");
        int guess2 = scannie.nextInt();

        if (guess2 != numbie) {
          System.out.println("The stored number is not that. :( ");
          break;
        }
        else {
          System.out.println("Congrats, you lucky! You found the number: " + numbie);
          break;
        }
        }
      else if (guess < numbie) {
        System.out.println("The stored number is higher now.");
        System.out.println("Enter another number, you can have one more guess, so be more clever this time!");
        int guess3 = scannie.nextInt();

        if (guess3 != numbie) {
              System.out.println("The stored number is not that. :( ");
              break;
        }
        else {
          System.out.println("Congrats, you lucky! You found the number: " + numbie);
          break;
        }
        }
      else {
          System.out.println("Congrats! You found the number: " + numbie);
          break;
      }
    } return numbie;
  }
}
