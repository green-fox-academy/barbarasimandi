import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import com.opencsv.*;

public class LotteryFilter {

  public static void main(String[] args) {
    argumentHandler(args);
  }

  public static void argumentHandler(String[] input) {

    OptionParser parser = new OptionParser();
    OptionSet options = parser.parse(input);

    parser.accepts("y")/*.withRequiredArg()*/;
    parser.accepts("f");
    parser.accepts("o");

    if (options.has("y")) {

      try {
        CSVReader reader = new CSVReader(new FileReader("C:/greenfox/barbarasimandi/week-06/day-3/lotteryfilter/src/assets/otos.csv"));
        List<String[]> lines = reader.readAll();

        List<String[]> linesToWrite = new ArrayList<>();
        linesToWrite.addAll(lines);

        CSVWriter writer = new CSVWriter(new FileWriter("C:/greenfox/barbarasimandi/week-06/day-3/lotteryfilter/src/assets/output.csv"));
        writer.writeAll(linesToWrite);
        writer.close();

      } catch (Exception e) {
        System.out.println("Nope");
      }
    }
  }
}