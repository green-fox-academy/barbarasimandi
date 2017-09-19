import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    try {
      Path filePath1 = Paths.get("src/reversed-lines.txt");
      List<String> content1 = Files.readAllLines(filePath1);
      List<String> normal = new ArrayList<>();

      for (int i = 0; i < content1.size(); i++) {
        for (int j = content1.get(i).length() - 1; j > 0; j--) {
          System.out.print(String.valueOf(content1.get(i).charAt(j)));
        }
        System.out.println();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}