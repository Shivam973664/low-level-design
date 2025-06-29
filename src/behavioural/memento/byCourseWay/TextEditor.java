package behavioural.memento.byCourseWay;

public class TextEditor{
	
	private String content;
	
	public void writeText(String content) {
		this.content= content;
	}
	
	public String getContent() {
		return this.content;
	}
	
	//setting the current value in the new instance of Memento class
	public EditorMemento save() {
		return new EditorMemento(content);
	}
	
	//we are restoring the value passed into the parameter
	public void restore(EditorMemento editorMemento) {
		this.content = editorMemento.getContent();
	}
}
