import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListManipulating implements Comparable<ArrayList<String>> {

  boolean completed;
  Path filePath = Paths.get("C:/greenfox/barbarasimandi-todo-app/src/tasks.txt");

  public ListManipulating() {
    this.completed = false;
  }

  public void append(String input) {
    try {
      List<String> lines = new ArrayList<>();
      lines.add("-" + input);
      Files.write(filePath, lines, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void remove(String indexString) {
    int index = Integer.parseInt(indexString);
    try {
      ArrayList<String> lines = new ArrayList<>(Files.readAllLines(filePath));
      lines.remove(lines.get(index - 1));
      Files.write(filePath, lines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void complete(String toBeCompleted) {
    completed = true;
    int index = Integer.parseInt(toBeCompleted);
    try {
      ArrayList<String> lines = new ArrayList<>(Files.readAllLines(filePath));
      for (int i = 0; i < 1; i++) {
        if (completed) {
          lines.set(index - 1, "+" + lines.get(index-1).substring(1));
        }
      }
      Files.write(filePath, lines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public int compareTo(ArrayList<String> lines) {

    try {
      lines = new ArrayList<>(Files.readAllLines(filePath));
    }
    catch (IOException e) {
      e.printStackTrace();
    }

    for (int i = 0; i < lines.size() - 1; i++) {
      for (int j = i + 1; j < lines.size(); j++) {

        int compareTask1 = lines.get(i).length();
        int compareTask2 = lines.get(j).length();

        int result = compareTask1 - compareTask2;
      }
    }
    return result;
  }
}
