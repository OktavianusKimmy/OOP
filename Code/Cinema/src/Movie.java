public class Movie {
    private String judul;
    private String id;
    private Director director;
    public Movie(String judul, String id, Director director){
        this.judul = judul;
        this.id = id;
        this.director = director;
    }

    public String getJudul(){
        return judul;
    }

    public String getId(){
        return id;
    }

    public String getDirectorName(){
        return director.getName();
    }

    public String getDirectorBiography(){
        return director.getBiography();
    }
}
