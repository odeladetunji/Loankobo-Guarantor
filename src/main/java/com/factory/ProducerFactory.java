package com.factory;

public class ProducerFactory {
    public static AbstractFactory getGuarantor(){
        return new EntityFactory();
    }
}


