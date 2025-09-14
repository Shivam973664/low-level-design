package solid.dip.good;

public class EmailNotificationService implements NotificationChannel{
	

	@Override
	public void send(String msg) {
		System.out.println("Sending Email : "+ msg);
	}
}
