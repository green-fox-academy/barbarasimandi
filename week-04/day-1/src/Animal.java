public class Animal {
  int hunger;
  int thirst;

  //Create Animal class
  //Every animal has a hunger value, which is a whole number
  //Every animal has a thirst value, which is a whole number
  //when creating a new animal object these values are created with the default 50 value
  //Every animal can eat() which decreases their hunger by one
  //Every animal can drink() which decreases their thirst by one
  //Every animal can play() which increases both by one

  public Animal () {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    hunger -= 10;
  }

  public void drink() {
    thirst -= 1;
  }

  public void play() {
    hunger += 1;
    thirst += 1;
  }

  public static void main(String[] args) {
    Animal cica = new Animal();
    cica.play();
    cica.play();
    cica.play();
    cica.play();
    cica.eat();
    cica.drink();

    System.out.println("I am at " + cica.hunger + "th level of hunger, and " + cica.thirst + "th level of thirst. Pet me!");
  }

}
