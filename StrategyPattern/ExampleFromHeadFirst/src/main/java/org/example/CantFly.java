package org.example;

public class CantFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("CantFly");
    }
}

