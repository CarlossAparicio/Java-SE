package CMbankaccounts;

public abstract class Flow {
	private String comment;
	private int identifier;
	private int amount;
	private int tarjetAccountNumber;
	private boolean effect;
	private int dateOfFlow;
	
	private String getComment() {
		return comment;
	}
	private void setComment(String comment) {
		this.comment = comment;
	}
	private int getIdentifier() {
		return identifier;
	}
	private void setIdentifier(int identifier) {
		this.identifier = identifier;
	}
	private int getAmount() {
		return amount;
	}
	private void setAmount(int amount) {
		this.amount = amount;
	}
	private int getTarjetAccountNumber() {
		return tarjetAccountNumber;
	}
	private void setTarjetAccountNumber(int tarjetAccountNumber) {
		this.tarjetAccountNumber = tarjetAccountNumber;
	}
	private boolean isEffect() {
		return effect;
	}
	private void setEffect(boolean effect) {
		this.effect = effect;
	}
	private int getDateOfFlow() {
		return dateOfFlow;
	}
	private void setDateOfFlow(int dateOfFlow) {
		this.dateOfFlow = dateOfFlow;
	}
	public Flow(String comment, int identifier, int amount, int tarjetAccountNumber, boolean effect, int dateOfFlow) {
		super();
		this.comment = comment;
		this.identifier = identifier;
		this.amount = amount;
		this.tarjetAccountNumber = tarjetAccountNumber;
		this.effect = effect;
		this.dateOfFlow = dateOfFlow;
	}
	
	
	
}
