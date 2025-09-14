package structurePattern.strategyPattern;

interface PaymentMethod{
	public void processPayment() ;
}
class CreditCard implements PaymentMethod{

	@Override
	public void processPayment() {
		System.out.println("Paying Payment through " + "Credi Card");
	}
	
}

class DebitCard implements PaymentMethod{

	@Override
	public void processPayment() {
		System.out.println("Paying Payment through " + "Debit Card");
	}
	
}

class PaymentServiceSP{
	private PaymentMethod paymentMethod;
	
	public void setPaymentMethod(PaymentMethod method) {
		this.paymentMethod = method;
	}
	
	public void pay() {
		this.paymentMethod.processPayment();
	}
}

public class StrategyPattern {
	public static void main(String[] args) {
		PaymentServiceSP ps = new PaymentServiceSP();
		ps.setPaymentMethod(new CreditCard());
		ps.pay();
	}

	
}
