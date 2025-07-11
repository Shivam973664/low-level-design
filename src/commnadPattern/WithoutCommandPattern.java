package commnadPattern;


class TextEditor{
	public void boldText() {
		System.out.println("Text has been bolded.");
	}
	public void italacizeText() {
		System.out.println("Text has been italacized text.");
	}
	public void underlineText() {
		System.out.println("Text has been underlined.");
	}
}

///UI button Classes
class BoldButton{
	private TextEditor textEditor;
	
	public BoldButton(TextEditor editor) {
		this.textEditor = editor;
	}
	
	public void click() {
		textEditor.boldText();
	}
}

class ItalicButton{
	private TextEditor textEditor;
	
	public ItalicButton(TextEditor editor) {
		this.textEditor = editor;
	}
	
	public void click() {
		textEditor.italacizeText();
	}
}

class UnderlineButton{
	private TextEditor textEditor;
	
	public UnderlineButton(TextEditor editor) {
		this.textEditor = editor;
	}
	
	public void click() {
		textEditor.underlineText();
	}
}


public class WithoutCommandPattern {

	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		BoldButton button = new BoldButton(editor);
		ItalicButton italicButton = new ItalicButton(editor);
		italicButton.click();
		button.click();
		
		
	}
}
