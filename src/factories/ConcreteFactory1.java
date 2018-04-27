package factories;

import products.*;

public class ConcreteFactory1 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		System.out.println("You have now printed the product A1. Congratulations.");

		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		System.out.println("You have now printed the product B1. Congratulations.");

		return new ProductB1();
	}

}
