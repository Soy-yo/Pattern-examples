package creation.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SingletonTest {

  @Test
  void test() {
    // Can't do this:
    //    ImportantObject object = new ImportantObject();

    ImportantObject object = ImportantObject.getInstance();
    ImportantObject other = ImportantObject.getInstance();
    assertTrue(object == other, "Same reference");
  }

}