package factories;

import products.AbstractProductA;
import products.AbstractProductB;

public abstract class AbstractFactory {

	public abstract AbstractProductA CreateProductA();

	public abstract AbstractProductB CreateProductB();

}
