package solid.ocp.good;

public class PaymentProcessor {

	public void processPayment(PaymentMethod paymentMethod, double amount) {
		//this is also an example of runtime polymorphism 
		paymentMethod.pay(amount);
	}

}
