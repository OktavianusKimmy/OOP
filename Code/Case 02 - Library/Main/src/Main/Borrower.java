package Main;

public class Borrower {
	public void displayBorrowedBooks() {
//		System.out.print("tes");
		Library library = new Library();
		library.arr.forEach((n) -> {
			System.out.println(n.peminjam + "'s Borrowed Books:");
			System.out.println("Title: " + n.judul);
			System.out.println("ISBN: " + n.ISBN);
			System.out.println("Author: " + n.author.name);
			System.out.println("Biography: " + n.author.desc);
			System.out.println("------------------------");
		});
	}
	String nama;
	public Borrower(String name) {
		nama = name;
	}
}
