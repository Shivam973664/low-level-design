package structurePattern.strategyPattern;

import ocp.good.PaymentMethod;

class PaymentService{
	public void paymentMethod(String methodName) {
		if("UPI".equals(methodName)) {
			System.out.println("Paying Payment By Using UPI");
		}else if("PAYPAL".equals(methodName)) {
			System.out.println("Paying Payment By Using Pay Pal");
		}else {
			System.out.println("Unsupported Payment Method");
		}
	}
}


public class WithoutStrategyPattern {

	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService();
		paymentService.paymentMethod("PAYPAL");
	}
}
