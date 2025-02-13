import java.util.ArrayList;
import java.util.List;

public class Library {
	ArrayList<Book> arr = new ArrayList<Book>();
	public void addBook(Book one) {
		arr.add(one);
		System.out.println("Book added to library: " + one.judul);
	}
	public void borrowBook(Borrower peminjam, Book buku) {
		if(arr.isEmpty()){
			System.out.println("There is no book to be borrowed!");
		}
		else{
			peminjam.borrowedBook(buku);
			arr.remove(buku);
			System.out.println(peminjam.nama + " borrowed: " + buku.judul);
		}
	}

	public void returnBook(Borrower peminjam, Book buku){
		arr.add(buku);
		peminjam.returnBook(buku);
		System.out.println(peminjam.nama + " returned: " + buku.judul);
	}

	public void displayLibraryBooks(){
		if(arr.isEmpty()){
			System.out.println("There is no book to be borrowed");
		}
		else{
			System.out.println("Books in Library: ");
			for(Book book : arr){
				System.out.println("Title: " + book.judul);
				System.out.println("ISBN: " + book.ISBN);
				System.out.println("Author: " + book.author.name);
				System.out.println("Biography: " + book.author.desc);
				System.out.println("------------------------");
			}
		}
	}
}