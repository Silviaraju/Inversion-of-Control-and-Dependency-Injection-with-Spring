package com.example.iocanddidemo.impl;

import com.example.iocanddidemo.interfaces.Demointerface;
import org.springframework.stereotype.Component;

@Component
public class DemoImpl implements Demointerface {


    @Override
    public String checkIocAndDi() {
        return "Hello there! this is my first Ioc and Di project";

    }
}
