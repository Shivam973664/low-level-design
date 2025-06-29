package ocp.good;

import java.util.logging.Logger;

public class CreditCard implements PaymentMethod{

	Logger logger= Logger.getLogger(CreditCard.class.getName());
	
	public void pay(double amount) {
		logger.info("Paying Using Credit Card of :" + amount);
	}
	
}
