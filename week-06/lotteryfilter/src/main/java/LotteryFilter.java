import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import com.opencsv.*;

public class LotteryFilter {

  public static void main(String[] args) {

  }

  public void argumentHandler(String[] input) {
    OptionParser parser = new OptionParser();
    parser.accepts("y");
    parser.accepts("f");
    parser.accepts("o");

    parser.accepts("f").withRequiredArg();
    OptionSet options = parser.parse(input);

    if (options.has("y")) {
      //readAndWrite();
    }

  }

  public void readAndWrite(String source, String output) {

    source = "C:/greenfox/barbarasimandi/week-06/lotteryfilter/src/assets/otos.csv";
    output = "C:/greenfox/barbarasimandi/week-06/lotteryfilter/src/assets/output.csv";

    CSVReader reader = null;

    try {
      reader = new CSVReader(new FileReader(source));
      List<String[]> lines = reader.readAll();

      CSVWriter writer = new CSVWriter(new FileWriter(output));
      writer.writeAll(lines);
      writer.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}