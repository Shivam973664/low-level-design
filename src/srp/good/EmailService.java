package srp.good;

import java.util.logging.Logger;


//Responsible for communication with the services
public class EmailService {

	Logger logger = Logger.getLogger(EmailService.class.getName());
	
	public void sendEmail() {
		logger.info("Sending Email");
	}
	
}
