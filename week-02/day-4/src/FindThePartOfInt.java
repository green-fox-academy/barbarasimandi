import java.util.ArrayList;
import java.util.Arrays;

public class FindThePartOfInt {

  public static void main(String[] args) {
    // Create a function that takes a number and a list of numbers as a parameter
    // Returns the indeces of the numbers in the list where the first number is part of
    // Returns an empty list if the number is not part any of the numbers in the list

    // input: [1, 11, 34, 52, 61], 1
    // output: [0, 1, 4]

    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 11, 34, 52, 61, 51, 12));
    System.out.println(findThePart(1, list));
  }

  public static ArrayList findThePart(int a, ArrayList<Integer> b) {

    // c is the output list with the indexes of elements, stringB is the input ArrayList's String-version.
    ArrayList<Object> c = new ArrayList<>();
    ArrayList<String> stringB = new ArrayList<>();

    // We fill up stringB with integers of b as Strings.
    // We fill up stringA which is only a number's String-version.
    for (int i = 0; i < b.size(); i++) {
      stringB.add(b.get(i).toString());
    }
    String stringA = "" + a;

    for (int i = 0; i < b.size(); i++) {

      // We start filling up c only if the Stringlist's elements contains the input number (both Strings now).
      // We fill up c with the Stringlist's indexes of the Stringlist's elements.
      // In a nutshell: It's magic.
      if (stringB.get(i).contains(stringA)) {
        c.add(stringB.indexOf(stringB.get(i)));
      }
    }
    return c;
  }
}
