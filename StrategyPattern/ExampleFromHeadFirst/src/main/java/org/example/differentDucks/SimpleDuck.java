package org.example.differentDucks;

import org.example.*;

public class SimpleDuck extends Duck {
    public SimpleDuck() {
        this.flyBehavior = new CanFly();
        this.quackBehavior = new CanQuack();
    }
}
