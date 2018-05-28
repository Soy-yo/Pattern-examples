package behaviour.observer;

/**
 * Interface that will notify when things happen in a match.
 *
 * @author Soy-yo
 */
public interface MatchNotifier {

  void addGoalListener(GoalListener listener);

  void removeGoalListener(GoalListener listener);

}
