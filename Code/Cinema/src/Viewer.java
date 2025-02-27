import java.util.*;

public class Viewer {
    private String name;
    public Viewer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    private ArrayList<Movie> rented = new ArrayList<Movie>();

    public ArrayList<Movie> getRentedMovie(){
        return rented;
    }

    public void displayRentedMovies(){
        System.out.println("Bob's Rented Movies:");
        for(Movie movie : rented){
            System.out.println("Title: " + movie.getJudul());
            System.out.println("ID: " + movie.getId());
            System.out.println("Director: " + movie.getDirectorName());
            System.out.println("Biography: " + movie.getDirectorBiography());
            System.out.println("------------------------");
        }
    }
}
