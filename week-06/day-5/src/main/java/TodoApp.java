
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class TodoApp {

  public static void main(String[] args) {
    FileManipulation myList = new FileManipulation();
    myList.add("Walk the cat");
    myList.add("Water plants");
    System.out.println(myList.getTaskName(1));
  }

}
