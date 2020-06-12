package com.example.iocanddidemo.controller;

import com.example.iocanddidemo.impl.DemoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoImpl demoImpl;

    public DemoController(DemoImpl demoImpl){
        System.out.println("Hello");
        this.demoImpl = demoImpl;
        System.out.println("Heyyyy");
    }

    @GetMapping(value="/check")
    public String getData(){

        return demoImpl.checkIocAndDi();
    }

}
