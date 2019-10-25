package com.services;

import com.models.Guarantor;
import com.models.GuarantorID;

import java.util.List;

public interface GuarantorServicesInterface {
    String addGuarantor(Guarantor payload);
    String deleteGuarantor(GuarantorID payload);
    String editGuarantor(Guarantor payload);
    List<Guarantor> getGuarantor(GuarantorID payload);
}























