import java.util.ArrayList;

public class Game {

  Hand player1;

  public Game(Hand player1) {
    this.player1 = player1;
  }

  public String basicCase(Hand player1) {
    String combo = "";
    ArrayList<Card> temp = new ArrayList<>();
    for (int i = 0; i < player1.player.size() - 1; i++) {
      for (int j = 0; j < player1.player.size(); j++) {
        if (player1.player.get(i).getValue().equals(player1.player.get(j).getValue())) {
          temp.add
        }
//        else if () {
//          combo = "Two pairs";
//        }

      }

    } return combo;
  }

}
