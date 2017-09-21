// Given a non-negative int n, return the sum of its digits recursively (no loops). 
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while 
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
public class SumDigit {

  public static void main(String[] args) {
    System.out.println(sumDigit(876));
  }

  public static int sumDigit(int n) {
    if (n < 10) {
      return n;
    }
    else {
      // We take n / 10 to the next round, and do the division until the number is lower than 10.
      // We add the last digit at the end of it.
      return sumDigit(n / 10) + n % 10;
    }
  }
}