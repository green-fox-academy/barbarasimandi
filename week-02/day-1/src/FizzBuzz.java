public class FizzBuzz {
    public static void main(String[] args) {
    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”.

        int num = 0;
        while (num < 100) {
            System.out.println(num);
            num += 1;

            if (num % 3 == 0) {
                System.out.println("Fizz");
            }
        }
   }
}

