import static org.fest.assertions.Assertions.*;
import static org.mockito.Mockito.*;

import legacy.*;
import legacy.dto.*;
import legacy.error.*;
import legacy.hedge.*;

import org.junit.*;

public class PlaceHolderTest {
  @Test
  public void should_always_return_foo() {
    assertThat("foo").isEqualTo("foo");
  }
}
