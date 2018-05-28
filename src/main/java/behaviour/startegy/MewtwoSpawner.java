package behaviour.startegy;

/**
 * High level enemy spawner. Might be a lambda but this implementation is clearer for the pattern.
 *
 * @author Soy-yo
 */
public class MewtwoSpawner implements EnemySpawner {

  @Override
  public Enemy spawnEnemy() {
    return new Enemy("Mewtwo", 70);
  }

}
