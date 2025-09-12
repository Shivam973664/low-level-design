package strategyPattern.decoratorPattern;


interface Pizza1{
	public String getDescription();
	
	public double getCost();
}


class BasicPizza1 implements Pizza1{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Basic Pizza ";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 5;
	}
	
}

abstract class PizzaDecorator implements Pizza1{

	protected Pizza1 pizza1;

	PizzaDecorator(Pizza1 pizza1){
		this.pizza1 = pizza1;
	}
	
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  pizza1.getDescription();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza1.getCost();
	}
	
}

class CheeseDecorator extends PizzaDecorator {

	CheeseDecorator(Pizza1 pizza1) {
		super(pizza1);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + "Cheese ";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 1.00;
	}
	
	
	
}

class OliveDecorator1 extends PizzaDecorator {

	OliveDecorator1(Pizza1 pizza1) {
		super(pizza1);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + "Olive ";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 0.5;
	}
	
	
	
}


class MushroomDecorator1 extends PizzaDecorator {

	MushroomDecorator1(Pizza1 pizza1) {
		super(pizza1);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + "Mushroom ";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 2.0;
	}
	
	
	
}

public class PizzaApplication {

	public static void main(String[] args) {
		Pizza1 pizza = new BasicPizza1();
		pizza = new MushroomDecorator1(pizza);
		pizza = new CheeseDecorator(pizza);
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}

}
