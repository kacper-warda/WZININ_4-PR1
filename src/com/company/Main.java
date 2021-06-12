package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("Warda");
        Car passat1 = new Car("vw", "passat", 1992);
        passat1.millage = 80000.0;
        Car passat2 = new Car("vw", "passat", 2008);
        passat2.millage = 80000.0;

        Car passat3 = passat1;

        System.out.println(passat1 == passat2);
        System.out.println(passat1);
        System.out.println(passat2);
        System.out.println(passat1 == passat3);
        System.out.println(passat1.equals(passat2));
        System.out.println(passat1.equals(me));

        me.setSalary(123123.2);

        me.feed();
        me.takeForAWalk();
        System.out.println(me.species);
        me.printName();

        System.out.println(me instanceof Animal);
        System.out.println(me instanceof Human);
        System.out.println(me instanceof Object);

        me.hashCode();
        try {
            passat1.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
