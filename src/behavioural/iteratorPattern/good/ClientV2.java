package behavioural.iteratorPattern.good;

import java.util.Iterator;

import behavioural.iteratorPattern.Book;

public class ClientV2 {

	public static void main(String[] args) {
		Book b1  = new Book("Java Book");
		Book b2  = new Book("C++ Book");
		Book b3  = new Book("Python Book");
		Book b4  = new Book("Python Book");
		System.out.println("By Using List as the Implmentation");
		
		BookCollectionV2 bookCollectionV2 = new BookCollectionV2();
		bookCollectionV2.addBook(b1);
		bookCollectionV2.addBook(b2);
		bookCollectionV2.addBook(b4);
		bookCollectionV2.addBook(b3);
		
		BookCollectionSetV3 bookCollectionSetV3 = new BookCollectionSetV3();
		bookCollectionSetV3.addBook(b1);
		bookCollectionSetV3.addBook(b2);
		bookCollectionSetV3.addBook(b3);
		bookCollectionSetV3.addBook(b4);
		
		IteratorCustom<Book> iteratorList = bookCollectionV2.createIterator();
		while(iteratorList.hasNext()) {
			System.out.println(iteratorList.next());
		}
		
		System.out.println("If we are using set");
		IteratorCustom<Book> iteratorSet = bookCollectionSetV3.createIterator();
		while(iteratorSet.hasNext()) {
			System.out.println(iteratorSet.next());
		}
		
		System.out.println("By using standard way");
		
		
		BookCollectionStandardV4 bookCollectionSetV4 = new BookCollectionStandardV4();
		bookCollectionSetV4.addBook(b1);
		bookCollectionSetV4.addBook(b2);
		bookCollectionSetV4.addBook(b3);
		bookCollectionSetV4.addBook(b4);
		
		Iterator<Book> iteratorStandard = bookCollectionSetV4.iterator();
		while(iteratorStandard.hasNext()) {
			System.out.println(iteratorStandard.next());
		}
		
	}

}
