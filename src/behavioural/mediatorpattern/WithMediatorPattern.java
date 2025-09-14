package behavioural.mediatorpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class ChatUser{
	private String name;
	private ChatMediator chatMediator;
	
	public String getName() {
		return name;
	}
	
	public ChatMediator getChatMediator() {
		return this.chatMediator;
	}
	
	public void recieveMessage(ChatUser sender, String msg) {
		System.out.println(this.name + " recieved message : " + msg + " from "+ sender.getName());
	}
	
	public ChatUser(String name, ChatMediator chatMediator) {
		this.name = name;
		this.chatMediator = chatMediator;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChatUser other = (ChatUser) obj;
		return Objects.equals(name, other.name);
	}
}

//ChatMediator
interface ChatMediator{
	public void sendMessage(String  message, ChatUser sender);
	
	//Whenever we are using interface make sure it contains all the method its childs have
	//you can use default method for not making changing in all other implementation classes
	//just checking we can use default message in the interface and then overide it or not 
	public default void addUser(ChatUser u) {
		
	}
}


class MediatorImplementation implements ChatMediator{
	private List<ChatUser> userIIs = new ArrayList<>();
	
	public void addUser(ChatUser u) {
		userIIs.add(u);
	}
	
	public void sendMessage(String msg, ChatUser sender) {
		System.out.println(sender.getName()+ " Sending message");
		for(ChatUser userII : userIIs) {
			if(!userII.equals(sender)) {
				userII.recieveMessage(sender, msg);
			}
		}
		
	}
}

public class WithMediatorPattern {

	
	
	public static void main(String[] args) {
		ChatMediator mediator = new MediatorImplementation();
		ChatUser u1 = new ChatUser("Rahul",mediator);
		ChatUser u2 = new ChatUser("Rohit",mediator);
		ChatUser u3 = new ChatUser("Rakesh",mediator);
		
		Scanner scnr = new Scanner(System.in);
		String msg = scnr.nextLine();
		
		
		mediator.addUser(u1);
		mediator.addUser(u2);
		mediator.addUser(u3);
		
		u1.getChatMediator().sendMessage(msg, u1);
	}

}
