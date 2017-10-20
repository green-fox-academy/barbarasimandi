import java.time.LocalDateTime;

public class Task {

  public String name;
  private int id;
  private static int taskCounter;
  private LocalDateTime createdAt;
  private LocalDateTime completedAt;


  public Task(String name) {
    this.name = name;
    id = getNextId();
    createdAt = LocalDateTime.now();
    completedAt = null;
  }

  public int getNextId() {
    ++taskCounter;
    return taskCounter;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime complete() {
    return completedAt = LocalDateTime.now();
  }

  public String isItCompleted() {
    if (completedAt != null && createdAt.isBefore(completedAt)) {
      return name + ", completed at: ";
    } else
      return name + ", not completed yet";
  }

  public int complitionTime() {
    return completedAt.getDayOfYear() - createdAt.getDayOfYear();
  }

  @Override
  public String toString() {
    if (completedAt == null) {
      return id + ": " + createdAt.toString()+ ", " + isItCompleted();
    } else {
      return id + ": " + createdAt.toString()+ ", " + isItCompleted() + completedAt.toString() + " It took " + complitionTime() + " days to finish this excercise";
    }
  }
}
