package behavioural.memento;


//It provides user to undo the changes like going back previous state of the text content.
//the textEditor stores the snapshot of the state(text content).
public class TextEditor implements Cloneable{
	//*by using constructor we can create copy of the instance 
//	public TextEditor(TextEditor editor ) {
//		this.content = editor.getContent();
//	}
	//*by clonning the current instance we can achieve this
	
	private String content;
	
	public void writeText(String content) {
		this.content= content;
	}
	
	public String getContent() {
		return this.content;
	}

	//by shallow clonning
	@Override
	protected TextEditor clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (TextEditor) super.clone();
	}
}
