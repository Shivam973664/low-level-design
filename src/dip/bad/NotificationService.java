package dip.bad;

public class NotificationService {

	//issue in this service
	//first of all it is tightly coupled. if we change the name of the method sendEmails then we also need to change here
	//it is less flexible : if we add new service lets suppose whatsappservice then we also need to make changes here.
	//testing is difficult : since the implementation of the service is written somewhere 
	//this is the example of high level module NotificationService which is depended upon low level module i.e emailNotificationService
	
	private EmailNotificationService emailNotificationService;
	
	private SmsNotificationService smsNotificationService;
	
	public NotificationService() {
		this.emailNotificationService = new EmailNotificationService();
		this.smsNotificationService = new SmsNotificationService();
	}
	
	public void sendEmail(String msg) {
		this.emailNotificationService.sendEmail(msg);
	}
	
	public void sendMsg(String msg) {
		this.smsNotificationService.sendMessage(msg);
	}

}
