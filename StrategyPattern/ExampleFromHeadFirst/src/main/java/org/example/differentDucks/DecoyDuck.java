package org.example.differentDucks;

import org.example.*;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.flyBehavior = new CantFly();
        this.quackBehavior = new CantQuack();
    }
}
