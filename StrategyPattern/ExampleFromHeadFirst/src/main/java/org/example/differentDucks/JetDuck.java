package org.example.differentDucks;

import org.example.*;

public class JetDuck extends Duck {

    public JetDuck() {
        this.flyBehavior = new JetFly();
        this.quackBehavior = new Squeak();
    }

}
