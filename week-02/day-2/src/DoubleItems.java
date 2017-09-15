public class DoubleItems {

  public static void main(String[] args) {
        // - Create an array variable named `ag`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array

      int[] ag = new int[] {3, 4, 5, 6, 7};

      for (int a: ag) {
        a = a * 2;
        System.out.println(a);
      }
  }
}
