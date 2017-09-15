public class SwapElements {

  public static void main(String[] args) {
    // - Create an array variable named `abc`
    //   with the following content: `["first", "second", "third"]`
    // - Swap the first and the third element of `abc

    String[] abc = {"first", "second", "third"};

    for (int i = 0; i < abc.length; i++) {
      abc[0] = "third";
      abc[2] = "first";
    }

    for (String s : abc) {
      System.out.println(s);
    }
  }
}

