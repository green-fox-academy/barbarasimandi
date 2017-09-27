import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  // Write a function, that takes a string as an argument
  // and returns a dictionary with all letters in the string
  // as keys, and numbers as values that shows how many
  // occurrences there are.


  public HashMap<Character, Integer> dictionary(String input){
    // letters - keys, occurrences - values

    HashMap<Character, Integer> dict = new HashMap<>();
    char[] inputChar = input.toCharArray();

    for (int i = 0; i < inputChar.length; i++) {
      if (dict.containsKey(inputChar[i])) {
        dict.put(inputChar[i], dict.get(inputChar[i]) + 1);
      }
      else {
        dict.put(inputChar[i], 1);
      }
    }
    return dict;
  }
}
