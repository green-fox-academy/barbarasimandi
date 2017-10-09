import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarTest {

  String carType = "Tesla";
  Car myCar;

  @Before
  public void setUp() throws Exception {
    myCar = new Car(carType);
    System.out.println("It should run before each test");
  }

  @After
  public void tearDown() throws Exception {
    myCar = null;
    System.out.println("It should run after each test");
  }

  @Test
  public void getType() throws Exception {
    assertEquals(carType, myCar.getType());
  }

  @Test
  public void getType2() throws Exception {
    assertTrue(carType.equals(myCar.getType()));
  }

  @Test
  public void getType3() throws Exception {
    assertFalse("kiskacsa".equals(myCar.getType()));
  }



}