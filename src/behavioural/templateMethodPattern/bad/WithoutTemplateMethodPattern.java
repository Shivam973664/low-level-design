package behavioural.templateMethodPattern.bad;

public class WithoutTemplateMethodPattern {

	public static void main(String[] args) {
		JSONParser jsonParser = new JSONParser();
		CSVParser csvparser = new CSVParser();
//		jsonParser.openFile("C:\\Users\\ACER\\eclipse-workspace\\LLD\\src\\templateMethodPattern\\UserJson.json");
//		csvparser.openFile("C:\\Users\\ACER\\eclipse-workspace\\LLD\\src\\templateMethodPattern\\Country-data.csv");
		jsonParser.parseFile("C:\\Users\\ACER\\eclipse-workspace\\LLD\\src\\templateMethodPattern\\UserJson.json");
		csvparser.parseFile("C:\\Users\\ACER\\eclipse-workspace\\LLD\\src\\templateMethodPattern\\Country-data.csv");
//		jsonParser.closeFile();
//		csvparser.closeFile();
		
	}
	

}
