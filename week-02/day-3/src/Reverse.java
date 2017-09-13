public class Reverse {
    public static void main(String... args) {
        System.out.println(reversie(".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI"));
        // Create a function that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.
    }

    public static String reversie(String somethingInWrongOrder) {

        // starting the new string
        String normal = "";

        // for every element in the wrong-ordered string, starting at the last character, until the first, stepping backwards.
        for (int i = somethingInWrongOrder.length() - 1; i >= 0; i--) {

            // the empty string = empty line + the nth-indexed character of the wrong-ordered string
            normal = normal + somethingInWrongOrder.charAt(i);
        }
        return normal;
    }
}
