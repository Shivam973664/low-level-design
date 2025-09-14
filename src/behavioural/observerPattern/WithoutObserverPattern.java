package behavioural.observerPattern;

//what if it is different type of devices then we have to create different devices class in the WS class
class DisplayDevice{
	
	public void showTemperature(double temp) {
		System.out.println("Current Temperature is : "+ temp);
	}
}

class WeatherStation{
	private double temperature;
	
	//there can be multiple such display devices
	private DisplayDevice displayDevice;
	
	//WS need to know about the devices it is connected to it.
	//due to which it example of Tight Coupling
	public WeatherStation(DisplayDevice ds) {
		this.displayDevice = ds;
	}
	public void setTemperature(double temp) {
		this.temperature = temp;
		notifyDevices();
	}
	
	
	//WS is notifying all stations
	public void notifyDevices() {
		this.displayDevice.showTemperature(temperature);
	}
}


public class WithoutObserverPattern {

	public static void main(String[] args) {
		WeatherStation weathersation = new WeatherStation(new DisplayDevice());
		weathersation.setTemperature(19);
	}

}


