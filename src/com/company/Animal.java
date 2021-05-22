package com.company;

public class Animal {
    final public String species;
    private Double weight;
    String name;

    public Animal(String species) {
        this.species = species;

        switch (this.species) {
            case "dog":
                this.weight = 10.2;
                break;
            case "cat":
                this.weight = 2.0;
                break;
            case "mouse":
                this.weight = 0.01;
                break;
            default:
                this.weight = 1.0;
        }
    }

    void feed() {
        if (this.weight > 0) {
            this.weight += 1.0; //weight = weight + 1.0
            System.out.println("thx for food, my weight: "+ this.weight);
        } else {
            System.out.println("tera to trochę późno :|");
        }
    }

    void takeForAWalk() {
        if (this.weight > 0) {
            this.weight -= 0.2;
            System.out.println("thx, nice walk, my weight: " + this.weight);
        }else {
            System.out.println("nie można łazić z martwym zwierzakiem po ulicy :|");
        }
    }

    void printName() {
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

}
