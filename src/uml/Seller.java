package uml;

public class Seller extends User {
	private String shopName;

	public Seller() {
		// TODO Auto-generated constructor stub
	}
	public Seller(String username, String password, int type, String shopName) {
		super(username, password, type);
		this.shopName = shopName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	//TODO add item, modify item
	public void addItem(Item item) {
		
	}
}
