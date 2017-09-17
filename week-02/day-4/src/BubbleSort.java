import java.util.ArrayList;

public class BubbleSort {

  public static void main(String[] args) {
    //Create a function that takes a list of numbers as parameter
    //Returns a list where the elements are sorted in ascending numerical order
    //Make a second boolean parameter, if it's true sort that list descending

    //input [34, 12, 24, 9, 5]
    //output [5, 9, 12, 24, 34]

    System.out.println(bubbleSort(new int[] {34, 12, 24, 9, 5}));

  }

  public static ArrayList bubbleSort(int[] listOfNumbers) {

    // The list to be returned has to be an ArrayList, because its size will be changed from zero.
    ArrayList<Integer> listOfSortedNumbers = new ArrayList<>();

    // temp is the temporary holder of the elements being swapped.
    int temp = 0;

    // We use this for loop to start the sorting again.
    for (int i = 0; i < listOfNumbers.length; i++) {

      // We use this nested for loop to check every element next to each other.
      for (int j = 1; j < listOfNumbers.length - i; j++) {
        
        // If they are higher than their right neighbours, with help of temp, we swap them.
        if (listOfNumbers[j - 1] > listOfNumbers[j]) {
          temp = listOfNumbers[j - 1];
          listOfNumbers[j - 1] = listOfNumbers[j];
          listOfNumbers[j] = temp;
        }
      }
    }
    // Filling up the empty list with numbers which are not higher than the ones on the right side of them.
    for (int i = 0; i < listOfNumbers.length; i++) {
      listOfSortedNumbers.add(listOfNumbers[i]);
    }
    return listOfSortedNumbers;
  }
}
