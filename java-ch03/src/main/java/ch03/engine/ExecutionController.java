package ch03.engine;

import java.util.List;

import ch03.model.Activity;
import ch03.model.ActivityInstance;
import ch03.model.ScopeInstance;
import ch03.model.Transition;

/**
 * @author Tom Baeyens
 */
public interface ExecutionController {

  /** starts the given scope */
  ActivityInstance startActivity(Activity activity);

  /** starts the given scope */
  ActivityInstance startActivity(Activity activity, ScopeInstance parentScopeInstance);

  List<ActivityInstance> startActivities(List<Activity> activities);

  void waitForExternalMessage();
  
  List<ActivityInstance> takeTransitions(List<Transition> transitionsToTake);
  
  ActivityInstance takeTransition(Transition transition);
  
  void onwards();

  void notifyParentFlowEnded();
}