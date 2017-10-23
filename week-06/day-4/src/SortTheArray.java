import java.util.Arrays;
import java.util.Collections;

public class SortTheArray {

  // this one is following the actual excercise (<T extends Number>).
  public <T extends Number> T[] sortTheArray(T[] inputArray) {
    if(inputArray.length > 0) {
      Arrays.sort(inputArray, Collections.reverseOrder());
    }
    else {
      throw new IndexOutOfBoundsException("zero long array");
    }
    return inputArray;
  }

  // this one is used for sorting Character[], String[], Boolean[].
  public <T> T[] sortTheArray(T[] inputArray) {

    if(inputArray.length > 0) {
      Arrays.sort(inputArray, Collections.reverseOrder());
    }
    else {
      throw new IndexOutOfBoundsException("zero long array");
    }
    return inputArray;
  }
}
