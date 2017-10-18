public class GameApp {

  public String hello() {
    return "hello";
  }

  public static void main(String[] args) {
    Deck deck = new Deck();

    Hand player1 = new Hand("Gyuri", deck);
    player1.deal();
    System.out.println(player1.toString());


    Hand player2 = new Hand("Klarikam", deck);
    player2.deal();
    System.out.println(player2.toString());

  }
}
