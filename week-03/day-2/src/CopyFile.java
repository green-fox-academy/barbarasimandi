import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {

  public static void main(String[] args) {

    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    System.out.println(isItCopied("src/my-file.txt", "src/my-file2.txt"));
  }
  public static boolean isItCopied(String fileName1, String fileName2) {

    try {

      Path filePath1 = Paths.get(fileName1);
      List<String> content1 = Files.readAllLines(filePath1);

      Path filePath2 = Paths.get(fileName2);
      Files.write(filePath2, content1);

     } catch (IOException ex) {
      return false;
    }

    return true;
  }

}