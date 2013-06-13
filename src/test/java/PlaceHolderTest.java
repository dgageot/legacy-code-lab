import static org.fest.assertions.Assertions.*;

import org.junit.*;

public class PlaceHolderTest {
  @Test
  public void should_always_return_foo() {
    assertThat("foo").isEqualTo("foo");
  }
}
