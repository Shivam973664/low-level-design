package behavioural.iteratorPattern.good;

import java.util.ArrayList;
import java.util.List;

import behavioural.iteratorPattern.Book;

public class BookCollectionV2 {

	private List<Book> books = new ArrayList<>();
	
	public void addBook(Book book) {
		this.books.add(book);
	}
//	public List<Book> getBooks(){
//		return books;
//	}
	
	public IteratorCustom<Book> createIterator(){
		return new BookIterator(this.books);
	}
	
	
	//another class  it is nested class for handling the 
	// iterator object
	//why this class implemented here . because : the logic of this class depends upon the logic 
	//of the above class. see the books is using the list collection which is defined in above class 
	//so below class depend upon above class
	private class BookIterator implements IteratorCustom<Book>{

		private int position =0;
		private List<Book> books;
		
		public BookIterator(List<Book> theBook) {
			this.books = theBook;
		}
		
		@Override
		public boolean hasNext() {
			return this.books.size() > this.position;
		}

		@Override
		public Book next() {
			return this.books.get(position++);
		}
		
	}
	
}
