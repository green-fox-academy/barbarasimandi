import java.util.ArrayList;

public class Sum {


  public int getSumOfNumbers(ArrayList<Integer> listOfNumbers) {
    Integer sumAll = 0;
    if (listOfNumbers == null) {
      return 0;
    }
    else {
      for (int i = 0; i < listOfNumbers.size(); i++) {
        sumAll += listOfNumbers.get(i);
      }
      return sumAll;
    }
  }
}
