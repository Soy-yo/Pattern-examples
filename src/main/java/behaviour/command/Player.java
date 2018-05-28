package behaviour.command;

public class Player {

  public String attack() {
    return "attacking";
  }

  public String move(String direction) {
    return "moving " + direction;
  }

}
