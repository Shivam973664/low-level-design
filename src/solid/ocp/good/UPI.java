package solid.ocp.good;

public class UPI implements PaymentMethod {

	public void pay(double amount) {
		System.out.println("Paying using UPI Method : "+ amount);
	}

}
