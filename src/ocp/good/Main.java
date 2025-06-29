package ocp.good;

public class Main {
	
	public static void main(String[] args) {
		PaymentProcessor paymentprocess= new PaymentProcessor();
		PaymentMethod paymentMethod = new CreditCard();
		PaymentMethod upiMethod = new UPI();
		paymentprocess.processPayment(paymentMethod, 100);
		paymentprocess.processPayment(upiMethod, 120);
	}

}
