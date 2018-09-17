
public class PaymentSystem{
  // reference to Equity bank payment API
  private BankAdapter bankAdapter;

  //ctor
  public PaymentSystem(BankAdapter bankAdapter){
    this.bankAdapter = bankAdapter;
  }

  // credit account
  public void credit(int amount){
    this.bankAdapter.credit(amount);
  }

  // debit account
  public void debit(int amount){
    this.bankAdapter.debit(amount);
  }
}
