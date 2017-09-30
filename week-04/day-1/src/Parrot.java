public class Parrot {

  String name;

  public Parrot(String name){
  this.name = name;
  }
  public Parrot(){
    this("Paulie");
  }

  public String wisdom() {
    int rand = (int) (Math.random() * 5);
    if (rand == 0) {
      return "Life is a shipwreck, but we must not forget to sing in the lifeboats -Voltaire";
    }
    else if (rand == 1) {
      return "It doesn’t matter where you are, you are nowhere compared to where you can go.";
    }
    else if (rand == 2) {
      return "You drown not by falling into a river, but by staying submerged in it. -Paulo Coelho";
    }
    else if (rand == 3) {
      return "You can't stop the future, you can't rewind the past \n"
          + "The only way to learn the secret \n"
          + "is to press play. ";
    }
    return "Be brave. Take risks. Nothing can substitute experience. \n"
        + "-Paulo Coelho ";
  }
}
