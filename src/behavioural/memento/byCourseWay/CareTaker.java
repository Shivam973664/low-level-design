package behavioural.memento.byCourseWay;

import java.util.Stack;

//Care
public class CareTaker {

	Stack<EditorMemento> contentHistory = new Stack<>();
	
	public void saveState(TextEditor textEditor) {
		this.contentHistory.push(textEditor.save());
	}
	
	public void undo(TextEditor textEditor) {
		if(!contentHistory.isEmpty()) {
			contentHistory.pop();
			textEditor.restore(contentHistory.peek());
		}
	}
}
