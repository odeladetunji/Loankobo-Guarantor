package com.controllers;

import com.models.Guarantor;
import com.models.GuarantorID;
import com.services.GuarantorServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Guarantors {

    @Autowired
    GuarantorServicesInterface guarantorServicesInterface;

    @ResponseBody
    @GetMapping(path = "/")
    public String ping(){
        return "ping successfull";
    }

    @ResponseBody
    @PostMapping(path = "/addGuarantor")
    public String addGuarantor(Guarantor payload){
       return guarantorServicesInterface.addGuarantor(payload);
    }

    @ResponseBody
    @PostMapping(path = "/getGuarantor")
    public List<Guarantor> getGuarantor(GuarantorID payload){
        return guarantorServicesInterface.getGuarantor(payload);
    }

    @ResponseBody
    @PostMapping(path = "/editGuarantor")
    public String editGuarantor(Guarantor payload){
        return guarantorServicesInterface.editGuarantor(payload);
    }

    @ResponseBody
    @PostMapping(path = "/deleteGuarantor")
    public String deleteGuarantor(GuarantorID payload){
        return guarantorServicesInterface.deleteGuarantor(payload);
    }
}
