import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        System.out.println("Tell me two numbers! ");
        Scanner myScannieScanner = new Scanner(System.in);
        int userInput1 = myScannieScanner.nextInt();
        int userInput2 = myScannieScanner.nextInt();

        if (userInput1 > userInput2) {
            System.out.println("The second number should be bigger!");
        } else {
            for (int i = userInput1 + 1; i < userInput2; i++) {
                System.out.println(i);
            }
        }
    }
    // Create a program that asks for two numbers
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"
    //
    // If it is bigger it should count from the first number to the second by one
    //
    // example:
    //
    // first number: 3, second number: 6, should print:
    //
    // 3
    // 4
    // 5








}
