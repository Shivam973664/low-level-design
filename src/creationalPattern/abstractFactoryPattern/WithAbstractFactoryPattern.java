package creationalPattern.abstractFactoryPattern;


//*Abstract Product Interface
interface Button{
	public void render();
}

interface ScrollBar{
	public void scroll();
}



class WindowButtonI implements Button{

	@Override
	public void render() {
		System.out.println("Rendering by Windows Button ");
		
	}
	
}

class MacOsButtonI implements Button{

	@Override
	public void render() {
		System.out.println("Rendering by MacOs Button");
		
	}
	
}

class MacOsScrollBarI implements ScrollBar{

	@Override
	public void scroll() {
		System.out.println("Scrolling by MacOs ScrollBar");
		
	}
	
}


class WindosScrollBar implements ScrollBar{

	@Override
	public void scroll() {
		System.out.println("Scrolling by Windows ScrollBar");
		
	}
	
}


//Abstract Factory Interface
interface UIFactory{
	Button createButton();
	ScrollBar createScrollBar();
}

//concrete Implementation
class WindowFactory implements UIFactory{

	@Override
	public Button createButton() {
		return new WindowButtonI();
	}

	@Override
	public ScrollBar createScrollBar() {
		// TODO Auto-generated method stub
		return new WindosScrollBar();
	}
	
}

class MacOsFactory implements UIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacOsButtonI();
	}

	@Override
	public ScrollBar createScrollBar() {
		// TODO Auto-generated method stub
		return new MacOsScrollBarI();
	}
	
}


public class WithAbstractFactoryPattern {

	private Button button;
	private ScrollBar scrollbar;
	
	public void renderUI() {
		this.button.render();
		this.scrollbar.scroll();
	}
	
	public WithAbstractFactoryPattern(UIFactory uifactory) {
		this.button = uifactory.createButton();
		this.scrollbar = uifactory.createScrollBar();
	}
	
	public static void main(String[] args) {
		UIFactory uifactory = new WindowFactory();
		WithAbstractFactoryPattern application = new WithAbstractFactoryPattern(uifactory);
		application.renderUI();
	}

}
