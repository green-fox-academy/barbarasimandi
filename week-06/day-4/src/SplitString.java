import java.util.Arrays;

public class SplitString {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(splitString("lovebarbara", 12)));
  }

  public static String[] splitString(String input, int index) {

    String[] split = null;

    try {

      String first = input.substring(0, index);
      String second = input.substring(index, input.length());
      split = new String[]{first, second};

    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("the given index is greater than the word to-be-split's length");
    }
    return split;
  }
}
