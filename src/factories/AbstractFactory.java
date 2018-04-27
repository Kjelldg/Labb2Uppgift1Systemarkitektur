package factories;

import products.AbstractProductA;
import products.AbstractProductB;

public abstract class AbstractFactory {

	public abstract AbstractProductA createProductA();

	public abstract AbstractProductB createProductB();

}
