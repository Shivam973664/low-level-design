package behavioural.memento.byCourseWay;

public class TextEditorMain {

	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor();
		CareTaker caretaker = new CareTaker();
		textEditor.writeText("We are using this");
		caretaker.saveState(textEditor);
		
		textEditor.writeText("to make something");
		caretaker.saveState(textEditor);
		
		System.out.println(textEditor.getContent());
		
		caretaker.undo(textEditor);
		
		System.out.println(textEditor.getContent());
		
	}
}
