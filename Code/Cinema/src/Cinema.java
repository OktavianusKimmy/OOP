import java.util.*;

public class Cinema {
    private ArrayList<Movie> arr = new ArrayList<Movie>();
    public void addMovie(Movie movie){
        arr.add(movie);
        System.out.println("Movie added to cinema: " + movie.getJudul());
    }

    public void rentMovie(Viewer viewer, Movie movie){
        viewer.getRentedMovie().add(movie);
        System.out.println(viewer.getName() + " rented: " + movie.getJudul());
        arr.remove(movie);
    }

    public void returnMovie(Viewer viewer, Movie movie){
        arr.add(movie);
        viewer.getRentedMovie().remove(movie);
        System.out.println("Bob returned: " + movie.getJudul());
    }

    public void displayAvailableMovies(){
        System.out.println("Movies in cinema:");
        for(Movie movie : arr){
            System.out.println("Title: " + movie.getJudul());
            System.out.println("ID: " + movie.getId());
            System.out.println("Director: " + movie.getDirectorName());
            System.out.println("Biography: " + movie.getDirectorBiography());
            System.out.println("------------------------");
        }
    }
}
