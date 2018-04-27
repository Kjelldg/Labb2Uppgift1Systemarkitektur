package client;

import factories.*;
import products.*;

public class Client {

	public static void main(String[] args) {

		AbstractFactory factory1 = new ConcreteFactory1();
		AbstractFactory factory2 = new ConcreteFactory2();

		AbstractProductA A1 = factory1.createProductA();
		AbstractProductB B1 = factory1.createProductB();

		AbstractProductA A2 = factory2.createProductA();
		AbstractProductB B2 = factory2.createProductB();

	}

}