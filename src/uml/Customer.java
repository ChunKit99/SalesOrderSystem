package uml;

public class Customer {
	private String name;
	private Address address;
	private String Contact;
	private boolean active = true;
	public Customer(String name, Address address, String contact, boolean active) {
		super();
		this.name = name;
		this.address = address;
		Contact = contact;
		this.active = active;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
