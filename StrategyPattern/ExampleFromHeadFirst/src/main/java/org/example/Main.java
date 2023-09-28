package org.example;

import org.example.differentDucks.DecoyDuck;
import org.example.differentDucks.JetDuck;
import org.example.differentDucks.MuteDuck;
import org.example.differentDucks.SimpleDuck;

public class Main {
    public static void main(String[] args) {
        Duck sDuck = new SimpleDuck();
        Duck jDuck = new JetDuck();
        Duck mDuck = new MuteDuck();
        Duck dDuck = new DecoyDuck();

        sDuck.quack();
        jDuck.quack();
        mDuck.quack();
        dDuck.quack();

        jDuck.fly();

    }
}
