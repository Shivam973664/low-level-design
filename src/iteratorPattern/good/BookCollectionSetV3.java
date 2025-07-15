package iteratorPattern.good;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import iteratorPattern.Book;

public class BookCollectionSetV3 {

	private Set<Book> books = new TreeSet<>((a,b) -> a.getTitle().compareTo(b.getTitle()));
	
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	//no need of this method now
//	public Set<Book> getBook() {
//		return this.books;
//	}
	
	public IteratorCustom<Book> createIterator() {
		return new BookIteratorSet(this.books);
	}
	
	private class BookIteratorSet implements IteratorCustom<Book>{
		
		
		private Iterator<Book> iterator;
		
		public BookIteratorSet(Set<Book> books) {
			 this.iterator =books.iterator();
		}
		
		@Override
		public boolean hasNext() {
			return this.iterator.hasNext();
		}

		@Override
		public Book next() {
			// TODO Auto-generated method stub
			return this.iterator.next();
		}
		
	}
}
