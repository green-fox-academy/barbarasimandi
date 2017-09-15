import java.util.Scanner;

public class PalindromeBuilder {

  public static void main(String[] args) {
    System.out.println(PalindromeBuilderFunction("greenfox"));
  }

  // This is a function which reverses the input String.
  public static String reverse(String normalOrderWord) {

    Scanner myScan = new Scanner(System.in);
    // starting the new string

    String normal = "";

    // for every element in the wrong-ordered string, starting at the last character, until the first, stepping backwards.
    for (int i = normalOrderWord.length() - 1; i >= 0; i--) {

      // the empty string = empty line + the nth-indexed character of the wrong-ordered string
      normal = normal + normalOrderWord.charAt(i);
    }
    return normal;
  }

  //This is a function which adds together the input, and its reversed version.
  public static String PalindromeBuilderFunction(String normalOrder) {
    String theReversedOne = reverse(normalOrder);
    String OUT = normalOrder + theReversedOne;
    return OUT;
  }
}
