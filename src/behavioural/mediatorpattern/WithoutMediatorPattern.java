package behavioural.mediatorpattern;

class User{
	private String name;

	
	public String getName() {
		return name;
	}

	
	public User(String name) {
		this.name = name;
	}
	
	public void sendMessage(String msg, User reciepent) {
		System.out.println(this.name + " to " + reciepent.getName() + " : " + msg);
	}
	
	
	
}


public class WithoutMediatorPattern {

	public static void main(String[] args) {
		
		
		User u1 = new User("Shivam");
		User u2 = new User("Sujeet");
		User u3 = new User("Shweta");
		u1.sendMessage("hello guys", u2);
		u1.sendMessage("hello guys", u3);

		//problems in above code
		// 1. each object should know about other recipient. (tightly coupled system)
		// 2. if we want to send new message than again we have to use the same line of code.
	}

}
