public class Alice implements Observer{
  @Override
  public void update(Observable observable, Object obj){
    MagazineService ms = (MagazineService) obj;
    System.out.println("Alice has recieved : " + ms.getMagazine());
  }
}
