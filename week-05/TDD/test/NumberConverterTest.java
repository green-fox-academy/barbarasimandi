import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumberConverterTest {

  NumberConverter numberConverter;

  @Before
  public void setUp() throws Exception {
    numberConverter = new NumberConverter();
  }

  @Test
  public void numberToWordZero() throws Exception {
    assertEquals("zero", numberConverter.numberToWord(0));
  }
}