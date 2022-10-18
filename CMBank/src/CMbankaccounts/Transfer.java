package CMbankaccounts;

public class Transfer extends Flow {

	private boolean accountNumberIssuingTransfer;
	public Transfer(String comment, int identifier, int amount, int tarjetAccountNumber, boolean effect,
			int dateOfFlow) {
		super(comment, identifier, amount, tarjetAccountNumber, effect, dateOfFlow);
	
	}
	private boolean isAccountNumberIssuingTransfer() {
		return accountNumberIssuingTransfer;
	}
	private void setAccountNumberIssuingTransfer(boolean accountNumberIssuingTransfer) {
		this.accountNumberIssuingTransfer = accountNumberIssuingTransfer;
	}
	
}
