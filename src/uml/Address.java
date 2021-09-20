package uml;

public class Address {
	private String state;
	private String area;
	private String poscode;
	public Address(String state, String area, String poscode) {
		super();
		this.state = state;
		this.area = area;
		this.poscode = poscode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPoscode() {
		return poscode;
	}
	public void setPoscode(String poscode) {
		this.poscode = poscode;
	}
	
	
}
