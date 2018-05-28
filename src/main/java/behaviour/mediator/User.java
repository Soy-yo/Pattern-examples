package behaviour.mediator;

/**
 * Class representing a chat user. Typically it is an abstract class with send/receive method s
 * abstract but this time it didn't look necessary.
 *
 * @author Soy-yo
 */
public class User {

  private String nickname;
  private ChatMediator currentChat;

  public User(String nickname) {
    this.nickname = nickname;
  }

  public String getNickname() {
    return nickname;
  }

  public void joinChat(ChatMediator chat) {
    currentChat = chat;
    chat.addUser(this);
  }

  public String sendMessage(String message) {
    if (currentChat == null) {
      throw new IllegalStateException("User hasn't joined any chat");
    }
    return currentChat.sendMessage(message, this);
  }

  public String receiveMessage(String message) {
    return nickname + " has received \"" + message + "\"";
  }

}
