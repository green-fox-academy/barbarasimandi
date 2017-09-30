public class Teacher {

  Teacher(){
  }


  public void teach(Student student){
  student.learn();
  }

  public void answer(){
  }

  public static void main(String[] args) {
    Teacher teacher = new Teacher();
    Student student = new Student();
    teacher.answer();
    teacher.teach(student);
  }

//Create Student and Teacher classes
//Student
//learn()
//question(teacher) -> calls the teachers answer method
//Teacher
//teach(student) -> calls the students learn method
//answer()

}