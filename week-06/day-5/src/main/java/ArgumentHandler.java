import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class ArgumentHandler {

  OptionParser parser = new OptionParser();
  FileManipulation taskMethods;

  public ArgumentHandler() {
    taskMethods = new FileManipulation();
  }

  public void inspectArgs(String command) {
    parser.accepts("u");

    OptionSet option = parser.parse(command);

    if (option.has("u")) {
      taskMethods.add("Water plants");

    }
  }

}
