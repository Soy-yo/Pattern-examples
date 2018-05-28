package behaviour.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a group chat.
 *
 * @author Soy-yo
 */
public class GroupChat implements ChatMediator {

  private List<User> users = new ArrayList<>();

  @Override
  public String sendMessage(String message, User sender) {
    StringBuilder sb = new StringBuilder();
    for (User u : users) {
      if (u != sender) {
        sb.append(u.receiveMessage(message));
        sb.append('\n');
      }
    }
    return sb.toString();
  }

  @Override
  public void addUser(User u) {
    users.add(u);
  }

}
