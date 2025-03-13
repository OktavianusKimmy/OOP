package Cinema;

import java.util.ArrayList;

public class Customer {
	private String name;
	private int age;
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}
	
	public ArrayList<Ticket> getTicket(){
		return tickets;
	}
	
}
