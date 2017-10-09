import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetIndex {

  List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

  public int getIndexMethod(int index) {
   if (index < numbers.size()) {
     for (int i = 0; i < numbers.size(); i++) {
       index = numbers.indexOf(numbers.get(i));
     } return index;
   } return -1;
  }
}
