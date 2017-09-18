import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {
    // Create a function named is anagram following your current language's style guide.
    // It should take two strings and return a boolean value depending on whether its an anagram or not.
    System.out.println(anagram("odg", "god"));
  }

  public static boolean anagram(String a, String b) {

    char[] charA = a.toCharArray();
    char[] charB = b.toCharArray();

    Arrays.sort(charA);
    Arrays.sort(charB);
    
      for (int i = 0; i < b.length(); i++) {
        if (charA[i] != charB[i]) {
          return false;
        }
      } return true;
  }
}

