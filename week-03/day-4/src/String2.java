// Given a string, compute recursively a new string where all the 'x' chars have been removed.
public class String2 {

  public static void main(String[] args) {
    System.out.println(withoutX("axbxcdxxxbbxx"));
  }
  public static String withoutX(String inputWithX){
    if (inputWithX.length() == 0) {
      return "";
    }
    else return withoutX(inputWithX.substring(0, inputWithX.length() - 1)) + inputWithX.substring(inputWithX.length()-1).replace("x", "");
  }

}