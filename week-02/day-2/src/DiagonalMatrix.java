import javax.xml.bind.SchemaOutputResolver;

public class DiagonalMatrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    public static void main(String[] args) {

    // We are going to have 4 rows and 4 columns.
    int size = 4;

    int[][] multiArray = new int[size][size];

    // Filling up the rows
    for (int i = 0; i < size; i++) {

        //Filling up the columns
        for (int j = 0; j < size; j++) {

            // If they're at the same place, we should print 1, otherwise 0.
            if (j == i) {
                multiArray[i][j] = 1;
            } else {
                multiArray[i][j] = 0;
            }
            // Printing the elements
            System.out.print(multiArray[i][j] + " ");
        }
        // Putting them in a new line.
        System.out.println();
    }
  }
}
