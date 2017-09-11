import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        System.out.println("Please, write a whole number: ");
        Scanner myScanner = new Scanner(System.in);
        int userInput2 = myScanner.nextInt();

        double x = userInput2 * 0.621371192;

        System.out.println("This is " + x + " miles");
    }
}