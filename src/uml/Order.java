package uml;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
	private String orderId;
	private LocalDate createDate = LocalDate.now();
	private OrderStatus orderStatus = OrderStatus.CREATE;
	private ArrayList<OrderDetail> orderDetail;
	private Customer customer;
	private Payment payment;

	public Order(String orderId, Customer customer) {
		super();
		this.orderId = orderId;
		this.customer = customer;
	}

	public void addOrderItem(int qty, Item itemToAdd) {
		OrderDetail newItemOrder = new OrderDetail(qty, itemToAdd);
		orderDetail.add(newItemOrder);
	}

	public void displayOverallOrderInfo() {
		System.out.println("Order List");
		for (int i = 0; i < orderDetail.size(); i++) {
			System.out.print("Item "+(i + 1));
			System.out.println("Description: " + orderDetail.get(i).getItem().getDescription());
			System.out.println("Price: " + orderDetail.get(i).getItem().getPrice());
			System.out.println("Quantity Order: " + orderDetail.get(i).getQty());
			System.out.println("Total Price: " + orderDetail.get(i).calculateSubTotal());
			System.out.println("Total Weight: " + orderDetail.get(i).calculateWeight());
		}
	}

	public void modifyOrderItem() {
		//TODO
	}

	public void pay(Payment payment) {
		setPayment(payment);
	}

	public double getTotalAmountToPay() {
		double amountToPay = 0;
		for (int i = 0; i < orderDetail.size(); i++) {
			amountToPay += orderDetail.get(i).calculateSubTotal();
		}
		return amountToPay;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void setOrderDetail(ArrayList<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	public void modifyOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public ArrayList<OrderDetail> getOrderDetail() {
		return orderDetail;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
