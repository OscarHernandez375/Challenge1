package com.company;

public class ConcreteFactoryX implements AbstractFactory {

    public ProductA CreateProductA(){
        return new ProductAX();
    }
    public ProductB CreateProductB(){
        return new ProductBX();
    }
}
