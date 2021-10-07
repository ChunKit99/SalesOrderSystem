package uml;

public class OrderDetail {
	private int qty;
	private Item item;

	public OrderDetail(int qty, Item item) {
		super();
		this.qty = qty;
		this.item = item;
	}

	public double calculateSubTotal() {
		return item.getPriceForQuantity(qty);
	}

	public double calculateWeight() {
		return item.getWeight() * qty;
	}
	 
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
