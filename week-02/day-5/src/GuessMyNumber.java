import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {

  public static void main(String[] args) {
  guesss();
  }

  public static int guesss() {

    Random num = new Random();
    int numbie = num.nextInt(100) + 1;

    /*System.out.println(numbie);*/

    System.out.println("Enter the number of your lives!");
    Scanner scannie = new Scanner(System.in);
    int lives = scannie.nextInt();

    int livesLeft = lives;

    for (int i = 0; i < lives; i++) {
      System.out.println("You have " + livesLeft + " lives left!");
      System.out.println("Enter a number!");
      int guess = scannie.nextInt();

      if (guess > numbie) {
        System.out.println("The number you're looking for is lower.");
      }

      else if (guess < numbie) {
        System.out.println("The number you're looking for is higher.");
      }

      else {
          System.out.println("Congrats, you lucky! You found the number: " + numbie);
          break;
       }

       livesLeft -= 1;
        if (livesLeft == 0) {
          System.out.println("Game Over. You don't have any more lives left :(");
          }
    } return numbie;
  }
}
