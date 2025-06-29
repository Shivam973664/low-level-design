package srp.good;

import java.util.logging.Logger;


//Responsible for Database Related Operation
public class InvoiceRepository {

	Logger logger = Logger.getLogger(InvoiceRepository.class.getName());
	
	
	public void saveInvoice() {
		logger.info("Saving into db");
	}
}
