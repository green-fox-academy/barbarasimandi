import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

   public static void main(String[] args) {
     // Write a function that takes a filename as string,
     // then returns the number of lines the file contains.
     // It should return zero if it can't open the file, and
     // should not raise any error.
     System.out.println(howManyLines("src/reversed-order.txt"));
   }
  public static int howManyLines(String fileName) {
    int numberOfLines = 0;
    try {
      Path filePath = Paths.get(fileName);
      List<String> lines = Files.readAllLines(filePath);
      numberOfLines = lines.size();
    } catch (IOException ex) {
      return 0;
    }
    return numberOfLines;
  }
 }