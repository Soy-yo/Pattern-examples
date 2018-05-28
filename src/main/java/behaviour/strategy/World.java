package behaviour.strategy;

public class World {

  private Player player;

  public World(Player player) {
    this.player = player;
  }

  public Enemy spawnEnemy() {
    EnemySpawner spawner;
    if (player.getLevel() < 50) {
      spawner = new CaterpieSpawner();
    } else {
      spawner = new MewtwoSpawner();
    }
    return spawner.spawnEnemy();
  }

}
