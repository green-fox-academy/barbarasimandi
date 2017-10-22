import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

// this class is for defining reading an writing mechanisms.
public class FileMethods {

  private String fileNameToContinue = "C:/greenfox/barbarasimandi/week-06/day-3/lotteryfilter/src/assets/";
  List<String[]> lines;
  List<String[]> linesToWrite;
  String[] noSemiColon = new String[]{"Please use ';' for separating year"};
  String[] noSuchYear = new String[]{"There is no such year in the given file"};          // couldn't put in its place yet.

  //reading from a standard path
  public List<String[]> read() {
    try {
      CSVReader reader = new CSVReader(new FileReader(fileNameToContinue + "otos.csv"));
      lines = reader.readAll();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lines;
  }

  //reading from specified path
  public List<String[]> readFromGivenFile(String inputFileName) {
    try {
      CSVReader reader = new CSVReader(new FileReader(fileNameToContinue + inputFileName));
      lines = reader.readAll();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lines;
  }

  //writing to standard path
  public void write() {
    try {
      CSVWriter writer = new CSVWriter(new FileWriter(fileNameToContinue + "output.csv"));
      writer.writeAll(read());
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  //writing to specified path
  public void writeToGivenFile(String outputFileName) {
    try {
      CSVWriter writer = new CSVWriter(new FileWriter(fileNameToContinue + outputFileName));
      writer.writeAll(lines);
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void writeResultsByYearToStandardOutput(int year) {
    try {
      CSVWriter writer = new CSVWriter(new FileWriter(fileNameToContinue + "output.csv"));
      writer.writeAll(filterByYear(year));
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  //reading from a specified path, filtering by year.
  public void writeResultsByYear(String outputFileName, int year) {
    try {
      CSVWriter writer = new CSVWriter(new FileWriter(fileNameToContinue + outputFileName));
      writer.writeAll(filterByYear(year));
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  //filtering by given year
  private List<String[]> filterByYear(int year) {
    linesToWrite = new ArrayList<>();
    for (int i = 0; i < lines.size(); i++) {
      if (lines.get(i)[0].contains(";")) {
        int index = lines.get(i)[0].indexOf(';');
        String substr = lines.get(i)[0].substring(0, index);
        if (Integer.parseInt(substr) == year) {
          linesToWrite.add(lines.get(i));
        }
      } else {
        linesToWrite.add(noSemiColon);
      }
    }
    return linesToWrite;
  }
}
