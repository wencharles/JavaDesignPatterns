public class Charles implements Observer{
  @Override
  public void update(Observable observable, Object obj){
    MagazineService ms = (MagazineService) obj;
    System.out.println("Charles has recieved : " + ms.getMagazine());
  }
}
