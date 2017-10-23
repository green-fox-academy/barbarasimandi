import java.util.Scanner;

public class Game {
    static Deck d;
    int opponentScore;
    public enum Answer {yes, no}

  public Game() {
    d = new Deck();
    opponentScore = (int)(15 + Math.random() * 7);
  }

  public static String getNextStep() {
    System.out.println("Would you like another card?");
    Scanner sc = new Scanner(System.in);
    return sc.nextLine();
  }

  public static void main(String[] args) {
    Game game = new Game();

    int playerScore = 0;
    int rounds = 0;

    while (playerScore < 21 || Answer.valueOf(getNextStep()).equals(Answer.yes)) {
      playerScore += d.pullRandom().getValue();
      rounds++;
      if (rounds > 2 || playerScore > 21 || Answer.valueOf(getNextStep()).equals(Answer.no)) {
        break;
      }
    }

      if (playerScore > 21) {
        System.out.println("your scores are above 21. (" + playerScore + ") end of game" + "opponent's score: " + game.opponentScore);
      }
      else if (playerScore > game.opponentScore || playerScore == 21) {
        System.out.println("you won. your score: " + playerScore + " opponent's score: " + game.opponentScore);
      }
      else {
        System.out.println("opponent won. your score: " + playerScore + " opponent's score: " + game.opponentScore);
      }
  }
}
