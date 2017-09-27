public class Fibonacci {

    public int fibonaccer(int n) {
      if (n == 1) {
        return 0;
      }
      else if (n == 2 || n == 3) {
        return 1;
      }
      else {
        return fibonaccer(n - 1) + fibonaccer(n - 2);
      }
    }
  }
