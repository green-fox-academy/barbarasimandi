import java.util.Arrays;
import java.util.Collections;

public class SortTheArray {

  public static void main(String[] args) {

    int[] intArray = {2, 3, 4};
    Integer[] integerArray = {3, 6, 1, 7, 2, 4, 5};
    Character[] charArray = {'C', 'I', 'C', 'A'};
    String[] stringArray = {"apple", "pear", "blue","sometext"};
    Double[] doubleArray = {6.1, 2.1, 4.3, 4.4};
    Boolean[] booleanArray = {true, false, !true&&false, true||false&&true, true};

   // sortTheArray(intArray);
    sortTheArray(integerArray);
    sortTheArray(charArray);
    sortTheArray(stringArray);
    sortTheArray(doubleArray);
    sortTheArray(booleanArray);
  }

  // this one is following the actual excercise (<T extends Number>).
  public static <T extends Number> T[] sortTheArray(T[] inputArray) {

    Arrays.sort(inputArray, Collections.reverseOrder());
    System.out.println();

    for (T element: inputArray) {
      System.out.printf("%s ", element);
    }
    return inputArray;
  }

  // this one is used for sorting Character[], String[], Boolean[].
  public static <T> T[] sortTheArray(T[] inputArray) {

    try {
      Arrays.sort(inputArray, Collections.reverseOrder());
      System.out.println();
    }
    catch (Exception e) {
      System.out.println("not valid type");
    }
    finally {
      for (T element: inputArray) {
        System.out.printf("%s ", element);
      }
    }
    return inputArray;
  }
}
