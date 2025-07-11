package templateMethodPattern.good;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVParser extends DataParser{

	@Override
	public void readFile() {
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
		
	}

	
}
