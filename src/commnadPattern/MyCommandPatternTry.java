package commnadPattern;

interface TextEditor1{
	public void clickEvent();
}

class BoldText implements TextEditor1{
	public void clickEvent() {
		System.out.println("Making Text bold");
	}
}

class Button{
	private TextEditor1 textEditor;
	
	public Button(TextEditor1 texteditor) {
		this.textEditor = texteditor;
	}
}

public class MyCommandPatternTry {

	

}
