package Cinema;

public class Ticket {
	private int id;
	private double price;
	Customer customer;
	private boolean paymentStatus;
	
	public Ticket(int id, double price, Customer customer) {
		this.id = id;
		this.price = price;
		this.customer = customer;
		this.paymentStatus = true;
	}
	
	public int getId() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public boolean getPaymentStatus() {
		return paymentStatus;
	}
	
	
}
