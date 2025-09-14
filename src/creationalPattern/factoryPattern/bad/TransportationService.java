package creationalPattern.factoryPattern.bad;

public class TransportationService {

	public static void main(String[] args) {
		//car and bus are the instance
		//this service is just like client and
		//this is tightly coupled with the type of instances or the concrete classes
		Vechile car = new Car();
		Vechile bus = new Bus();
		
		
	}

}
