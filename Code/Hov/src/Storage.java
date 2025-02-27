import java.util.*;

public class Storage {
    private String name;
    private int size;

    private int usedStorage = 0;
    private ArrayList<Document> documents = new ArrayList<Document>();

    public int getAvailStorage(){
        return usedStorage;
    }

    public ArrayList<Document> getDocuments(){
        return documents;
    }

    public void addDocument(String name, int size){
        Document document = new Document(name, size);
        documents.add(document);
        usedStorage += size;
    }
}
