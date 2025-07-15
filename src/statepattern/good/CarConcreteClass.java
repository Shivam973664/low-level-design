package statepattern.good;

public class CarConcreteClass implements TransportationModeState{

	@Override
	public String getDirection() {
		return "Go Forward Direction";
	}

	@Override
	public int getDistance() {
		return 5;
	}

	
	

}
