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


/*
import java.util.ArrayList;
import java.util.List;

public class Borrower{
    String nama;
    private List<Book>  borrowedBook;
    public Borrower(String nama){
        this.nama = nama;
        this.borrowedBook = new ArrayList<>();
    }
    public String getNama(){
        return nama;
    }

    public void displayBorrowedBooks(){
        if(borrowedBook.isEmpty()){
            System.out.println("No book is borrowed");
        }
        else{
            System.out.println(getNama() + "'s Borrowed Books: ");
            for(Book book : borrowedBook){
                System.out.println("Title: " + book.getJudul());
                System.out.println("ISBN: " + book.getISBN());
                System.out.println("Author: " + book.getAuthor().getNama());
                System.out.println("Biography: " + book.getAuthor().getDescription());
                System.out.println("----------------------------");
            }
        }
    }

    public void borrowBook(Book book){
        borrowedBook.add(book);
    }

    public void returnBook(Book book){
        borrowedBook.remove(book);
    }

}
 */