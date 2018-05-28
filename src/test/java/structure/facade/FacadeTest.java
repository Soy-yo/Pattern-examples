package structure.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FacadeTest {

  @Test
  void test() {
    Menu menu = new Menu();
    assertEquals("Starting game", menu.startGame(), "Facade is working");
    assertEquals("Loading game", menu.loadGame(), "Facade is working");
    assertEquals("Creating level", menu.createLevel(), "Facade is working");
  }

}