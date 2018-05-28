package structure.facade;

/**
 * Facade for other operations.
 *
 * @author Soy-yo
 */
public class Menu {

  private Game game = new Game();
  private LevelCreator creator = new LevelCreator();

  public String startGame() {
    return game.start();
  }

  public String loadGame() {
    return game.load();
  }

  public String createLevel() {
    return creator.start();
  }

}
