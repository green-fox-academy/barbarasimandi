

public class TodoApp {

  public static void main(String[] args) {
//    FileManipulation myList = new FileManipulation();
//    myList.add("Walk the cat");
//    myList.add("Water plants");
//
//    System.out.println(myList.getTaskName(1));
//
//    myList.taskList.get(0).complete();
//
//    System.out.println(myList.getTaskName(1));

    ArgumentHandler taskMethod = new ArgumentHandler();
    taskMethod.inspectArgs(args[0]);



  }

}
