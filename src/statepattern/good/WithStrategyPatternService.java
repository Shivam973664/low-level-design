package statepattern.good;

public class WithStrategyPatternService {

	public static void main(String[] args) {
		DirectionService directionService = new DirectionService(new CyclingConcreteClass());
		
		printtheData(directionService);
		
		directionService.setState(new CarConcreteClass());
		printtheData(directionService);
		
	}
	
	public static void printtheData(DirectionService directionService) {
		System.out.println("Direction is " + directionService.getDirection());
		System.out.println("Distance is " + directionService.getDistance());
		
	}
}
