import java.util.*;

public class Storage {

    private int usedStorage = 0;
    private ArrayList<Document> documents = new ArrayList<Document>();

    public int getAvailStorage(){
        return usedStorage;
    }

    public ArrayList<Document> getDocuments(){
        return documents;
    }

    public void addDocument(Document document){
        documents.add(document);
        System.out.println("Document added successfully!");
        usedStorage += document.size;
    }
}
