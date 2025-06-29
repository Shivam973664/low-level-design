package ocp.bad;

import java.util.logging.Logger;

public class PaymentProcessor {

	Logger logger = Logger.getLogger(PaymentProcessor.class.getName());
	public void processPayment(String paymentMethod, double amount) {
		
		if(paymentMethod.equals("Credit Card")) {
			//some payment related logic
			logger.info("Paying Payment By Using Credit Card of : "+ amount);
		}else if(paymentMethod.equals("Debit Card")) {
			//some payment related logic
			logger.info("Paying Payment By Using Debit Card of : "+ amount);
		}else if(paymentMethod.equals("Paypal")) {
			//some payment related logic
			logger.info("Paying Payment By Using Paypal of : "+ amount);
		}else {
			throw new IllegalArgumentException("Unsupported Payment Method");
		}
		
	}
}
