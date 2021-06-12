package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human("Warda");
        Car passat1 = new Car("vw", "passat", 1992);
        passat1.millage = 80000.0;
        Car passat2 = new Car("vw", "passat", 2008);
        passat2.millage = 80000.0;

        Animal szarik = new Animal("dog");
        me.pet = szarik;

        Human brotherInLow = new Human("Grygo");
        szarik.sell(me, brotherInLow, 100.0);


        System.out.println(me.cash);
        System.out.println(brotherInLow.cash);
        System.out.println(me.pet);
        System.out.println(brotherInLow.pet);

        Human someOtherHuman = new Human("Kowalski");
        me.pet = someOtherHuman;
        someOtherHuman.sell(me, brotherInLow, 5.0);
    }
}
