import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class LotteryFilter {

  private OptionParser parser;
  private OptionSet options;
  private String fileNameToContinue = "C:/greenfox/barbarasimandi/week-06/day-3/lotteryfilter/src/assets/";
  private String inputYear, inputFileName, outputFileName;

  public LotteryFilter(String[] input) {
    parser = new OptionParser();
    possibleArguments();
    options = parser.parse(input);
  }

  // for setting the possible arguments
  public void possibleArguments() {
    parser.accepts("y").withRequiredArg();
    parser.accepts("f").withRequiredArg();
    parser.accepts("o").withRequiredArg();
  }


  public void argumentHandler() {

    if (options.has("y")) {

    inputYear = options.valueOf("y").toString();
    inputFileName = options.valueOf("f").toString();
    outputFileName = options.valueOf("o").toString();

      try {
      CSVReader reader = new CSVReader(new FileReader(fileNameToContinue + inputFileName));

        if (options.has("f")) {

          List<String[]> lines = reader.readAll();
          List<String[]> linesToWrite = new ArrayList<>();
          String[] no = new String[]{"There is no such year in the input file."};

          for (int i = 0; i < lines.size(); i++) {
            String[] line = lines.get(i);

            if (options.has("f") && line[0].startsWith(inputYear)) {
              linesToWrite.add(line);
            }
            // not working yet. My goal is to write "There is no such year in the input file."
            else {
              linesToWrite.add(no);
            }

            if (options.has("f") && line[0].startsWith(inputYear) && options.has("o")) {

              CSVWriter writer = new CSVWriter(new FileWriter(fileNameToContinue + outputFileName));

              writer.writeAll(linesToWrite);
              writer.close();
            }
          }
        }
      } catch (IOException e) {
        System.out.println("Unable to read file.");
      }
    }
  }
}