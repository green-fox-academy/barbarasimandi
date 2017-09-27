import static org.junit.Assert.*;

import org.junit.Test;

public class AppleTest {
  String testApple = "pear";
  Apple apple = new Apple(testApple);

  @Test
  public void testAppleName() {
    assertEquals("pear", apple.getName());
  }


}