package dip.good;

public class NotificationService {

	//@Qualifier("smsNotificationService")
	private NotificationChannel notificationChannel;
	
	public NotificationService(NotificationChannel notificationChannel) {
		this.notificationChannel= notificationChannel;
	}
	
	public void sendNotification(String msg) {
		this.notificationChannel.send(msg);
	}

}
