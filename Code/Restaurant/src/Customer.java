import java.util.*;

public class Customer {
    private String name;
    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    private ArrayList<Dish> order = new ArrayList<Dish>();

    public ArrayList<Dish> getArrayList(){
        return order;
    }

    public void displayOrders(){
        System.out.println(getName() + "'s Orders:");
        for(Dish dish : order){
            System.out.println("Dish: " + dish.getMenu());
            System.out.println("ID: " + dish.getId());
            System.out.println("Chef: " + dish.getChefName());
            System.out.println("Biography: " + dish.getChefBio());
            System.out.println("------------------------");
        }
    }
    
}
