import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileManipulation {

  Path filePath = Paths.get("C:/greenfox/barbarasimandi/week-06/day-5/src/main/java/tasks.txt");
  Path outputFilePath = Paths.get("C:/greenfox/barbarasimandi/week-06/day-5/src/main/java/output.txt");
  List<Task> taskList;
  List<String> lines;
  List<String> taskNames;

  public FileManipulation() {
    taskList = new ArrayList<>();
  }
  public void add(String task) {

    System.out.println("adding");

    taskList.add(new Task(task));
    taskNames = new ArrayList<>();

    try {
      lines = Files.readAllLines(filePath);

      for (int i = 0; i < lines.size(); i++) {
        task = lines.get(i);
        taskNames.add(task);
      }

      Files.write(outputFilePath, taskNames, StandardOpenOption.APPEND);

    } catch (Exception e) {
      System.out.println("Nope");
    }
  }

  public Task getTaskName(int index) {
    return taskList.get(index-1);
  }
}
