package com.company;

public class Apple extends Fruit{
    public  Number weightApple = 10.2f;


    @Override
    public Number getWeight() {
        return weightApple;
    }

    @Override
    public void setWeight(Number weightApple) {
        super.setWeight(weightApple);
    }
}
