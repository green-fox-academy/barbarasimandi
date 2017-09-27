import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
  int testFirstElement;
  int testSecondElement;
  int testThirdElement;
  int testSeventhElement;
  Fibonacci fibonacciObject;

  @Before
  public void setUp() throws Exception {
    testFirstElement = 1;
    testSecondElement = 2;
    testThirdElement = 3;
    testSeventhElement = 7;
    fibonacciObject = new Fibonacci();
  }

  @Test
  public void testThatFibonacci() {
    assertEquals(8, fibonacciObject.fibonaccer(testSeventhElement));
  }

  @Test
  public void testTheFirstFibonacci() {
    assertEquals(0, fibonacciObject.fibonaccer(testFirstElement));
  }

  @Test
  public void testTheSecondFibonacci() {
    assertEquals(1, fibonacciObject.fibonaccer(testSecondElement));
  }

  @Test
  public void testTheThirdFibonacci() {
    assertEquals(1, fibonacciObject.fibonaccer(testThirdElement));
  }

}