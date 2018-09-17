public class Samson implements Observer{
  @Override
  public void update(Observable observable, Object obj){
    MagazineService ms = (MagazineService) obj;
    System.out.println("Samson has recieved : " + ms.getMagazine());
  }
}
