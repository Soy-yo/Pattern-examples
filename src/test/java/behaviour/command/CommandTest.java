package behaviour.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommandTest {

  @Test
  void test() {
    Player player = new Player();

    Command move = new MoveCommand(player, "right");
    assertEquals("moving right", move.execute(), "Correct execution");

    Command attack = new AttackCommand(player);
    assertEquals("attacking", attack.execute(), "Correct execution");
  }

}