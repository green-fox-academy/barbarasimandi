import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

        System.out.println("Enter five numbers: ");

        Scanner myScanner = new Scanner(System.in);
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        int c = myScanner.nextInt();
        int d = myScanner.nextInt();
        int e = myScanner.nextInt();

        int sum = a + b + c + d + e;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / 5.);

    }
}
