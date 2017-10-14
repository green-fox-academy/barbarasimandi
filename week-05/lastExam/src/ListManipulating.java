import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ListManipulating {

  Path filePath = Paths.get("C:/greenfox/barbarasimandi/week-05/lastExam/src/text.txt");

  public void listingTxt() {
    try {

      List<String> lines = Files.readAllLines(filePath);
      for (String s : lines) {
        System.out.println(s);
      }
    } catch (IOException ex) {

      System.out.println("Unable to read file: text.txt");
    }
  }

  public void countMostCommon() {
    try {
      List<String> lines = Files.readAllLines(filePath);

      ArrayList<String> wordsOnce = new ArrayList<>();
      ArrayList<String> wordsOccurringMoreThanOnce = new ArrayList<>();

      for (int i = 0; i < lines.size(); i++) {
        String word = lines.get(i);

        if (!wordsOnce.contains(word) && !wordsOccurringMoreThanOnce.contains(word)) {
          wordsOnce.add(word);
        } else {
          wordsOnce.remove(word);
          wordsOccurringMoreThanOnce.add(word);
        }
      }

      while (wordsOccurringMoreThanOnce.size() > 1) {
        for (int i = 0; i < wordsOccurringMoreThanOnce.size(); i++) {
          if (wordsOccurringMoreThanOnce.contains(wordsOccurringMoreThanOnce.get(i))) {
            wordsOccurringMoreThanOnce.remove(wordsOccurringMoreThanOnce.get(i));
          }
        }
      }

      System.out.println(wordsOccurringMoreThanOnce);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
