package client;

import factories.AbstractFactory;
import factories.ConcreteFactory1;

public class Client {

	public static void main(String[] args) {

		AbstractFactory abstractFactory1 = new ConcreteFactory1();

	}

}