package solid.isp.good;

import solid.isp.bad.Document;

public class MultiPurposeMachine implements Printer,Scanner,Copier{

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
