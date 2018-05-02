package client;

import factories.*;
import products.*;

public class Client {

	public static void main(String[] args) {

		AbstractFactory factory1 = new ConcreteFactory1();
		AbstractFactory factory2 = new ConcreteFactory2();

		AbstractProductA productA1 = factory1.createProductA();
		AbstractProductB productB1 = factory1.createProductB();

		AbstractProductA productA2 = factory2.createProductA();
		AbstractProductB productB2 = factory2.createProductB();

	}

}