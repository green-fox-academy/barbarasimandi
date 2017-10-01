public class BattleApp {

  public static void main(String[] args) {
    /*Pirate pirate = new Pirate();
    Pirate pirratte = new Pirate();
    pirate.drinkSomeRum();

    pirate.die();
    pirate.brawl(pirratte);*/

    Parrot buddy = new Parrot();
    System.out.println(buddy.wisdom());

    Captain charlesII = new Captain("Charles II");
    Captain williamKidd = new Captain("William Kidd");

    Ship fancy = new Ship("Fancy");
    fancy.fillShip(charlesII);
    System.out.println(fancy);


    Ship adventureGalley = new Ship("Adventure Galley");
    adventureGalley.fillShip(williamKidd);
    System.out.println(adventureGalley);

    System.out.println("The numbers: " + fancy.aliveCrew() + " and " + adventureGalley.aliveCrew());
    System.out.println(fancy.battle(adventureGalley));


  }
}
