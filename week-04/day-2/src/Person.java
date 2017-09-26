import com.sun.org.apache.xpath.internal.SourceTree;

public class Person {
  String name;
  int age;
  String gender;

  public Person(String name, int age, String gender){
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public Person() {
    this("", 0, "");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + "a " + age + "year old " + gender + ".");
  }

  public String getGoal() {
    return "My goal is: Live for the moment!";
  }



}
