package solid.isp.good;

import solid.isp.bad.Document;

public class SimplePrinter implements Printer{

	@Override
	public void print(Document document) {
		System.out.println("Printing data : " + document);
		
	}

	

}
