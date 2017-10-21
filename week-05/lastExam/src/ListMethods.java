import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMethods {

  Path filePath = Paths.get("C:/greenfox/barbarasimandi/week-05/lastExam/src/text.txt");

  public void fillMap() {

    try {
      List<String> lines = Files.readAllLines(filePath);

      Map<String, Integer> wordsAndOccurences = new HashMap<>();
      for (int i = 0; i < lines.size(); i++) {
        String word = lines.get(i);
        if (wordsAndOccurences.containsKey(word)) {
          int counter = wordsAndOccurences.get(word);
          wordsAndOccurences.put(word, ++counter);
        }
        else {
          wordsAndOccurences.put(word, 1);
        }
      }

      System.out.println(getMostCommonWord(wordsAndOccurences));

    } catch (IOException e) {
      System.out.println("Unable to read the file.");
    }
  }

  public Map.Entry getMostCommonWord(Map<String, Integer> words) {
    Map.Entry<String, Integer> wordsEntry = null;
    for (Map.Entry<String, Integer> word : words.entrySet()) {
      if (wordsEntry == null || word.getValue() > wordsEntry.getValue()) {
        wordsEntry = word;
      }
    }
    return wordsEntry;
  }
}