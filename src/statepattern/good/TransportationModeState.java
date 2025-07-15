package statepattern.good;


///It is interface which will represent current state
//The State interface defines the methods for different states of Navigation System
public interface TransportationModeState {

	public String getDirection();
	
	public int getDistance();
}
