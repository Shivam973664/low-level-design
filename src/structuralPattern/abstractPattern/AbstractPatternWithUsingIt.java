package structuralPattern.abstractPattern;



//legacy service
interface NotificationService2{
	public void send(String from , String to , String text);
}

//legacy code 
class EmailNotificationService2 implements NotificationService2{
	
	public void send(String from , String to , String textContent) {
		System.out.println("Mail From : " + from);
		System.out.println("Mail To : " + to );
		System.out.println("Text Content " + textContent);
	}
	
}

class SendGridService {
	public void sendEmail(String from, String to , String textContent, String title) {
		System.out.println("Mail From : " + from);
		System.out.println("Mail To : " + to );
		System.out.println("Text Content " + textContent);
		System.out.println("Title of the mail is " + title);
	}
}

//adapter class that will became bridge between our new implementation and old implementation
class SendGridAdapter implements NotificationService2{
	
	//we will create the instance of that SendGrid
	private SendGridService sendGridService;
	
	public SendGridAdapter(SendGridService sendGridServic) {
		this.sendGridService = sendGridServic;
	}

	@Override
	public void send(String from, String to, String text) {
		this.sendGridService.sendEmail(from, to, text, "Sending By SendGrid");
		
	}
	
}

//client code 
public class AbstractPatternWithUsingIt {

	public static void main(String[] args) {
		NotificationService2 notificationService = new EmailNotificationService2();
		String text = """
				 We can use actual eamail notification in plain java.
				but we have to add library in the class path jakrata . 
				then we have use the Session and Message instance and properties to set the properties
				and send the mail.
				""";
//		notificationService.send("shivam", "satyam", text);
		
		//by addapter way
		
		NotificationService2 not1 = new SendGridAdapter(new SendGridService());
		not1.send("shivam", "satyam", text);
		
	}

}
