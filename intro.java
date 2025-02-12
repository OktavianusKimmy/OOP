import java.util.*;

public class Main {
    public Scanner sc;
    int x = 99;
    String nama = "anton";
    
    //constructor (coding disini)
    public Main(){
      x = 88;
      
      System.out.println("welcome " + nama);
      
      
      sc = new Scanner(System.in);
      String nama = sc.nextLine();
      System.out.println("welcome " + nama);

      System.out.println(Math.cos(88));
      Main.Hello();
    }
    
    public static void Hello(){
      System.out.println("Static function");
    }
    
    public static void main(String[] args) {
      new Main(); //create object from class Main
      
  }
}