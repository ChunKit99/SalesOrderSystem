package uml;

public class Customer extends User{
	private String name;
	private String address;
	private String Contact;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String username, String password, int type, String name, String address, String contact) {
		super(username, password, type);
		this.name = name;
		this.address = address;
		Contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	
	
}
