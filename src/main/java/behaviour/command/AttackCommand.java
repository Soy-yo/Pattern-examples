package behaviour.command;

public class AttackCommand implements Command {

  private Player player;

  public AttackCommand(Player player) {
    this.player = player;
  }

  @Override
  public String execute() {
    return player.attack();
  }

}
