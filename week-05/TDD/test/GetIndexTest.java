import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GetIndexTest {

  GetIndex getIndex;

  @Before
  public void setUp() throws Exception {
    getIndex = new GetIndex();
  }

  @Test
  public void indexGet0() throws Exception {
    assertEquals(2, getIndex.getIndexMethod(3));
  }

  @Test
  public void indexGet() throws Exception {
    assertEquals(-1, getIndex.getIndexMethod(9));
  }



}