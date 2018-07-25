package com.company;

public class Client {

    public static void main(String[] args) {


	AbstractFactory factoryX = new ConcreteFactoryX();
	AbstractFactory factoryY = new ConcreteFactoryY();

	ProductA productAX = factoryX.CreateProductA();
    ProductB productBX = factoryX.CreateProductB();
    ProductA productAY = factoryX.CreateProductA();
    ProductB productBY = factoryY.CreateProductB();

    }
}
