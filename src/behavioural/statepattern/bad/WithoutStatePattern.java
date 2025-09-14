package behavioural.statepattern.bad;

import behavioural.statepattern.TransportationMode;

public class WithoutStatePattern {

	public static void main(String[] args) {
		DirectionService directionService = new DirectionService();
		directionService.setMode(TransportationMode.CYCLING);
		
		System.out.println(directionService.getDirection());
		directionService.getETA();
	}

}
