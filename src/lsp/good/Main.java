package lsp.good;

public class Main {

	
	///Liskov Segregation Principle example
	public static void main(String[] args) {
		
		Readable readable = new ReadableFile();
		
		readable.readFile();
		
		WritableFile writable= new WritableFile();
		writable.writeFile();
		writable.readFile();
		
		readAnyFile(writable);
//		readAnyFile(readable); getting compile time error when we are passing value of readalbe
		ReadableFile readableFile = new ReadableFile();
		readAnyFile(readableFile);
	}
	
	
	public static void readAnyFile(ReadableFile readableFile) {
		readableFile.readFile();
	}

}
