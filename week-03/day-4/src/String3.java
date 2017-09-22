// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
public class String3 {

  public static void main(String[] args) {
    System.out.println(starAdder("Yaaay! Stars!"));
  }

  public static String starAdder(String withoutStars) {
    if (withoutStars.length() == 0) {
      return "";
    }
    else return starAdder(withoutStars.substring(0, withoutStars.length() - 1)) + withoutStars.substring(withoutStars.length()-1).concat("*");
  }
}