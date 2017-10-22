import joptsimple.OptionParser;
import joptsimple.OptionSet;

// this class is for using joptsimple to read arguments.
public class LotteryFilter {

  private OptionParser parser;
  private OptionSet options;
  private FileMethods fileMethods;
  private int year;
  private String inputFilePath, outputFilePath;

  public LotteryFilter(String[] input) {
    parser = new OptionParser();
    parser.accepts("y").withRequiredArg();
    parser.accepts("f").withRequiredArg();
    parser.accepts("o").withRequiredArg();
    options = parser.parse(input);
    fileMethods = new FileMethods();
  }

  public void argumentHandler() {
    year = Integer.parseInt(options.valueOf("y").toString());

    // writing to file if the app is run with -y and a year
    if (options.has("y") && !options.has("f") && !options.has("o")) {
      fileMethods.read();
      if (options.valueOf("y") == null) {
        //this throws an Exception, (OptionMissingRequiredArgumentException) which is private in joptsimple, therefore I can't handle it.
      }
      else if (options.valueOf("y") != null) {
        fileMethods.writeResultsByYearToStandardOutput(year);
      }
    }

    // writing to file from a specified input path to a standard output path, with filtered years
    else if (options.has("y") && options.has("f") && !options.has("o")) {
      inputFilePath = options.valueOf("f").toString();
      fileMethods.readFromGivenFile(inputFilePath);
      fileMethods.writeResultsByYearToStandardOutput(year);
    }

    // writing to file from a specified input path to a specified output path, with filtered years
    else if(options.has("y") && options.has("f") && options.has("o")) {
      inputFilePath = options.valueOf("f").toString();
      outputFilePath = options.valueOf("o").toString();
      fileMethods.readFromGivenFile(inputFilePath);
      fileMethods.writeResultsByYear(outputFilePath, year);
    }

  }
}