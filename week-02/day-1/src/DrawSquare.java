public class DrawSquare {

  public static void main(String[] args) {

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was

    int num = 7;

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        if (i == 0 || i == num - 1 || j == 0) {
          System.out.print("%");
        }
        else if (j == num -1) {
          System.out.print("%");
        }
        else {
          System.out.print(" ");
        }
      }System.out.println();
    }
  }
}
