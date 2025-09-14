package behavioural.iteratorPattern;

public class Book {

	private String title;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

	public Book(String title) {
		super();
		this.title = title;
	}
	
	
}
