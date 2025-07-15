package statepattern.good;

public class CyclingConcreteClass implements TransportationModeState{

	@Override
	public String getDirection() {
		return "Go Backward Direction" + "Use Cycle path";
	}

	@Override
	public int getDistance() {
		return 10;
	}


}
