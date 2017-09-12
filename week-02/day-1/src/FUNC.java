public class FUNC {
    public static void main(String[] args) {
        myAwesomeFunction();
        writeAwesome(4);
    }

    public static void myAwesomeFunction() {
        System.out.println("Look, this is an awesome function, isn't it?");
    }

    public static void writeAwesome(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Awesome");
        }
    }
}
