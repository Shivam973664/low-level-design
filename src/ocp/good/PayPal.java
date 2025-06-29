package ocp.good;

import java.util.logging.Logger;

public class PayPal implements PaymentMethod{

	Logger logger= Logger.getLogger(PayPal.class.getName());
	
	public void pay(double amount) {
		logger.info("Paying Using PayPal of :" + amount);
	}
	
}