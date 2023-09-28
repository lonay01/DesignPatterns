package org.example.differentDucks;

import org.example.*;

public class MuteDuck extends Duck {

    public MuteDuck() {
        this.flyBehavior = new CantFly();
        this.quackBehavior = new CantQuack();
    }

}
