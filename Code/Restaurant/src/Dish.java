public class Dish {
    private String menu;
    private String id;
    private Chef chef;

    public Dish(String menu, String id, Chef chef){
        this.menu = menu;
        this.id = id;
        this.chef = chef;
    }

    public String getMenu(){
        return menu;
    }

    public String getId(){
        return id;
    }

    public String getChefName(){
        return chef.getName();
    }

    public String getChefBio(){
        return chef.getBio();
    }

}
