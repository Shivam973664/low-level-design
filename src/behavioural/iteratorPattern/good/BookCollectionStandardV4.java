package behavioural.iteratorPattern.good;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import behavioural.iteratorPattern.Book;

public class BookCollectionStandardV4 implements Iterable<Book>{
	
	private Set<Book> books = new HashSet<>();
	
	public void addBook(Book book) {
		this.books.add(book);
	}

	@Override
	public Iterator<Book> iterator() {
		return this.books.iterator();
	}

}

