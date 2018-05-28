package behaviour.observer;

/**
 * Interface that listens for goals in a match.
 *
 * @author Soy-yo
 */
public interface GoalListener {

  void update(MatchEvent e);

}
