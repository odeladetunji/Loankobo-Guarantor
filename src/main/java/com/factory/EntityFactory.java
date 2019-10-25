package com.factory;

import com.models.Guarantor;

public class EntityFactory extends AbstractFactory {
    @Override
    public Guarantor getGuarantorObj(){
        return new Guarantor();
    }
}
