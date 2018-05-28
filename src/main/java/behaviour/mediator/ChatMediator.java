package behaviour.mediator;

/**
 * Typical example. A chat mediator.
 *
 * @author Soy-yo
 */
public interface ChatMediator {

  String sendMessage(String message, User sender);

  void addUser(User u);

}
