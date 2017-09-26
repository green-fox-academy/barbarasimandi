import java.util.ArrayList;
import java.util.List;

public class PallidaClass {
  String className;
  List<Student> students;
  List<Mentor> mentors;

  public PallidaClass(String className) {
    this.className = className;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent(Student lilFox) {
    students.add(lilFox);
  }

  public void addMentor(Mentor bigFox) {
    mentors.add(bigFox);
  }

  public void info() {
    System.out.println("PallidaClass " + className + " class has " + students.size() + " students and " + mentors.size() + "mentors.");
  }
}
