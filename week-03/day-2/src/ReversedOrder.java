import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt

    try {
    Path filePath1 = Paths.get("src/reversed-order.txt");
    List<String> content = Files.readAllLines(filePath1);


    for (int i = content.size() - 1; i > 0; i--) {
      for (int j = 0; j < (content.get(i).length() - 1); j++) {
        System.out.print(String.valueOf(content.get(i).charAt(j)));
        }
      System.out.println();
      }

    } catch (IOException e) {
      System.out.println("That's all, folks!");

    }
  }
}
