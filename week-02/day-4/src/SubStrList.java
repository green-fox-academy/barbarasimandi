import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SubStrList {

  public static void main(String[] args) {
    // Create a function that takes a string and a list of string as a parameter
    // Returns the index of the string in the list where the first string is part of
    // Returns -1 if the string is not part any of the strings in the list

    // input: "ching", ["this", "is", "what", "I'm", "searching", "in"]
    // output: 4

    ArrayList<String> list = new ArrayList<>(Arrays.asList("this", "is", "what", "I'm", "searching", "in"));
    System.out.println(searchTheIndex("at", list));
  }

  public static int searchTheIndex(String a, ArrayList<String> b) {

    int index = 0;

    for (int i = 0; i < b.size(); i++) {
      if (b.get(i).contains(a)) {
        index += i;
      }
    }
    return index;
  }
}
