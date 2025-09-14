package creationalPattern.factoryPattern.good;

public class TransportationService {

	public static void main(String[] args) {
		Vechile car = TransportFactory.createInstance("car");
		car.deliverMessage();
	}

}
