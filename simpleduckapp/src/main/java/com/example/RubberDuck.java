package com.example;

public class RubberDuck extends Duck {
    public RubberDuck() {
        name = "Rubber Duck";
        flyBehavior = new FlyWithRocket();
        quackBehavior = new Squeak();
    }
}
