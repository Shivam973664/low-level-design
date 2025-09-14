package solid.ocp.good;

import java.util.logging.Logger;

public class DebitCard implements PaymentMethod{

	Logger logger= Logger.getLogger(DebitCard.class.getName());
	
	public void pay(double amount) {
		logger.info("Paying Using Debit Card of :" + amount);
	}
	
}
