package Cinema;

import java.util.*;
import java.util.Iterator;

public class Cinema {
	private String name;
	private String location;
	
	public Cinema(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLocation() {
		return location;
	}
	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	ArrayList<Hall> halls = new ArrayList<Hall>();
	
	public void addHall(Hall hall) {
		halls.add(hall);
	}
	
	public void displayCinemaInfo() {
		System.out.println("Cinema: " + name);
		System.out.println("Location: " + location);
		System.out.println();
		
		System.out.println("Employees:");
		for(Employee employee : employees) {
			System.out.println("- Name: " + employee.getName() + ", Role: " + employee.getRole());
		}
		System.out.println();
		System.out.println("Halls:");
		for(Hall hall : halls) {
			System.out.println("Hall " + hall.getNo() + " (Capacity: " + hall.getCapacity() + ")");
			System.out.println("  Showtimes:");
			for(Showtime showtime : hall.getShowTime()) {
				System.out.println("    - Movie: " + showtime.getMovie().getTitle());
				System.out.println("      Time: " + showtime.getTime() + ", Date: " + showtime.getDate());
				System.out.print("      Tickets:");
				
				if(showtime.getTicket().isEmpty() == true) {
					System.out.println(" No tickets booked yet.");
					
				}
				else {
					for(Ticket ticket : showtime.getTicket()){
						System.out.println();
						System.out.print("        * Ticket ID: " + ticket.getId() + ", Price: $" + ticket.getPrice() + ", Customer: " + ticket.getCustomer().getName() + ", Payment Status: ");
						if(ticket.getPaymentStatus() == true) {
							System.out.println("Paid");
						}
						else {
							System.out.println("Unpaid");
						}
					}
				}
				
				System.out.println();
			}
		}
		System.out.println("Customers:");
		for(Hall hall : halls) {
			for(Showtime showtime : hall.getShowTime()) {
				for(Ticket ticket : showtime.getTicket()) {
					System.out.println("- Name: " + ticket.getCustomer().getName() + ", Age: " + ticket.getCustomer().getAge());
					System.out.println("  Tickets:");
					System.out.print("    * Ticket ID: " + ticket.getId() + ", Movie: " + showtime.getMovie().getTitle() + ", Showtime: " + showtime.getTime() + ", Date: " + showtime.getDate() + ", Price: " + ticket.getPrice() + ", Status: ");
					if(ticket.getPaymentStatus() == true) {
						System.out.println("Paid");
					}
					else {
						System.out.println("Unpaid");
					}
				}
			}
		}
		
//		for(Hall hall : halls) {
//			for(Showtime showtime : hall.getShowTime()) {
//				for(Ticket ticket : showtime.getTicket()) {
//					System.out.println("- Name: " + ticket.getCustomer().getName() + ", Age: " + ticket.getCustomer().getAge());
//					System.out.println("  Tickets:");
//					for(Ticket tick : ticket.getCustomer().getTicket()) {
//						System.out.print("    * Ticket ID: " + tick.getCustomer().getName() + ", Movie: " + showtime.getMovie().getTitle() + ", Showtime: " + showtime.getTime() + ", Date: " + showtime.getDate() + ", Price: " + tick.getPrice() + ", Status: ");
//						if(tick.getPaymentStatus() == true) {
//							System.out.println("Paid");
//						}
//						else {
//							System.out.println("Unpaid");
//						}
//					}
//				}
//			}
//		}
	}
	
}
