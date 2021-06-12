package com.company.devices;

public class Phone extends Device implements Rechargeable {
    public Double screenSize;
    public String os;

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("wciśnij przycisk");
        System.out.println("poczekaj");
        System.out.println("poczekaj");
        System.out.println("poczekaj");
        System.out.println("zacznij szukać ładowarki");
        System.out.println("o jednak się włączyło");
    }

    @Override
    public void recharge() {
        System.out.println("ładuję");
    }

    @Override
    public void rechargeFull() {
        System.out.println("ładuję do pełna");
    }

    @Override
    public Double getBatteryLevel() {
        return 0.1;
    }


}
