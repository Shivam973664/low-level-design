package behavioural.templateMethodPattern.good;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class DataParser {
	protected BufferedReader bufferReader;
	
	
	///**********template method defines the steps of the algorithm
		public final void parse(String path) {
			openFile(path);
			readFile();
			closeFile();
		}
		

	protected void openFile(String filePath) {
		try {
			this.bufferReader = new BufferedReader(new FileReader(filePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	protected void closeFile() {
		try {
			this.bufferReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	protected abstract void readFile();

}
