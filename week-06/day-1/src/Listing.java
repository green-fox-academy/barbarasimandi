import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Listing {

  ListManipulating listManipulating = new ListManipulating();

  public void menu() {
    try {
      Path filePath = Paths.get("C:/greenfox/barbarasimandi-todo-app/src/Menu.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (String s : lines) {
        System.out.println(s);
      }
    } catch (IOException ex) {
      System.out.println("Unable to read file: Menu.txt");
    }
  }

  public void task() {
    try {
      Path filePath2 = Paths.get("C:/greenfox/barbarasimandi-todo-app/src/tasks.txt");
      List<String> lines2 = Files.readAllLines(filePath2);
      if (lines2.size() == 0) {
        System.out.println("No todos for today :)");
      } else {
        for (int i = 0; i < lines2.size(); i++) {
          if (lines2.get(i).charAt(0) == '+') {
            System.out.println((i + 1) + " - " + " [x] " + lines2.get(i).substring(1));
          }
          else {
            System.out.println((i + 1) + " - " + " [ ] " + lines2.get(i).substring(1));
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}



