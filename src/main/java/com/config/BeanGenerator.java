package com.config;

import com.entities.Guarantor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanGenerator {
    public Guarantor getGuarantor(){
        return new Guarantor();
    }
}
