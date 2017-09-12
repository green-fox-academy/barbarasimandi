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

        int row = 4;
        int col = 4;

        int[][] multiArray = new int[row][col];

        // Filling up the rows
        for (int i = 0; i <= row; i++) {
            //Filling up the columns
            for (int j = 0; j <= col; j++) {
                // If they're at the sam place, we should print 1, otherwise 0.
                if (i == j) {
                    int multiArray[i][j] = 1;
                } else {
                    int multiArray[i][j] = 0;
                } System.out.println(multiArray[i][j]);
            }
        }
    }
}
