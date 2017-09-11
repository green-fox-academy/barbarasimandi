import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The seconf represents the number of pigs the farmer has
        // It should print how many legs all the animals have

        System.out.println("Please, tell me how many chicken you've got: ");

        Scanner myScanner = new Scanner(System.in);
        int x = myScanner.nextInt();

        System.out.println("Please, tell me how many pigs you've got: ");
        int y = myScanner.nextInt();

        System.out.println("The number of the legs of all the animals you've got is: " + (x*2+y*4));

    }
}