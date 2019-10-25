package com.services;

import com.config.BeanGenerator;
import com.dao.GuarantorsRepository;
import com.factory.AbstractFactory;
import com.factory.ProducerFactory;
import com.models.Guarantor;
import com.models.GuarantorID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GuanrantorServices implements GuarantorServicesInterface {

    @Autowired
    GuarantorsRepository guarantorsRepository;

    BeanGenerator beanGenerator;

    @Override
    public String addGuarantor(Guarantor payload){
        beanGenerator.getGuarantor().fullname = payload.fullname;
        guarantorsRepository.save(beanGenerator.getGuarantor());
        return "successfully";
    }

    @Override
    public String deleteGuarantor(GuarantorID payload){
        guarantorsRepository.deleteById(payload.Id);
        return "successfull";
    }

    @Override
    public String editGuarantor(Guarantor payload){
        Optional<com.entities.Guarantor> result = guarantorsRepository.findById(payload.Id);

        if (result.isEmpty()) return "unsuccessfull";

        com.entities.Guarantor aGuarantor = result.get();
        aGuarantor.fullname = payload.fullname;
        guarantorsRepository.save(aGuarantor);

        return "successfully";
    }

    @Override
    public List<Guarantor> getGuarantor(GuarantorID payload){

        //Abstract factory partern
        AbstractFactory anEntity = ProducerFactory.getGuarantor();
        Guarantor aGuarantor = anEntity.getGuarantorObj();

        com.entities.Guarantor result = guarantorsRepository.findById(payload.Id).get();
        aGuarantor.fullname = result.fullname;
        aGuarantor.Id = result.Id;

        List<Guarantor> dResult = new ArrayList<>();
        dResult.add(aGuarantor);

        return dResult;
    }

}





















































