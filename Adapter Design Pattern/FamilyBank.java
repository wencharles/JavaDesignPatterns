// Family bank API

public class FamilyBank{

  // debit amount
  public void debit(int amount, String accountType){
    System.out.println("Debited: " + amount + " in " + accountType);
  }

  // credit amount
  public void credit(int amount, String accountType){
    System.out.println("Credited: " + amount + " in " + accountType);
  }
}
