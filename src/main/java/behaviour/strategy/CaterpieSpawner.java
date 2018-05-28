package behaviour.strategy;

/**
 * Low level enemy spawner. Might be a lambda but this implementation is clearer for the pattern.
 *
 * @author Soy-yo
 */
public class CaterpieSpawner implements EnemySpawner {

  @Override
  public Enemy spawnEnemy() {
    return new Enemy("Caterpie", 5);
  }

}
