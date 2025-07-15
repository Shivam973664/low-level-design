package statepattern.good;

//It will contain the context of our application
public class DirectionService {

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

