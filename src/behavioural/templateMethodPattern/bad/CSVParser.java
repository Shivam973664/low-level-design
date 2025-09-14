package behavioural.templateMethodPattern.bad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {

	private BufferedReader bufferReader;
	
	public void openFile(String filePath) {
		try {
			this.bufferReader = new BufferedReader(new FileReader(filePath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void parseFile(String filePath) {
		openFile(filePath);
		String line ;
		List<String> countries = new ArrayList<>();
		try {
			while((line = this.bufferReader.readLine())!=null) {
				String []value = line.split(",");
				countries.add(value[0]);
			}
			countries.forEach(System.out :: println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeFile();
	}
	
	public void closeFile() {
		try {
			this.bufferReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
