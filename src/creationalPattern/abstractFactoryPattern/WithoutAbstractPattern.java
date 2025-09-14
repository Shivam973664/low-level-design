package creationalPattern.abstractFactoryPattern;

class WindowScrollBar{
	public void scroll() {
		System.out.println("Windows Scroll Bar");
	}
}

class WindowButton {
	public void render() {
		System.out.println("Windows Button ");
	}
}

class MacOsScrollBar{
	public void scroll() {
		System.out.println("MacOs Scroll Bar");
	}
}

class MacOsButton {
	public void render() {
		System.out.println("MacOs Button ");
	}
}

public class WithoutAbstractPattern {

	public static void main(String[] args) {
		//first problem : here client can create instance of one Mac and other Windows which
		//should not happen
		MacOsButton macosButton = new MacOsButton();
		WindowScrollBar winScroll = new WindowScrollBar();
		
		macosButton.render();
		winScroll.scroll();
		
		//second problem : tight coupling of the Class with the client logic 
	}

}
