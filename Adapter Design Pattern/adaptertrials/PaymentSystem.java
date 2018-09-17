//create the payment system where all the bank modules call

public class PaymentSystem{
	private Adapter adapter;

	public PaymentSystem(Adapter adapter){
	this.adapter = adapter;
	}

	public void credit(int amount){
	this.adapter.credit(amount);
	}

	public void debit(int amount){
	this.adapter.debit(amount);
	}
}