package CMbank;

public class Client {
	
	private String name;
	private String firstName;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "Client [name=" + name + ", firstName=" + firstName + "]";
	}
	
	public Client(String name, String firstName) {
		super();
		this.name = name;
		this.firstName = firstName;
	}
	
}
