package commnadPattern;


interface Command{
	public void execute();
}

class TextEditorII{
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

//concrete class for Commands
class BoldCommand implements Command{

	private TextEditorII textEditor;
	
	public BoldCommand(TextEditorII textEditor) {
		this.textEditor = textEditor;
	}
	
	
	@Override
	public void execute() {
		this.textEditor.boldText();
	}
	
}

class ItalacizeCommand implements Command{

	private TextEditorII texteditor;
	
	public ItalacizeCommand(TextEditorII textEditor) {
		this.texteditor = textEditor;
	}
	
	@Override
	public void execute() {
		this.texteditor.italacizeText();
		
	}
	
}

//button class logic
class ButtonI{
	private Command command;
	
	public void setCommand(Command cmnd) {
		this.command = cmnd;
	}
	public void onClick() {
		this.command.execute();
	}
}

public class WithCommandPattern {
	public static void main(String[] args) {
		TextEditorII textEditor = new TextEditorII();
		BoldCommand bldCommand = new BoldCommand(textEditor);
		ItalacizeCommand italacizeCommand = new ItalacizeCommand(textEditor);
		//Decoupling : one button can do many types of action.
		ButtonI btn = new ButtonI();
		btn.setCommand(bldCommand);
		btn.onClick();
		
		btn.setCommand(italacizeCommand);
		btn.onClick();
	}
	
}
