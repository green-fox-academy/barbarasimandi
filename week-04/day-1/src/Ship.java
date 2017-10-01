import java.util.ArrayList;

public class Ship {

  ArrayList<Pirate> crew = new ArrayList<>();
  String name;
  Captain captain;

  public Ship(String name) {
    this.name = name;
  }

  public Ship() {
    this.name = getRandomString();
  }

  static String getRandomString(){
    int r = (int) (Math.random()*10);
    String name = new String [] {"Black Pearl","Queen Anne’s Revenge", "Whydah","Royal Fortune", "Mary Celeste",
        "Happy Delivery", "The Golden Hind", "Rising Sun", "Speaker", "Revenge"}[r];
    return name;
  }


  public void fillShip(Captain captain) {
    // filling up with one captain and random pirates.

    crew.add(captain);

    int random = (int) (Math.random()*20);
    for (int i = 0; i < random; i++) {
      crew.add(new Pirate());
    }
  }

  public int aliveCrew() {
    int aliveMembers = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).alive) {
        aliveMembers++;
      }
    }
    return aliveMembers;
  }

  public Integer score() {
    captain = new Captain();
    int score = 0;
    for (Pirate p: crew) {
      if (p.alive) {
        score++;
      }
    } return (score - this.captain.intoxication);
  }

  public boolean battle(Ship anotherShip) {
    System.out.println("Two ships are battling");
    int rand = (int)(Math.random() * this.aliveCrew());
    int rand1 = (int) (Math.random() * anotherShip.aliveCrew());

    if (this.score() > anotherShip.score()) {
      int aliveMembersAfterBattle = anotherShip.aliveCrew() - rand1;
      System.out.println("Statistics of the loser ship is: " + aliveMembersAfterBattle + ", deaths: " + rand1);
      return true;
    }
    else {
      int aliveMembersAfterBattle1 = this.aliveCrew() - rand;
      System.out.println("Statistcs of the loser ship is: " + aliveMembersAfterBattle1 + ", deaths: " + rand);
      return false;
    }
  }

  @Override
  public String toString() {
    String result = "";
    for(int i = 0; i < crew.size(); i++) {
      result += crew.get(i);
    }
    return this.name + result;
  }
}
