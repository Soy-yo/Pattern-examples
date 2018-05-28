package behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a match that notifies when goals are scored.
 *
 * @author Soy-yo
 */
public class Match implements MatchNotifier {

  private String localTeam;
  private String visitingTeam;
  private int localScore;
  private int visitingScore;

  private List<GoalListener> listeners;

  public Match(String localTeam, String visitingTeam) {
    this.localTeam = localTeam;
    this.visitingTeam = visitingTeam;
    localScore = 0;
    visitingScore = 0;
    listeners = new ArrayList<>();
  }

  @Override
  public void addGoalListener(GoalListener listener) {
    listeners.add(listener);
  }

  @Override
  public void removeGoalListener(GoalListener listener) {
    listeners.remove(listener);
  }

  public void scoreGoal(boolean local, int minute) {
    if (local) {
      localScore++;
    } else {
      visitingScore++;
    }
    // Created here instead of having an inner class because we want to know the last scorer and
    // it's easier to know it here.
    fireMatchEvent(new MatchEvent() {
      @Override
      public String getLocalTeam() {
        return localTeam;
      }

      @Override
      public String getVisitingTeam() {
        return visitingTeam;
      }

      @Override
      public String getScorer() {
        return local ? localTeam : visitingTeam;
      }

      @Override
      public int getLocalTeamScore() {
        return localScore;
      }

      @Override
      public int getVisitingTeamScore() {
        return visitingScore;
      }

      @Override
      public int getScoringMinute() {
        return minute;
      }
    });
  }

  /**
   * Method that notifies to all registered observers the given event.
   */
  private void fireMatchEvent(MatchEvent e) {
    for (GoalListener gl : listeners) {
      gl.update(e);
    }
  }

}
