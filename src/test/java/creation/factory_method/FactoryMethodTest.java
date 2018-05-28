package creation.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

  @Test
  void test() {
    ReaderFactory factory = new ReaderFactoryImp();

    Reader reader1 = factory.createReader("file.txt");
    assertTrue(reader1 instanceof TextReader, "Correct type");
    assertEquals("Reading text file: file.txt", reader1.read(), "Generating correct text");

    Reader reader2 = factory.createReader("file.mp3");
    assertTrue(reader2 instanceof MP3Reader, "Correct type");
    assertEquals("Reading MP3 file: file.mp3", reader2.read(), "Generating correct text");

    assertThrows(IllegalArgumentException.class, () -> factory.createReader("file.png"),
        "Unrecognized extension throws an error");

  }

}