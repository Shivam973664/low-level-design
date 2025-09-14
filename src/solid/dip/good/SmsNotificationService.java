package solid.dip.good;

public class SmsNotificationService implements NotificationChannel {

	public void send(String msg) {
		System.out.println("Sending Message : " + msg);
	}
	
}
