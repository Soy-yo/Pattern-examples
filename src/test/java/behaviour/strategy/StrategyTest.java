package behaviour.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrategyTest {

  @Test
  void test() {
    Player player = new Player("Soy-yo");
    World world = new World(player);

    player.levelUp(19);
    Enemy enemy = world.spawnEnemy();
    assertEquals("Caterpie", enemy.getName(), "Created low level enemy");

    player.levelUp(40);
    enemy = world.spawnEnemy();
    assertEquals("Mewtwo", enemy.getName(), "Created high level enemy");
  }

}