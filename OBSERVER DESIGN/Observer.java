/* Observer interface */


public interface Observer{
  // notify the observer of the change in state
  public void update(Observable observable, Object object);
}
