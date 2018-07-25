package com.company;

public class ConcreteFactoryY implements AbstractFactory {
    public ProductA CreateProductA(){
        return new ProductAY();
    }
    public ProductB CreateProductB(){
        return new ProductBY();
    }
}
