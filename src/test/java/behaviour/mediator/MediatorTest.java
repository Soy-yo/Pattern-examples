package behaviour.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MediatorTest {

  @Test
  void test() {
    ChatMediator chat = new GroupChat();

    User u1 = new User("Soy-yo");
    User u2 = new User("Guest");
    User u3 = new User("lauracastilla9");

    u1.joinChat(chat);
    u2.joinChat(chat);
    u3.joinChat(chat);

    String result = u2.sendMessage("Hi friends =)");
    assertEquals("Soy-yo has received \"Hi friends =)\"\n" +
        "lauracastilla9 has received \"Hi friends =)\"\n", result, "Message properly sent");
  }

}