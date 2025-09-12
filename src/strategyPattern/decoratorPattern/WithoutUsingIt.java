package strategyPattern.decoratorPattern;




//the main problem here is
//1. class explosion : means we have so many classes for each combination
//2. harder to maintain and test : due to so many classes
//3. scalability issue

interface Pizza{
	public String getDescription();
	
	public double getPrice();
}

class BasicPizza implements Pizza{

	@Override
	public String getDescription() {
		return """
				Basic Pizza""";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 5;
	}
	
}

class CheesePizza extends BasicPizza{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + " With Chesse";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + 1.00;
	}
	
}

class CheeseOlivePizza extends CheesePizza{
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + " With Olive";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + 0.50;
	}
	
}


//client code
public class WithoutUsingIt {
	public static void main(String[] args) {
		Pizza pizza = new CheeseOlivePizza();
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getPrice());
	}
	

	

}
