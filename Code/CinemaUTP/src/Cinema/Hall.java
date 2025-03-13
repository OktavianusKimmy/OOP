package Cinema;

import java.util.ArrayList;

public class Hall {
	private int no;
	private int capacity;
	
	public Hall(int no, int capacity) {
		this.no = no;
		this.capacity = capacity;
	}
	
	public int getNo() {
		return no;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	private ArrayList<Showtime> showtimes = new ArrayList<Showtime>();
	
	public ArrayList<Showtime> getShowTime() {
		return showtimes;
	}
	
	public void addShowtime(Showtime showtime) {
		showtimes.add(showtime);
	}
}
