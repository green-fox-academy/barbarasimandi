public class Mammal extends Animal {

    public Mammal(String name) {
      super(name);
      this.noises = "hurrdurr";
      this.numberOfLegs = 4;
    }

    public String wantChild() {
      return "want a child from an uterus";
    }

    public void move() {
      System.out.println("walks");
    }
  }
