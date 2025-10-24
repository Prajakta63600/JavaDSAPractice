package OOPSConcepts;

import java.util.ArrayList;

class Book {
	private String name;
	private String author;
	private String ISBN;

	private static ArrayList<Book> list = new ArrayList<>();

	public Book(String name, String author, String ISBN) {
		this.name = name;
		this.author = author;
		this.ISBN = ISBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public static boolean Add_bookCollection(Book Book) {
		return list.add(Book);
	}

	public static boolean remove_bookCollection(Book Book) {
		return list.remove(Book);
	}

	public static ArrayList<Book> getList() {
		return list;
	}
}

public class AddAndRemoveBookCollection {

	public static void main(String[] args) {
		Book book1 = new Book("Love Aaj Kal", "Rajiv Gandhi", "20098977008");
		Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
		System.out.println("'" + book1.getName() + "' is a name of book written by " + book1.getAuthor()
				+ " with ISBN number " + book1.getISBN());

		System.out.println(
				book2.getName() + " is written by " + book2.getAuthor() + " and ISBN number is " + book2.getISBN());

		System.out.println();
		
		Book.Add_bookCollection(book1);
		Book.Add_bookCollection(book2);
		System.out.println("Collection list is: ");
		ArrayList<Book> list = Book.getList();
		for(Book collection : list) {
			System.out.println(collection.getName()+" is Book name eritten by "+collection.getAuthor()+" with USBN number "+collection.getISBN());
		}
		
		Book.remove_bookCollection(book2);
		System.out.println("Removed List: ");
		
		for(Book collection : list) {
			System.out.println(collection.getName()+" is Book name eritten by "+collection.getAuthor()+" with USBN number "+collection.getISBN());
		}
	}

}
