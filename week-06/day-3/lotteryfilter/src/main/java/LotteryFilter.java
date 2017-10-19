import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class LotteryFilter {

  public static void main(String[] args) {
    argumentHandler(args);
  }

  public static void argumentHandler(String[] input) {

    OptionParser parser = new OptionParser();

    parser.accepts("y");
    parser.accepts("f");
    parser.accepts("o");

    OptionSet options = parser.parse(input);

    if (options.has("y")) {

      try {
        CSVReader reader = new CSVReader(new FileReader("C:/greenfox/barbarasimandi/week-06/day-3/lotteryfilter/src/assets/otos.csv"));
        CSVWriter writer = new CSVWriter(new FileWriter("C:/greenfox/barbarasimandi/week-06/day-3/lotteryfilter/src/assets/output.csv"));
        List<String[]> lines = reader.readAll();
        //List<String[]> linesToWrite = new ArrayList<>();

        //linesToWrite.addAll(lines);

        writer.writeAll(lines);
        writer.close();

      } catch (Exception e) {
        System.out.println("Nope");
      }
    }
  }
}