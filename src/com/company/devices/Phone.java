package com.company.devices;

public class Phone extends Device {
    public Double screenSize;
    public String os;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }
}
