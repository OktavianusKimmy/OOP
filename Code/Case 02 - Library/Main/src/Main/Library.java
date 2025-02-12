package Main;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> arr = new ArrayList<Book>();
	public void addBook(Book one) {
		arr.add(one);
		System.out.println("Book added to library: " + one.judul);
	}
	public void borrowBook(Borrower peminjam, Book buku) {
		System.out.println(peminjam.nama + " borrowed: " + buku.judul);
		buku.peminjam = peminjam.nama;
		buku.avail = 0;
	}
}
