package solid.srp.bad;

import java.util.logging.Logger;

//import java.lang.System.Logger;

public class Invoice {
	
	Logger logger= Logger.getLogger(Invoice.class.getName());
	
	private double salary;
	
	public Invoice(double salary) {
		this.salary= salary;
	}
	
	public void printLogger() {
		logger.info("Printing logs" + this.salary);
	}
	
	
	public void saveInvoice() {
		logger.info("Saving into db");
	}
	
	public void sendEmail() {
		logger.info("Sending Email");
	}
	
}
