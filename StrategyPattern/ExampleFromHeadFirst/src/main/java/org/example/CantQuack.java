package org.example;

public class CantQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("CantQuack");
    }
}
