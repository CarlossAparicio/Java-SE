package CMbankaccounts;

public class Debit extends Flow {

	public Debit(String comment, int identifier, int amount, int tarjetAccountNumber, boolean effect, int dateOfFlow) {
		super(comment, identifier, amount, tarjetAccountNumber, effect, dateOfFlow);
		
	}

}
