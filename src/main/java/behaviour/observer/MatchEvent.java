package behaviour.observer;

/**
 * Interface representing an event in a match.
 *
 * @author Soy-yo
 */
public interface MatchEvent {

  String getLocalTeam();

  String getVisitingTeam();

  String getScorer();

  int getLocalTeamScore();

  int getVisitingTeamScore();

  int getScoringMinute();

}
