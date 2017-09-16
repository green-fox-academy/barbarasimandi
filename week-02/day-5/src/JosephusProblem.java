import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JosephusProblem {

  public static void main(String[] args) {
    System.out.println("Enter a number, and I'll count the josephusized version of it! ;) ");
    Scanner myScan = new Scanner(System.in);
    int number = myScan.nextInt();

    System.out.println(Josephusize(number));
  }

  public static int Josephusize(int a) {

    ArrayList<Integer> arrLi = new ArrayList<>(Arrays.asList());

    for (int i = 0; i < a; i++) {
      arrLi.add(i);
    }

    int toBeRemoved = 1;

    while (arrLi.size() > 1) {
      arrLi.remove(toBeRemoved);
      toBeRemoved += 1;

      if (toBeRemoved >= arrLi.size()){
        toBeRemoved = toBeRemoved % arrLi.size();
      }
    }
    return arrLi.get(0);
  }
}
