package solid.lsp.bad;

public class Main {

	public static void main(String[] args) {
		FIle file = new ReadOnlyFile();
		file.readFile();
		file.writeFile();
		
	}
}
