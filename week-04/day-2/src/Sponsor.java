public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public Sponsor(String name, int age, String gender, String company, int hiredStudents) {
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    this("Jane Doe", 30, "female", "Google", 0);
  }

  public void introduce(){
    System.out.println("Hi, I'm " + name + " a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }
}
