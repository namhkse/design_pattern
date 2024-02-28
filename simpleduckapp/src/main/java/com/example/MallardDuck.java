package com.example;

public class MallardDuck extends Duck {
    public MallardDuck() {
        name = "Mallard Duck";
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
