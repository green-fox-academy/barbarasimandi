public abstract class Animal {
    String name;
    String noises;
    int age;
    String gender;
    int numberOfLegs;

    public Animal(String name) {
      this.name = name;
      age = (int)(Math.random()*100);
      gender = new String[] {"male", "female"} [(int)(Math.random()*2)];
    }

    public String greet() {
      return noises + ", translation: hi, my name is: " + name;
    }

    abstract String wantChild();

    abstract void move();

    public String getName() {
    return name;
    }
  }
