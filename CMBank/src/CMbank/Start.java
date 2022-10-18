package CMbank;

import java.util.ArrayList;
import java.util.List;

import CMbankaccounts.Account;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ejercicio2(ejercicio1());
		
	}
	
	
	private static List<Client> ejercicio1() {
		List<Client> clients = loadClients();
		loadTableClient(clients);
		return clients;
	}
	
	private static void ejercicio2(List<Client> clients) {
		List<Account> accList = new ArrayList<Account>();
		for (int i = 0; i < clients.size(); i++) {
			Account acc = new Account("Client " + i, clients.get(i)) {};
			accList.add(acc);
		}	
		loadTableAccount(accList);
	}
	
	private static void loadTableClient(List<Client> clients) {
		for (int i = 0; i < clients.size(); i++) {
			System.out.println(clients.get(i).toString());
		}
	}
	
	private static void loadTableAccount(List<Account> accList) {
		for (int i = 0; i < accList.size(); i++) {
			System.out.println(accList.get(i).toString());
		}
	}
	
	private static List<Client> loadClients() {
		List<Client> clientList = new ArrayList<Client>();
		Client client = new Client("Alex", "Arévalo");
		clientList.add(client);
		
		Client client2 = new Client("Carlos", "Garcia");
		clientList.add(client2);
		
		Client client3 = new Client("Rober","Martin");
		clientList.add(client3);
		
		return clientList;
	}
	
	
	

}