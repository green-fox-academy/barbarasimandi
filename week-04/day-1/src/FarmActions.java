public class FarmActions {
  public static void main(String[] args) {

    Farm farm = new Farm(4);

    Animal dinosaur = new Animal("dino");
    Animal cow = new Animal("cow");
    Animal pig = new Animal("pig");
    Animal chicken = new Animal("chicken");
    Animal dog = new Animal("dog");

    farm.breed(dinosaur);
    farm.breed(cow);
    farm.breed(pig);
    farm.breed(chicken);
    farm.breed(dog);

    System.out.println("Welcome to my farm! My animals are: " + "\n" + farm);
    System.out.println("My farm is able to hold " + farm.slot + " animals right now, so dog had to go to another one." + "\n");

    dinosaur.eat();
    dinosaur.eat();
    dinosaur.eat();
    dinosaur.drink();
    cow.play();
    cow.play();
    cow.play();
    cow.play();
    pig.play();
    pig.play();
    pig.play();
    chicken.play();
    chicken.play();

    System.out.println("After feeding, giving water to, and playing with my animals their status right now is: ");

    System.out.println(dinosaur.name + "'s hunger is at the level: " + dinosaur.hunger);
    System.out.println(cow.name + "'s hunger is at the level: " + cow.hunger);
    System.out.println(pig.name + "'s hunger is: " + pig.hunger);
    System.out.println(chicken.name + "'s hunger is at the level: " + chicken.hunger + "\n");

    farm.slaughter();
    System.out.println("I'd like to cook for my whole village, so I slaughter the one which can feed everyone(the heaviest). "
        + "After slaughtering, my farm has the following animals: \n" + farm);

    farm.slaughter();
    System.out.println("After another slaughter I only have 2 animals left \n" + farm);


    Animal doge = new Animal("doge");
    farm.breed(doge);
    farm.breed(dog);

    System.out.println(dog.name + " found a friend last night, and right now they have the space to come back. Now I own the following animals: \n" + farm);
  }
}
