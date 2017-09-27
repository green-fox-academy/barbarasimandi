import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SumTest {
    Sum testSumOfList;
    ArrayList<Integer> testList;
    ArrayList<Integer> testEmptyList;
    ArrayList<Integer> testListWithOneElement;
    ArrayList<Integer> testNullElements;

  @Before
  public void setUp() throws Exception {
    testSumOfList = new Sum();
    testList = new ArrayList<>(Arrays.asList(2, 8));
    testEmptyList = new ArrayList<>(Arrays.asList());
    testListWithOneElement = new ArrayList<>(Arrays.asList(2));
  }

  @Test
  public void testSumAll() {
    assertEquals(10, testSumOfList.getSumOfNumbers(testList));
  }

  @Test
  public void testSumNull() {
    assertEquals(0, testSumOfList.getSumOfNumbers(testEmptyList));
  }

  @Test
  public void testSumOneElement() {
    assertEquals(2, testSumOfList.getSumOfNumbers(testListWithOneElement));
  }

  @Test
  public void testNull() {
    assertEquals(0, testSumOfList.getSumOfNumbers(testNullElements));
  }
}
