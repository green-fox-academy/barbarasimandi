import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    // The list to be returned has to be an ArrayList, because its size will be changed.

    try {
      Path filePath1 = Paths.get("src/duplicated-chars.txt");
      List<String> content1 = Files.readAllLines(filePath1);
      List<String> listOfReducedStringValues = new ArrayList<>();

      for (int i = 0; i < content1.size(); i++) {
        for (int j = 0; j < content1.get(i).length() - 1; j++) {
          if (content1.get(i).charAt(j) == content1.get(i).charAt(j + 1)) {
            System.out.print(String.valueOf(content1.get(i).charAt(j)));
          }
        }System.out.println();
      }
    } catch (IOException e) {
      System.out.println("That's all folks!");
    }
  }
}

