public class Student extends Person {
  String previousOrganization;
  int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization, int skippedDays) {
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    this("Jane Doe", 30, "female", "The School of Life", 0);
  }

  public String getGoal() {
    return "Be a junior software developer.";
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }
}
