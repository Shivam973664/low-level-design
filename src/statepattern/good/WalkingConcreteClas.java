package statepattern.good;

public class WalkingConcreteClas implements TransportationModeState{

	@Override
	public String getDirection() {
		return "Go Right Direction" + "Use Walking path";
	}

	@Override
	public int getDistance() {
		return 15;
	}

}
