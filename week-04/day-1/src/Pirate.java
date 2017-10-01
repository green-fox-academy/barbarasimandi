import java.util.ArrayList;

public class Pirate {

  int intoxication;
  String name;
  ArrayList<String> pool;
  boolean alive;
  boolean asleep;

  public Pirate(int intoxication, String name, boolean alive, boolean asleep) {
    this.intoxication = intoxication;
    this.name = name;
    this.alive = alive;
    this.asleep = asleep;
 }

  public Pirate () {
    this((int) (Math.random()*10), getRandomString(), true, false);
    pool = new ArrayList<>();
  }

  static String getRandomString(){
    int r = (int) (Math.random()*20);
    String name = new String [] {"Seabury 'Weasel' Cooper","Delvin 'The Legend' Camden",
        "Ridge 'Adventure' Denholm","Huntington 'Imposter' Loki", "Lytton 'Hunter' Tempest",
        "Tandie 'Reaper' Stampes", "Mina 'The Shadow' Kimberly", "Stanwood 'The Sour' Drace",
        "Erland 'The Cook' Noonan", "Curtis 'Intrepid' Nicholai", "Westerly 'Pleasant' Mathian",
        "Waller 'Swab' Sidney", "Cameron 'Naive' Preston", "Yule 'White Hair' Karayan",
        "Nesbit 'No-Tongue' Amaranth", "Long 'The Snake' Kimberly", "Brandon 'Foolish' Hornsby",
        "Manning 'The Handsome' Smithies", "Nedra 'Gentle Heart' Addington", "Doris 'The Unseen' Nightshade"}[r];
    return name;
  }

 public void drinkSomeRum() {
    intoxication++;
   System.out.println("Intoxication level: " + intoxication);
 }

 public String howIsItGoing() {
   if (intoxication < 4) {
     return "Pour me anudder!";
   } else {
     asleep = true;
     return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
   }
 }

 public boolean die() {
   return alive = false;
 }

 public final void brawl(Pirate anotherPirate) {

   if (!this.alive || !anotherPirate.alive) {
     System.out.println("One of the pirates is dead. the fight is impossible.");
   }
   else if (this.alive && anotherPirate.alive) {
     System.out.println("The outcome of the brawl:");
     int random = (int) (Math.random() * 3);
     if (random == 1) {
       this.die();
       System.out.println("pirate died");
     } else if (random == 2) {
       anotherPirate.die();
       System.out.println("opponent died.");
     } else {
       this.asleep = true;
       anotherPirate.asleep = true;
       System.out.println("both asleep");
     }
   }
 }
  @Override
  public String toString() {
    return name + "\nintoxication = " + intoxication + "\n";
  }
}
