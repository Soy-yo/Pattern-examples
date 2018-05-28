package behaviour.command;

public class MoveCommand implements Command {

  private Player player;
  private String direction;

  public MoveCommand(Player player, String direction) {
    this.player = player;
    this.direction = direction;
  }

  @Override
  public String execute() {
    return player.move(direction);
  }

}
