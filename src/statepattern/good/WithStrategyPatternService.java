package statepattern.good;


///It is interface which will represent current state
//The State interface defines the methods for different states of Navigation System
interface TransportationModeState {

	public String getDirection();
	
	public int getDistance();
}


class CarConcreteClass implements TransportationModeState{

	@Override
	public String getDirection() {
		return "Go Forward Direction";
	}

	@Override
	public int getDistance() {
		return 5;
	}
}


class CyclingConcreteClass implements TransportationModeState{

	@Override
	public String getDirection() {
		return "Go Backward Direction" + "Use Cycle path";
	}

	@Override
	public int getDistance() {
		return 10;
	}

}

class WalkingConcreteClas implements TransportationModeState{

	@Override
	public String getDirection() {
		return "Go Right Direction" + "Use Walking path";
	}

	@Override
	public int getDistance() {
		return 15;
	}

}



//It will contain the context of our application
class DirectionService {

	private TransportationModeState state;
	
	public DirectionService(TransportationModeState state) {
		this.state = state;
	}
	
	public void setState(TransportationModeState state) {
		this.state = state;
	}
	
	public int getDistance() {
		return this.state.getDistance();
	}
	
	public String getDirection() {
		return this.state.getDirection();
	}
}




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
