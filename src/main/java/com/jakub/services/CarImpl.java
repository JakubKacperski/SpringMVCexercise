package com.jakub.services;

import org.springframework.stereotype.Service;

@Service
public class CarImpl implements Car {
    public static final String CAR = "audi";
    @Override
    public String getCar() {
        return CAR;
    }
}
