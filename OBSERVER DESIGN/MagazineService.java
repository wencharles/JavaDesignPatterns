import java.util.List;
import java.util.ArrayList;

public class MagazineService implements Observable{
  private String magazine;
  private List<Observer> observers;

  public MagazineService(){
    observers = new ArrayList<>();
  }

  // change the state of a MagazineService instance
  public void setMagazine(String magazine){
    this.magazine = magazine;
    // notify all observers iff there is a state change.
    this.notifyObservers();
  }

  // query the state of a MagazineService instance
  public String getMagazine(){
    return this.magazine;
  }

  @Override
  public void addObserver(Observer observer){
    this.observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer){
    this.observers.remove(observer);
  }

  @Override
  public void notifyObservers(){
    for(Observer ob : this.observers){
      ob.update(this, this);
    }
  }
}
