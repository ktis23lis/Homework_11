package com.company;

public class Orange<N extends Number> extends Fruit {
    public  Number weightApple = 15.6f;


    @Override
    public Number getWeight() {
        return weightApple;
    }

    @Override
    public void setWeight(Number weightApple) {
        super.setWeight(weightApple);
    }
}

