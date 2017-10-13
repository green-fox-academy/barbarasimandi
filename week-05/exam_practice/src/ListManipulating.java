import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ListManipulating {

  Path filePath = Paths.get("C:/greenfox/programming_basics/pallida-exam-basics/answers/favourites.txt");

  public void listingTxt() {
    try {

      List<String> lines = Files.readAllLines(filePath);
      for (String s : lines) {
        System.out.println(s);
      }
    } catch (IOException ex) {
      System.out.println("Unable to read file: favourites.txt");
    }
  }

  public void append(String nextFav) {
    try {
      List<String> lines = new ArrayList<>();
      lines.add(nextFav);

      lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        if (lines.get(i).equals(nextFav)) {
          lines.remove(nextFav);
        } else if(!(lines.get(i).equals(nextFav))) {
            lines.add(nextFav);
        }
      }

      Files.write(filePath, lines);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
