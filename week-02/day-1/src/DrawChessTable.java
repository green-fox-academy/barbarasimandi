public class DrawChessTable {

  public static void main(String[] args) {

    // Crate a program that draws a chess table like this
    //
    // % % % % 
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % % 
    //  % % % %
    //

    int num = 4;

    for (int i = 0; i < num + num; i++) {
      for (int j = 0; j < num; j++) {
        if (i % 2 == 1){
          System.out.print(" %");
        }
        else {
          System.out.print("% ");
        }

      } System.out.println();
    }
  }
}
