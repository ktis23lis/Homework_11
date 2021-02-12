package com.company;

public class Fruit  <N extends Number> {
    public N weight;

    public N getWeight() {
        return weight;
    }

    public void setWeight(N weight) {

        this.weight = weight;
    }
}
