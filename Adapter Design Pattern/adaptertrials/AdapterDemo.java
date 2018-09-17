//adapter demo

//GOT SOME PROBLEMS THAT NEED A FIX

public class AdapterDemo{
	
	public static void main(String[] args){

		//EquityBank eb = new EquityBank();

		FamilyBank fb = new FamilyBank();

		 PaymentSystem paymentSystem = new PaymentSystem(new Adapter(fb)); 

		paymentSystem.credit(4550);
		paymentSystem.debit(897);
	}
}