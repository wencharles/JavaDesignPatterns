
public class AdapterDemo {
  public static void main(String[] args){
    FamilyBank fb = new FamilyBank();
    PaymentSystem paymentSystem =
                              new PaymentSystem(new BankAdapter(fb));
    paymentSystem.debit(500);
    paymentSystem.credit(412);
  }
}
