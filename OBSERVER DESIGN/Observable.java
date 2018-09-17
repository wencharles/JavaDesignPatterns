/* Observable interface */

public interface Observable{
  // add an observer instance
  public void addObserver(Observer observer);
  // remove an observer instance
  public void removeObserver(Observer observer);
  // notify all observers of change in state
  public void notifyObservers();
}
