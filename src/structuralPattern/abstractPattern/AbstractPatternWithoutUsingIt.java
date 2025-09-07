package structuralPattern.abstractPattern;


interface NotificationService{
	public void send(String from , String to , String text);
}

class EmailNotificationService implements NotificationService{
	
	public void send(String from , String to , String textContent) {
		System.out.println("Mail From : " + from);
		System.out.println("Mail To : " + to );
		System.out.println("Text Content " + textContent);
	}
	
}


public class AbstractPatternWithoutUsingIt {

	public static void main(String[] args) {
		NotificationService notificationService = new EmailNotificationService();
		String text = """
				 We can use actual eamail notification in plain java.
				but we have to add library in the class path jakrata . 
				then we have use the Session and Message instance and properties to set the properties
				and send the mail.
				""";
		notificationService.send("shivam", "satyam", text);
		
	}

}
