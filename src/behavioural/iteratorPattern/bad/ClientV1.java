package behavioural.iteratorPattern.bad;

import java.util.Set;
import java.util.TreeSet;

import behavioural.iteratorPattern.Book;

public class ClientV1 {

	public static void main(String[] args) {
		Book b1  = new Book("Java Book");
		Book b2  = new Book("C++ Book");
		Book b3  = new Book("Python Book");
		BookCollections bookCollections = new BookCollections();
		bookCollections.addBook(b1);
		bookCollections.addBook(b2);
		bookCollections.addBook(b3);
		//below line will be break if change the collection
//		List<Book> books = bookCollections.getBooks();
		Set<Book> books = bookCollections.getBooks();
//		for(int i=0;i<books.size();i++) {
//			System.out.println(books.get(i));
//			System.out.println(books); whole logic will be broke
			books.forEach(a-> System.out.println(a));
//		}
		
	}

}
