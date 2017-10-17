import java.util.ArrayList;

public class ClassMain {

  public static void main(String[] args) {

    Student john = new Student("John Doe", 20, "male", "BME");

    Student johnTheClone = john.clone();

    System.out.println(johnTheClone.name + ", " + johnTheClone.age + ", " + johnTheClone.gender + ", " + johnTheClone.previousOrganization);

  }
}
