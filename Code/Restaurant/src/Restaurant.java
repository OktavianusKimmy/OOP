import java.util.*;

public class Restaurant {
    ArrayList<Dish> arr = new ArrayList<Dish>();
    public void addDish(Dish dish){
        arr.add(dish);
        System.out.println("Dish added to menu: " + dish.getMenu());
    }

    public void placeOrder(Customer customer, Dish dish){
        customer.getArrayList().add(dish);
        arr.remove(dish);
        System.out.println(customer.getName() + " ordered: " + dish.getMenu());
    }

    public void cancelOrder(Customer customer, Dish dish){
        customer.getArrayList().remove(dish);
        arr.add(dish);
        System.out.println(customer.getName() + " canceled order: " + dish.getMenu());
    }

    public void displayMenu(){
        System.out.println("Menu in Restaurant:");
        for(Dish dish : arr){
            System.out.println("Dish: " + dish.getMenu());
            System.out.println("ID: " + dish.getId());
            System.out.println("Chef: " + dish.getChefName());
            System.out.println("Biography: " + dish.getChefBio());
            System.out.println("------------------------");
        }
    }
}
