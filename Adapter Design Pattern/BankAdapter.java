
public class BankAdapter{
  // ref to a specific bank object
  private FamilyBank bankInstance;
  // default acc type
  private final String DEFAULT_ACCOUNT_TYPE = "Saving";
  // constructor
  public BankAdapter(FamilyBank fb){
    this.bankInstance = fb;
  }
  // credit amount
  public void credit(int amount){
    this.bankInstance.credit(amount, DEFAULT_ACCOUNT_TYPE);
  }
  // debit amount
  public void debit(int amount){
    this.bankInstance.debit(amount, DEFAULT_ACCOUNT_TYPE);
  }
}
