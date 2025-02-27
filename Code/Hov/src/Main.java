import java.util.*;

public class Main {

    public void enterToContinue(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Press Enter to Continue...");
        scan.nextLine();
    }

    public void register(){
        System.out.println("Register New Document");
        System.out.println("================================");
        Scanner scan = new Scanner(System.in);
        String name;
        do{
            System.out.print("Input document name [1-50 characters]: ");
            name = scan.nextLine();
        } while(name.length() < 1 || name.length() > 50);

        Storage storage = new Storage();
        int usedStorage = 1024 - storage.getAvailStorage();
        int size;
        do{
            System.out.println("Input document size in MB [1 - " + usedStorage + "]: ");
            size = scan.nextInt();
        } while(size < 1 || size > usedStorage);

        storage.addDocument(name, size);
        System.out.println("Success input document data!");
        enterToContinue();
    }

    public void view(){
        Storage storage = new Storage();
        ArrayList<Document> documents = storage.getDocuments();
        if(documents.size() == 0){
            System.out.println("There is no document data!");
            enterToContinue();
            return;
        }
        else{
            for(Document document : documents){
                System.out.println("Document Name: " + document.name);
                System.out.println("Document Size: " + document.size + " MB");
                System.out.println("================================");
            }
            System.out.println("OI");
        }
    }

    public void approve(){

    }

    public Main(){
        Storage storage = new Storage();
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        int remaining = 1024 - storage.getAvailStorage();
        do{
            System.out.println("Hov Document Manager");
            System.out.println("================================");
            System.out.println("Available Storage: " + remaining + " MB / 1024 MB");
            System.out.println("1) Register New Document");
            System.out.println("2) View All Documents");
            System.out.println("3) Approve Document");
            System.out.println("4) Exit");
            System.out.print(">> ");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    register();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    approve();
                    break; 
            }
        } while(choice != 4);
        System.out.println("Thankyou for using this application!");
    }

    public static void main(String[] args) {
        new Main();
    }
}
