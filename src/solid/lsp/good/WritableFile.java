package solid.lsp.good;

public class WritableFile extends ReadableFile implements Writable {

	public void writeFile() {
		System.out.println("Writing on file");
	}
}
