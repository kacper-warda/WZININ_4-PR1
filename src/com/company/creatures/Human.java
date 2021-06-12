package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    private static final String HUMAN_SPECIES = "homo sapiens";

    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    public Car car;
    private Double salary;
    public Double cash = 200.0;

    public Human(String lastName) {
        super(HUMAN_SPECIES);
        this.lastName = lastName;
    }

    public Double getSalary() {
        //logika
        //sprawdzenie uprawnień
        //pobranie wartości z cache
        //pobranie z bazy danych
        //logi
        //konwersja jednostek
        return salary;
    }

    public void setSalary(Double salary) {
        //logika
        //walidacje
        //logi
        //zapis do bazy danych
        //komunikacja z innymi systemami
        //wysłanie powiadomień
        //czyszczenie cache
        //przeliczenie jednostek
        this.salary = salary;
    }
}
