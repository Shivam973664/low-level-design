package behavioural.memento;

import java.util.Optional;

public class TextEditorMain {

	
	public static void main(String[] args) {
		
//		withoutContentHistoryClass();
		withContentHistoryClass();
		
	}
	
	public static void withContentHistoryClass() {
		TextEditor textEditor = new TextEditor();
		textEditor.writeText("SO we are thinking to change the process");
		EditorMemento maintainHistory = new EditorMemento();
		maintainHistory.writeContent(textEditor);
		textEditor.writeText("We are changing the process");
		maintainHistory.writeContent(textEditor);
		maintainHistory.undo();
		Optional<TextEditor> lastStage = maintainHistory.readContent();
		if(!lastStage.isEmpty()) {
			System.out.println(lastStage.get().getContent());
		}
		//if we want to undo to previous content it is not possible right now.
//		System.out.println(textEditor.getContent());
	}

	public static void withoutContentHistoryClass() {
		TextEditor textEditor = new TextEditor();
		textEditor.writeText("SO we are thinking to change the process");
		
		textEditor.writeText("We are changing the process");
		//if we want to undo to previous content it is not possible right now.
		System.out.println(textEditor.getContent());
	}
}
