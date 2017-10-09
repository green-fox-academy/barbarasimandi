import java.util.Arrays;
import java.util.List;

public class Anagram {

  public boolean match(String string1, String string2) {

    boolean isAnagram = true;
    char[] charA = string1.toCharArray();
    char[] charB = string2.toCharArray();

    Arrays.sort(charA);
    Arrays.sort(charB);

      for (int i = 0; i < string1.length(); i++) {
        for (int j = 0; j < string2.length(); j++) {
          if (charA[i] == charB[j]) {
           isAnagram = true;
          } else {
           isAnagram = false;
          }
        }
      }
    return isAnagram;
    }
  }

