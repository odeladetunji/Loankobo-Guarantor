package com.factory;

public class ProducerFactory {
    public AbstractFactory getGuarantor(){
        return new EntityFactory();
    }
}
