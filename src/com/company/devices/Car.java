package com.company.devices;

public class Car extends Device {
    public double millage;
    public String color;
    public double engineVolume;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("otwórz drzwi");
        System.out.println("klucz w stacyjkę");
        System.out.println("przekręć");
        System.out.println("poczeka aż silnik (mam nadzieję) zapali");
    }

    public Car(String producer, String model, Integer yearOfProduction, double millage, String color, double engineVolume) {
        super(producer, model, yearOfProduction);
        this.millage = millage;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public boolean equals(Object o) {
        if (o instanceof Car) {
            Car car = (Car) o;
            return car.producer.equals(this.producer)
                    && car.model.equals(this.model)
                    && car.millage == this.millage;


        } else {
            return false;
        }
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.color;
    }
}
