public class Recursion {

  public static void main(String[] args) {

  }

/*  public static int factorial(int input) {
    int result = 1;

    for (int i = 1; i <= input; i++) {
      result *= i;
    }
    return result;
  }*/

  public static int factorio(int input) {
    if (input == 1) {
      return 1;
    }
    return factorio(input - 1) * input;
  }
}
