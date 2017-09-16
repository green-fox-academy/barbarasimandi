import java.lang.reflect.Array;

public class AppendA {

  public static void main(String[] args) {

    // - Create an array variable named `nimals`
    //   with the following content: `["kuty", "macsk", "cic"]`
    // - Add all elements an `"a"` at the end

    String[] nimals = {"kuty", "macsk", "cic"};
    for (String s: nimals) {
      System.out.print(s + "a, ");
    }
  }
}
