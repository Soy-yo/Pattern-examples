package behaviour.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ObserverTest {

  @Test
  void test() {
    Match footballMatch = new Match("Real Madrid", "Liverpool");

    // First listener only wants to know the scoring team and the minute
    // We can use a lambda here if the interface only contains one method
    footballMatch.addGoalListener(e -> {
      int time = e.getScoringMinute();
      String team = e.getScorer();
      assertTrue(("Real Madrid".equals(team) && (time == 51 || time == 64 || time == 83)) ||
          ("Liverpool".equals(team) && time == 55), "Correct time and team");
      // To check if the listener is being called (should be printed 4 times)
      System.out.println("Goal scored: we want time and scorer");
    });

    // Second listener wants to know the scoreboard
    footballMatch.addGoalListener(e -> {
      String team1 = e.getLocalTeam();
      String team2 = e.getVisitingTeam();
      int score1 = e.getLocalTeamScore();
      int score2 = e.getVisitingTeamScore();
      assertEquals("Real Madrid", team1, "Correct teams");
      assertEquals("Liverpool", team2, "Correct teams");
      assertTrue(score1 == 1 && score2 == 0 || score1 == 1 && score2 == 1 ||
          score1 == 2 && score2 == 1 || score1 == 3 && score2 == 1, "Correct scoring order");
      // To check if the listener is being called (should be printed 4 times)
      System.out.println("Goal scored: we want scoreboard");
    });

    footballMatch.scoreGoal(true, 51);
    footballMatch.scoreGoal(false, 55);
    footballMatch.scoreGoal(true, 64);
    footballMatch.scoreGoal(true, 83);
  }

}