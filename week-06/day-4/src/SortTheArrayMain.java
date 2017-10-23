import java.util.Arrays;

public class SortTheArrayMain {
  public static void main(String[] args) {

    SortTheArray sortTheArrayInstance = new SortTheArray();

    Integer[] integerArray = {3, 6, 1, 7, 2, 4, 5};
    Character[] charArray = {'C', 'I', 'C', 'A'};
    String[] stringArray = {"apple", "pear", "blue","sometext"};
    Double[] doubleArray = {6.1, 2.1, 4.3, 4.4};
    Boolean[] booleanArray = {true, false, !true&&false, true||false&&true, true};
    Integer[] emptyArray = {};

    System.out.println(Arrays.toString(sortTheArrayInstance.sortTheArray(integerArray)));
    System.out.println(Arrays.toString(sortTheArrayInstance.sortTheArray(charArray)));
    System.out.println(Arrays.toString(sortTheArrayInstance.sortTheArray(stringArray)));
    System.out.println(Arrays.toString(sortTheArrayInstance.sortTheArray(doubleArray)));
    System.out.println(Arrays.toString(sortTheArrayInstance.sortTheArray(booleanArray)));

    try {
      System.out.println(Arrays.toString(sortTheArrayInstance.sortTheArray(emptyArray)));
    } catch (IndexOutOfBoundsException e) {
      System.out.println("The given array doesn't contain anything.");
    }
  }
}
