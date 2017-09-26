public class Mentor extends Person {

  String level;

  public Mentor(String name, int age, String gender, String level) {
    this.level = level;
  }

  public Mentor() {
    this("Jane Doe", 30, "female", "intermediate");
  }

  public String getGoal() {
    return "Educate brilliant junior software developers.";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + level + "mentor.");
  }
}
