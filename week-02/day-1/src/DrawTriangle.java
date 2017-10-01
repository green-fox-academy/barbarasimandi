public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        int num = 9;
        String row = "";
        for (int i = 0; i < num; i++) {
            row = row + "*";
            System.out.println(row);
        }
    }
}
