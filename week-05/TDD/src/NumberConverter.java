import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberConverter {

  public String numberToWord(int num, StringBuilder units, String tenth) {

   /* List<Integer> values = new ArrayList<>(
        Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19));
    List<String> romanSymbols = new ArrayList<>(Arrays
        .asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen"));*/

    if (num >= 0 && num <= 999) {
      if (num == 0) {
        units.append("zero");
      }
    }

    return units.toString();
  }
}
