public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables

        int remainingHours = (24 * 3600) - (3600 * currentHours);
        int remainingMinutes = 3600 - (60 * currentMinutes);
        int remainingSeconds = 60 - currentSeconds;

        System.out.println(remainingHours);
        System.out.println(remainingMinutes);
        System.out.println(remainingSeconds);
    }
}