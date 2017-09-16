import java.lang.reflect.Array;
import java.util.ArrayList;

public class Unique {

  public static void main(String[] args) {
    //Create a function that takes a list of numbers as a parameter
    //Returns a list of numbers where every number in the list occurs only once
    //Example
    //input: [1, 11, 34, 11, 52, 61, 1, 34]
    //output: [1, 11, 34, 52, 61]

    System.out.println(unique(new int[]{1, 11, 52, 34, 11, 52, 61, 1, 34}));
  }

    public static ArrayList unique(int[] listOfNumbers) {

    // The list to be returned has to be an ArrayList, because its size will be changed.
    ArrayList<Integer> listOfReducedNumbers = new ArrayList<>();

    // We iterate through the given Array, and check if the Array contains the elements given by their indexes.
      for (int i = 0; i < listOfNumbers.length; i++) {
        if (listOfReducedNumbers.contains(listOfNumbers[i])) {
          System.out.println("Repeating number: " + listOfNumbers[i]);
        }
        else {
          listOfReducedNumbers.add(listOfNumbers[i]);
        }
    }return listOfReducedNumbers;
  }
}
