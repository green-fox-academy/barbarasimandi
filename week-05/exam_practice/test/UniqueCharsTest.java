import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class UniqueCharsTest {

  ArrayList<String> example;
  ArrayList<String> exampleKiscica;
  ArrayList<String> empty;

  @Before
  public void setUp() throws Exception {
    example = new ArrayList<>(Arrays.asList("k", "m", "n", "c"));
    exampleKiscica = new ArrayList<>(Arrays.asList("k", "s", "a"));
    empty = new ArrayList<>();
  }

  @Test
  public void testKemence() throws Exception {
    assertEquals(example, UniqueChars.uniqueCharacters("kemence"));
  }

  @Test
  public void testKiscica() throws Exception {
    assertEquals(exampleKiscica, UniqueChars.uniqueCharacters("kiscica"));
  }

  @Test
  public void testAAAAAAA() throws Exception {
    assertEquals(empty, UniqueChars.uniqueCharacters("AAAAAA"));
  }

  @Test
  public void testEmpty() throws Exception {
    assertEquals(empty, UniqueChars.uniqueCharacters(""));
  }
}