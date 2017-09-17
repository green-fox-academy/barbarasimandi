public class SubStr {

  public static void main(String[] args) {
    //Find part of an integer
    //Create a function that takes two strings as a parameter
    //Returns the starting index where the second one is starting in the first one
    //Returns -1 if the second string is not in the first one

    //input: "this is what I'm searching in", "searching"
    //output: 17

    System.out.println(subStr("Kissssssssssssssssssscica", "cica"));
    System.out.println(subStr("Kissssssssssssssssssscica", "kutya"));

  }
  public static int subStr (String first, String second){

    int index = 0;

    // We need the first character of the second String to start looking for it in the first one.
    char s = second.charAt(0);

    // We iterate through the first word's elements (characters), and see if it contains the whole second String.
    // If so, we set our index equal to the index in the first String (which is the same as the second one's first character).
    for (int i = 0; i < first.length(); i++) {
      if (first.contains(second)) {
        index = first.indexOf(s);
      }
      // If it doesn't contain, we set our index equal to -1.
      else {
        index = -1;
      }
    }
  return index;
  }
}
