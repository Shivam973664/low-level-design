package behavioural.iteratorPattern.bad;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import behavioural.iteratorPattern.Book;

public class BookCollections {
	
	
//	private List<Book> books = new ArrayList<>();
	//what will happen if we change the collection in above from List to set
	//then at client code will be break see line 18
	private Set<Book> books = new TreeSet<>((a,b)-> a.getTitle().compareTo(b.getTitle()));
	
	public void addBook(Book book) {
		this.books.add(book);
	}
//	public List<Book> getBooks(){
//		return books;
//	}
	public Set<Book> getBooks(){
		return books;
	}
	
} 
