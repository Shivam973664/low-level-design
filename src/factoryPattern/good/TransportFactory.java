package factoryPattern.good;

public class TransportFactory {

	public static Vechile createInstance(String type) {
		return switch(type.toLowerCase()) {
		case "car" -> new Car();
		case "bus" -> new Bus();
//		we cannot remove default statement
//		/ ❌ No default and not all possible values handled -> compile error
		default -> throw new IllegalArgumentException("No such vechile type is supported");
		};
	}
}
