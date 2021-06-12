package com.company.creatures;

import com.company.Saleable;

public class Animal implements Saleable {
    final public String species;
    String name;
    private Double weight;

    public Animal(String species) {
        this.species = species;

        switch (this.species) {
            case "dog":
                this.weight = 10.2;
                break;
            case "cat":
                this.weight = 2.0;
                break;
            default:
                this.weight = 1.0;
        }
    }

    public void feed() {
        if (this.weight > 0) {
            this.weight += 1.0; //weight = weight + 1.0
            System.out.println("thx for food, my weight: " + this.weight);
        } else {
            System.out.println("tera to trochę późno :|");
        }
    }

    public void takeForAWalk() {
        if (this.weight > 0) {
            this.weight -= 0.2;
            System.out.println("thx, nice walk, my weight: " + this.weight);
        } else {
            System.out.println("nie można łazić z martwym zwierzakiem po ulicy :|");
        }
    }

    public void printName() {
        System.out.println("my name is: " + this.name);
    }

    void printNameAndOwner(String owner) {
        System.out.println(owner + " has " + this.name);
    }

    Double getWeight() {
        return this.weight;
    }

    String getNameAndOwner(String owner) {
        return owner + " has " + this.name;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("HALO POLICJA!");
        }
        if (seller.pet != this) {
            throw new Exception("sorry nie masz zwierzaka");
        }
        if (buyer.cash < price) {
            throw new Exception("sorry kupującego nie stać");
        }
        buyer.pet = this;
        seller.pet = null;
        buyer.cash -= price;
        seller.cash += price;
        System.out.println("udało się sprzedać");
    }
}
