// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
public class String1 {

  public static void main(String[] args) {
    System.out.println(string1("abcdxxxbb"));
  }

  public static String string1(String input) {

    if (input.length() == 0) {
      return "";
    }
    else {
      return string1(input.substring(0, input.length() - 1)) + input.substring(input.length() - 1).replace("x", "y");
    }
  }
}