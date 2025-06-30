package observerPattern;

import java.util.ArrayList;
import java.util.List;

//Observer Interface
interface Observer{
	public void update(double temperature) ;
}

//Subject Interface
interface Subject{
//	public void addObserver(Observer obs);
	public void attachObserver(Observer obs);
	
//	public void removeObserver(Observer obs);
	public void detach(Observer obs);
	
	public void notifyObservers();
}

//for the Subject the Concrete class is an WeatherStation
class WeatherStationIn implements Subject{
	
	private double temperature;
	
	List<Observer> observerList ;
	
	public WeatherStationIn() {
		this.observerList = new ArrayList<>();
	}
	
	@Override
	public void attachObserver(Observer obs) {
		this.observerList.add(obs);
		
	}

	@Override
	public void detach(Observer obs) {
		this.observerList.remove(obs);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer bean : this.observerList) {
			bean.update(temperature); // Run time Polymorphism
		}
		
		
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
		this.notifyObservers();
	}
	
}

class DisplayDeviceIn implements Observer {

	@Override
	public void update(double temperature) {
		System.out.println("Temperature on Display Devices : " + temperature);
		
	}
	
}

class MobileDevice implements Observer{

	@Override
	public void update(double temperature) {
		System.out.println("Temperature on Mobile Devices : " + temperature);
	}
	
}

public class ObserverPatternExample {
	public static void main(String[] args) {
		//Create Subscribers
		DisplayDeviceIn display = new DisplayDeviceIn();
		Observer mobileDevice = new MobileDevice();
		
		//Creating a Publisher
		WeatherStationIn weatherStation = new WeatherStationIn();
		
		
		
		//Attaching the Devices
		weatherStation.attachObserver(mobileDevice);
		weatherStation.attachObserver(display);
		//set the temperature
		weatherStation.setTemperature(132);
//		weatherStation.notifyObservers();
		
		///detaching device
		weatherStation.detach(mobileDevice);
		weatherStation.setTemperature(23);
	}
//	weatherStation.
	

}
