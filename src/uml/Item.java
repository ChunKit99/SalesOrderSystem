package uml;

public class Item {
	private String id;
	private double price;
	private double weight;
	private String description;

	public Item(String id, double price, double weight, String description) {
		super();
		this.id = id;
		this.price = price;
		this.weight = weight;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPriceForQuantity(int qty) {
		return qty * price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
