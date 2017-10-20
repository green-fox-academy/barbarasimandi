import java.time.LocalDate;

public class Task {

  private String name;
  private int id;
  private static int taskCounter;
  private LocalDate createdAt;
  private LocalDate completedAt;

  public Task(String name) {
    this.name = name;
    id = getNextId();
    createdAt = LocalDate.now();
    completedAt = null;
  }

  public int getNextId() {
    ++taskCounter;
    return taskCounter;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public LocalDate complete() {
    return completedAt = LocalDate.now();
  }

  @Override
  public String toString() {
    if (completedAt == null) {
      return id + ": " + createdAt.toString()+ ", " + name + ", completion: not completed yet";
    } else {
      return id + ": " + createdAt.toString()+ ", " + name + ", completion: " + completedAt.toString();
    }
  }
}
