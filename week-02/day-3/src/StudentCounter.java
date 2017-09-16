import java.util.*;

public class StudentCounter {

  public static void main(String... args) {
    ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

    // Given this list of hashmaps...

    Map<String, Object> row0 = new HashMap<String, Object>();
    row0.put("name", "Rezso");
    row0.put("age", 9.5);
    row0.put("candies", 2);
    map.add(row0);

    Map<String, Object> row1 = new HashMap<String, Object>();
    row1.put("name", "Gerzson");
    row1.put("age", 10);
    row1.put("candies", 1);
    map.add(row1);

    Map<String, Object> row2 = new HashMap<String, Object>();
    row2.put("name", "Aurel");
    row2.put("age", 7);
    row2.put("candies", 3);
    map.add(row2);

    Map<String, Object> row3 = new HashMap<String, Object>();
    row3.put("name", "Zsombor");
    row3.put("age", 12);
    row3.put("candies", 5);
    map.add(row3);

    Map<String, Object> row4 = new HashMap<String, Object>();
    row4.put("name", "Olaf");
    row4.put("age", 12);
    row4.put("candies", 7);
    map.add(row4);

    Map<String, Object> row5 = new HashMap<String, Object>();
    row5.put("name", "Teodor");
    row5.put("age", 3);
    row5.put("candies", 2);
    map.add(row5);

    // Display the following things:
    //  - Who has got more candies than 4 candies
    //  - Sum the age of people who have lass than 5 candies


    // If the key integer which is the pair of the "candies" value is higher than 4, then show the value of the key "name".
    for (int i = 0; i < map.size(); i++) {
      if ((int) map.get(i).get("candies") > 4) {
        System.out.println(map.get(i).get("name"));
      }
    }

    // Rezso is not 10 yet, he is 9.5, thatswhy a Double type is needed.
    Double sumOfAges = 0.0;

    // Iterating through all the students in map (which is an ArrayList, containing Maps of key-value : String-Object pairs).
    for (int i = 0; i < map.size(); i++) {

      // If someone has more candies than 5, I get their ages(Objects) than convert those to Strings, and than to Doubles.
      if ((int) map.get(i).get("candies") < 5) {
        Object containerOfAges = map.get(i).get("age");
        String stringSumOfAges = containerOfAges.toString();
        Double stringsToNumber = Double.parseDouble(stringSumOfAges);

        // Finally I sum the Doubles, and print it, outside the for loop.
        sumOfAges += stringsToNumber;
      }
    }
    System.out.println("The sum of the ages is: " + sumOfAges);
  }
}