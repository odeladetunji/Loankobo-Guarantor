package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Guarantors {

    @ResponseBody
    @GetMapping(path = "/")
    public String ping(){
        return "ping successfull";
    }
}
