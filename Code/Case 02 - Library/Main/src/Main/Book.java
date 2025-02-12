package Main;

public class Book {
	String judul;
	String ISBN;
	Author author;
	int avail;
	String peminjam;
	public Book(String string1, String string2, Author abc){
		judul = string1;
		ISBN = string2;
		author = abc;
		avail = 1;
		peminjam = "-";
	}
}
