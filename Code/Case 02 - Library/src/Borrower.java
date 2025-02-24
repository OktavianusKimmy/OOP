import java.util.ArrayList;
import java.util.List;

public class Borrower {
	public String nama;
	public List<Book> bukuTerpinjam;

	public Borrower(String name) {
		nama = name;
		this.bukuTerpinjam = new ArrayList<>();
	}

    public String getNama(){
        return nama;
    }

	public void displayBorrowedBooks() {
		if(bukuTerpinjam.isEmpty()){
			System.out.println("There is no borrowed books");
		}
		else{
			System.out.println(getNama() + "'s Borrowed Books: ");
			for(Book book : bukuTerpinjam){
				System.out.println("Title: " + book.judul);
				System.out.println("ISBN: " + book.ISBN);
				System.out.println("Author: " + book.author.name);
				System.out.println("Biography: " + book.author.desc);
				System.out.println("----------------------------");
			}
		}
	}

    public void borrowedBook(Book book){
        bukuTerpinjam.add(book);
    }

    public void returnBook(Book book){
        bukuTerpinjam.remove(book);
    }
}