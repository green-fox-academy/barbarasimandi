import com.sun.javafx.binding.SelectBinding.AsString;
import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.*;

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code

    // Also, print the sentence to the output with spaces in between.

    list.set(2, "cannot");
    list.set(5, "do");

    for (String s : list) {
      System.out.print(s + " ");
    }
  }
}