import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileManipulation {

  //Path filePath = Paths.get("C:/greenfox/barbarasimandi-todo-app/src/tasks.txt");
  ArrayList<Task> taskList;

  public FileManipulation() {
    taskList = new ArrayList<>();
  }

  public void add(String task) {
    taskList.add(new Task(task));
  }

  public Task getTaskName(int index) {
    return taskList.get(index-1);
  }
}
