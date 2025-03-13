package Cinema;

import java.util.ArrayList;

public class Showtime {
	private String time;
	private String date;
	Movie movie;
	
	public Showtime(String time, String date, Movie movie) {
		this.time = time;
		this.date = date;
		this.movie = movie;
	}
	
	public String getTime() {
		return time;
	}
	
	public String getDate() {
		return date;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	
	public ArrayList<Ticket> getTicket(){
		return tickets;
	}
	
	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}
	
	
}
