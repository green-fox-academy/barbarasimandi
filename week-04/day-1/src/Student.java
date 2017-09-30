public class Student {

  Student() {
  }

  public void learn(){
  }

  public void question(Teacher teacher){
    teacher.answer();
  }

  public static void main(String[] args) {
    Teacher teacher = new Teacher();
    Student student = new Student();
    student.learn();
    student.question(teacher);
  }
}
