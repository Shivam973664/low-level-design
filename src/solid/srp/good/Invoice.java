package solid.srp.good;

import java.util.logging.Logger;

//It is responsible for holding and Generating invoice
public class Invoice {

Logger logger= Logger.getLogger(Invoice.class.getName());
	
	private double salary;
	
	public Invoice(double salary) {
		this.salary= salary;
	}
	
	public void printLogger() {
		logger.info("Printing logs" + this.salary);
	}
	
	
	
}
