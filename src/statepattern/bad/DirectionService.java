package statepattern.bad;

import statepattern.TransportationMode;

public class DirectionService {

	private TransportationMode mode;
	
//	public DirectionService(TransportationMode mode) {
//		this.mode = mode;
//	}
	
	public void setMode(TransportationMode mode) {
		this.mode = mode;
	}

	//get estimated time of arrival between two points 
	//the point lets suppose constant based 
	// on transport mode it will change
	public int getETA() {
		return switch(mode) {
		case CYCLING -> {
			System.out.println("By " + mode+ " " + 10);
			yield 10;
		}
		case WALKING -> {
			System.out.println("By " + mode+ " " + 15);
			yield 15;
		}
		case CAR -> {
			System.out.println("By " + mode+ " " + 5);
			yield 15;
		}
		default -> {
			System.out.println("there is no route between two nodes");
			yield 0;
		}
		};
	}
	
	public String getDirection() {
		return switch(mode) {
		case WALKING -> "Walk forward Direction";
		case CYCLING -> "Walk BackWard Direction";
		case CAR -> "Walk Right Direction";
		default -> "There is no Such Transportation is supported";
		};
	}
}
