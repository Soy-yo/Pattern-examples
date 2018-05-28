package behaviour.startegy;

/**
 * Class representing a player in a game.
 *
 * @author Soy-yo
 */
public class Player {

  private String name;
  private int level;

  public Player(String name) {
    this.name = name;
    level = 1;
  }

  public String getName() {
    return name;
  }

  public int getLevel() {
    return level;
  }

  public void levelUp(int levels) {
    level += levels;
  }

}
