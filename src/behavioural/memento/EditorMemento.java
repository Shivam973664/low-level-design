package behavioural.memento;

import java.util.Optional;
import java.util.Stack;

public class EditorMemento {

	private Stack<TextEditor> contentHistory ;
	
	public EditorMemento() {
		this.contentHistory = new Stack<>();
	}
	
	public void writeContent(TextEditor editor) {
		try {
			TextEditor cloneObj = editor.clone();
			this.contentHistory.push(cloneObj);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
	
	public Optional<TextEditor> readContent() {
		if(this.contentHistory.isEmpty()) {
			return Optional.empty();
		}
		TextEditor editor = this.contentHistory.peek();
		return Optional.of(editor);
	}
	
	public void undo(){
		if(!this.contentHistory.isEmpty()) {
			this.contentHistory.pop();
		}
		
	}
}
