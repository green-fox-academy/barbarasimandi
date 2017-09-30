public class Pirate {

  int intoxication;
  boolean alive;
  boolean asleep;

  public Pirate(int intoxication, boolean alive, boolean asleep) {
    this.intoxication = intoxication;
    this.alive = alive;
    this.asleep = asleep;
 }

 public Pirate () {
    this(0, true, false);
 }

 public void drinkSomeRum() {
    intoxication++;
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
   int random = (int) (Math.random() * 3);
   if (!this.alive || !anotherPirate.alive) {
     System.out.println("both pirates are dead. the fight is impossible.");
   }
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
