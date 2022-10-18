package CMbankaccounts;

import CMbank.Client;

public abstract class Account{
	
	protected String label;
	protected String balance;
	protected String accountNumber;
	protected Client client;
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Account(String label, Client client) {
		super();
		this.label = label;
		this.client = client;
		this.accountNumber = AccountNum();
	}
	
	private String AccountNum() {
		int numero = (int)(Math.random()*10+1);
		return String.valueOf(numero);		
	}
	@Override
	public String toString() {
		return "Account [label=" + label + ", balance=" + balance + ", accountNumber=" + accountNumber + ", client="
				+ client + "]";
	}	
	
	
}
