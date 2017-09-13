public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        System.out.println(quote);

        String quoteFirstPart = quote.substring(0, 20);
        String quoteMissingPart = " always takes longer than";
        String quoteLastPart = quote.substring(20, quote.length());

        System.out.println(quoteFirstPart + quoteMissingPart + quoteLastPart);
    }
}
