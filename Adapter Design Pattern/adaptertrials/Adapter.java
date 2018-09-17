//the adapter class
//this is the class that links the core system o=to the interfacing systems 

public class Adapter{
	// instance no longer needed private EquityBank bankInstance;

	//create a constructor that takes in the currenyt instance of the bank 
	//initializes the bank instance to the parameter passed in 

	/*public Adapter(EquityBank eb){
	this.bankInstance = eb;
	}

	public void debit(int amount){
	this.bankInstance.debit(amount);
	}
	public void credit(int amount){
	this.bankInstance.credit(amount);
	}*/

	private FamilyBank bankInstance;

	//it is the adapter that supplies the code

	private static final int BANK_CODE = 234;

	//take the instance initialize it to the specific bank needed
	public Adapter(FamilyBank fb){
		this.bankInstance = fb;
	}

	public void credit(int amount, BANK_CODE)
	{
		this.bankInstance.credit(amount, BANK_CODE);
	}

	public void debit(int amount, BANK_CODE)
	{
		this.bankInstance.debit(amount, BANK_CODE);
	}



}