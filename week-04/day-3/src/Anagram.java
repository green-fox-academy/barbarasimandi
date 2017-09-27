import java.util.Arrays;

public class Anagram {

  public boolean anagram(String a, String b) {

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
