package lsp.bad;


public class ReadOnlyFile extends FIle{

	@Override
	public void writeFile() {
		throw new UnsupportedOperationException("not supported Operation");
	}

}
