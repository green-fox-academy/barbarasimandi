public class DrawDiamond {

  public static void main(String[] args) {

    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was

    double numberOfLines = 10;
    double num = numberOfLines / 2;
    double spaceIndex = num;
    double starIndex = -1;

    for (int i = 0; i < num; i++) {
      spaceIndex = num - i;
      starIndex += 2;

      for (int j = 0; j < spaceIndex; j++) {
        System.out.print(" ");
      }

      for (int k = 0; k < starIndex; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < num; i++) {
      spaceIndex += 1;
      starIndex -= 2;

      for (int j = 0; j < spaceIndex; j++) {
        System.out.print(" ");
      }

      for (int k = 0; k < starIndex; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

