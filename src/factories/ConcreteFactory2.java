package factories;

import products.*;

public class ConcreteFactory2 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		System.out.println("You have now printed the product A2. Congratulations.");

		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		System.out.println("You have now printed the product B2. Congratulations.");

		return new ProductB2();
	}

}