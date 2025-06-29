package behavioural.memento.byCourseWay;

//this is memento class to capture the state of the TextEditor
public class EditorMemento {

	private final String content;
	
	public EditorMemento(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
