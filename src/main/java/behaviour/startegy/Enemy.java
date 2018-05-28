package behaviour.startegy;

/**
 * Class representing an enemy in a game.
 *
 * @author Soy-yo
 */
public class Enemy {

  private String name;
  private int level;

  public Enemy(String name, int level) {
    this.name = name;
    this.level = level;
  }

  public String getName() {
    return name;
  }

  public int getLevel() {
    return level;
  }

}
