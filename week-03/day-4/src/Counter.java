// Write a recursive function that takes one parameter: n and counts down from n.
public class Counter {

  public static void main(String[] args) {
    System.out.println(counter(10));
  }

  public static int counter(int n) {
    if (n == 1) {
      return 1;
    }
    System.out.println(n);
    return counter(n - 1);
  }
}
