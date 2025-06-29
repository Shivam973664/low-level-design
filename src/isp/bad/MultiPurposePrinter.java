package isp.bad;

public class MultiPurposePrinter implements Machine{

	@Override
	public void print(Document d) {
		System.out.println("Machine is printing");
		
	}

	@Override
	public void scan(Document d) {
		System.out.println("Machine is Scanning");
		
	}

	@Override
	public void copy(Document d) {
		System.out.println("Machine is Copying");
		
	}

	

}
