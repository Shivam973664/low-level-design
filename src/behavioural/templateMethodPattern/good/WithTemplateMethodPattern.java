package behavioural.templateMethodPattern.good;

public class WithTemplateMethodPattern {

	public static void main(String[] args) {
		DataParser csvParser = new CSVParser();
		csvParser.parse("C:\\Users\\ACER\\eclipse-workspace\\LLD\\src\\templateMethodPattern\\Country-data.csv");
		DataParser jsonParser = new JSONParser();
		jsonParser.parse("C:\\Users\\ACER\\eclipse-workspace\\LLD\\src\\templateMethodPattern\\UserJson.json");
	}

}
