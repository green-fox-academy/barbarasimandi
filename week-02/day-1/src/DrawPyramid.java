public class DrawPyramid {

  public static void main(String[] args) {

    int num = 7;
    int spaceIndex = num;
    int starIndex = -1;

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
  }
}
