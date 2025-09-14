package solid.dip.good;

public class Main {

	public static void main(String[] args) {
		
		NotificationChannel byEmail = new EmailNotificationService();
//		byEmail= new SmsNotificationService();
		
		NotificationService byEmailNot= new NotificationService(byEmail);
		byEmailNot.sendNotification("We are using EMail");
		
		
	}

}
